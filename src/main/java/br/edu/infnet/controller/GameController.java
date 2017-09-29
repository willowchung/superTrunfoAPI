package br.edu.infnet.controller;

import br.edu.infnet.superTrunfoAPI.model.Player;
import br.edu.infnet.superTrunfoApi.service.GameService;
import io.reactivex.Observable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/")
    public DeferredResult<Player> getPlayers() {
        Observable<Player> observadorJogadores = gameService.getOnlinePlayers();
        DeferredResult<Player> deferred = new DeferredResult<>(90000L);

        observadorJogadores.subscribe(player -> deferred.setResult(player), e -> deferred.setErrorResult(e));
        return deferred;
    }
}
