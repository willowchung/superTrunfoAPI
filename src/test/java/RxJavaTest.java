import io.reactivex.Observable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RxJavaTest {

    private String result = "";


    @Before
    public void configuraObservavel() {

    }


    @Test
    public void returnAValue(){
        result = "";
        Observable<String> observer = Observable.just("Hello"); // provides datea

        observer.subscribe(s -> result=s); // Callable as subscriber

        assertTrue(result.equals("Hello"));
    }

}
