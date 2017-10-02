package br.edu.infnet.superTrunfoAPI.service;

import br.edu.infnet.superTrunfoAPI.model.Player;
import br.edu.infnet.superTrunfoAPI.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public Player fetchFirstPlayer() {
        List<Player> players = (List<Player>) playerRepository.findAll();
        if (players.isEmpty()) {
            final String newPlayer = "willowchung@gmail.com";
            playerRepository.save(new Player(newPlayer));
            return playerRepository.findByName(newPlayer);
        }

        return players.get(0);
    }

    public Player findByNameOrCreateNewPlayer(String name) {
        Player player = playerRepository.findByName(name);
        if (player == null) {
            player = playerRepository.save(new Player(name));
        }

        return player;
    }

}
