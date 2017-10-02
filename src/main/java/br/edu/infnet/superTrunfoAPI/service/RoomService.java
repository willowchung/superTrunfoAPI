package br.edu.infnet.superTrunfoAPI.service;

import br.edu.infnet.superTrunfoAPI.model.Player;
import br.edu.infnet.superTrunfoAPI.model.Room;
import br.edu.infnet.superTrunfoAPI.repository.PlayerRepository;
import br.edu.infnet.superTrunfoAPI.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private PlayerRepository playerRepository;

    public static List<Player> onlinePlayers = new ArrayList<>();

    public List<Room> getRooms() {
        if (((List<Room>) roomRepository.findAll()).isEmpty()) {
            createFirstRoom();
        }
        return (List<Room>) roomRepository.findAll();
    }

    private void createFirstRoom() {
        Player player = fetchFirstPlayer();

        Room room = new Room();
        room.setName("Sala 1");
        room.setAvailable(true);
        room.setCreator(player.getName());
        room.setLatitude(new BigDecimal(-22.906339));
        room.setLongitude(new BigDecimal(-43.177051));
        room.setPlayers(Arrays.asList(player));

        roomRepository.save(room);
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
}
