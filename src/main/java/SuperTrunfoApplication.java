import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan({"br.edu.infnet"})
public class SuperTrunfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuperTrunfoApplication.class, args);
    }
}