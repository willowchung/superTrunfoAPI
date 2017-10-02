package br.edu.infnet.superTrunfoAPI.service;

import br.edu.infnet.superTrunfoAPI.model.Player;
import br.edu.infnet.superTrunfoAPI.model.Room;
import br.edu.infnet.superTrunfoAPI.model.dto.createRoomDTO;
import br.edu.infnet.superTrunfoAPI.repository.PlayerRepository;
import br.edu.infnet.superTrunfoAPI.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.*;

@Service
@Transactional
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private PlayerRepository playerRepository;

    public static List<Player> onlinePlayers = new ArrayList<>();

    public List<Room> getRooms() {
        List<Room> roomList = (List<Room>) roomRepository.findAll();

        if (roomList.isEmpty()) {
            return Arrays.asList(createFirstRoom());
        }
        return roomList;
    }

    private Room createFirstRoom() {
        Player player = fetchFirstPlayer();
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

    private Player fetchFirstPlayer() {
        List<Player> players = (List<Player>) playerRepository.findAll();
        if (players.isEmpty()) {
            final String newPlayer = "willowchung@gmail.com";
            playerRepository.save(new Player(newPlayer));
            return playerRepository.findByName(newPlayer);
        }

        return players.get(0);
    }

    public Room createRoom(createRoomDTO dto) {
        Player player = playerRepository.findByName(dto.getPlayerName());
        if (player == null) {
            player = playerRepository.save(new Player(dto.getPlayerName()));
        }

        return createRoom(player,dto.getRoomName(), dto.getLatitude(), dto.getLongitude());
    }
}
