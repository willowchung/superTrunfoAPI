package br.edu.infnet.superTrunfoAPI.service;

import br.edu.infnet.superTrunfoAPI.model.Player;
import br.edu.infnet.superTrunfoAPI.model.Room;
import br.edu.infnet.superTrunfoAPI.model.dto.CreateRoomDTO;
import br.edu.infnet.superTrunfoAPI.model.dto.JoinRoomDTO;
import br.edu.infnet.superTrunfoAPI.repository.RoomRepository;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
@Transactional
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private PlayerService playerService;


    private final ExecutorService customObservableExecutor = Executors.newFixedThreadPool(10);

    private final ExecutorService futureExecutor = Executors.newFixedThreadPool(10);

    public Observable<Player> notifyJoinRoom(Long roomId) {
        return Observable.<Player>create(s -> {
            Room room = roomRepository.findById(roomId);

            if(room != null) {
                Player player = room.getPlayers().stream()
                        .filter(p -> !p.getName().equals(room.getCreator()))
                        .findFirst().orElse(null);
                if (player == null)
                    player = new Player();
                s.onNext(player);
            }
            s.onComplete();
        }).subscribeOn(Schedulers.from(customObservableExecutor));
    }

    public static List<Player> onlinePlayers = new ArrayList<>();

    public List<Room> getRooms() {
        List<Room> roomList = (List<Room>) roomRepository.findAll();

        if (roomList.isEmpty()) {
            return Arrays.asList(createFirstRoom());
        }
        return roomList;
    }

    private Room createFirstRoom() {
        Player player = playerService.fetchFirstPlayer();
        return createRoom(player, null, new BigDecimal(-22.906339), new BigDecimal(-43.177051));
    }

    private String randomRoomName() {
        return "Sala" + new Random().nextInt();
    }

    private Room createRoom(Player player, String roomName, BigDecimal latitude, BigDecimal longitude) {
        Room room = new Room();
        room.setName(roomName == null || roomName.isEmpty() ? randomRoomName() : roomName);
        room.setAvailable(true);
        room.setCreator(player.getName());
        room.setLatitude(latitude);
        room.setLongitude(longitude);
        room.setPlayers(new HashSet<Player>(Arrays.asList(player)));

        return roomRepository.save(room);
    }



    public Room createRoom(CreateRoomDTO dto) {
        Player player = playerService.findByNameOrCreateNewPlayer(dto.getPlayerName());
        return createRoom(player,dto.getRoomName(), dto.getLatitude(), dto.getLongitude());
    }

    public Room joinRoom(JoinRoomDTO dto) {
        Room room = roomRepository.findById(dto.getRoomId());

        if (room != null) {
            Set<Player> players = room.getPlayers();
            players.add(playerService.findByNameOrCreateNewPlayer(dto.getPlayerName()));
            room.setPlayers(players);
            return roomRepository.save(room);
        }

        throw null;
    }
}
