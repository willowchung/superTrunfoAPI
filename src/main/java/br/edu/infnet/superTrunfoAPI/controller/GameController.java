package br.edu.infnet.superTrunfoAPI.controller;

import br.edu.infnet.superTrunfoAPI.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/")
    public String getPlayers() {
        /*List<Player> onlinePlayers;
        gameService.getOnlinePlayers().subscribe(players -> {
            onlinePlayers = players
        });*/

        return "onlinePlayers";
    }
}
