import br.edu.infnet.superTrunfoAPI.model.Player;
import br.edu.infnet.superTrunfoAPI.service.GameService;
import io.reactivex.Observable;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class RxJavaTest {

    @Autowired
    private GameService gameService;

    @Before
    public void configuraObservavel() {
        List<Player> onlinePlayers = GameService.onlinePlayers;
        Observable.create(observableEmitter -> {
            while (!observableEmitter.isDisposed()) {
                observableEmitter.onNext(onlinePlayers);
            }
        });


    }


    @Ignore
    @Test
    public void returnAValue(){
        String hello = "Hello";
        Observable<List<Player>> playersObservable = gameService.getOnlinePlayers();
        List<Player> playerList;

        playersObservable.subscribe(o -> {
            System.out.print(o);
        });

        assertTrue(hello.equals("Hello"));
    }

}
