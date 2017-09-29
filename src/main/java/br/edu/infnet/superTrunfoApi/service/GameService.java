package br.edu.infnet.superTrunfoApi.service;

import br.edu.infnet.superTrunfoAPI.model.Player;
import io.reactivex.Observable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    private static List<Player> onlinePlayers = new ArrayList<>();

    {
        mockPlayers();
    }

    private void mockPlayers() {
        Player idlePlayer = new Player();
        idlePlayer.setId(12345L);
        idlePlayer.setAvailable(true);
        idlePlayer.setName("CptRodgers");
        idlePlayer.setLatitude(new BigDecimal(-22.906339));
        idlePlayer.setLongitude(new BigDecimal(-43.177051));
        onlinePlayers.add(idlePlayer);

        Player occupiedPlayer = new Player();
        occupiedPlayer.setId(67890L);
        occupiedPlayer.setAvailable(false);
        occupiedPlayer.setName("BennyHanna81");
        occupiedPlayer.setLatitude(new BigDecimal(-22.985789));
        occupiedPlayer.setLongitude(new BigDecimal(-43.227220));
        onlinePlayers.add(occupiedPlayer);
    }


    public Observable<Player> getOnlinePlayers() {
        return Observable.<Player>create(o -> {
            onlinePlayers.forEach(o::onNext);
            o.onComplete();
        });
    }

}
