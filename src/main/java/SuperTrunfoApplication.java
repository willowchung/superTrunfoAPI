import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SuperTrunfoApplication {

    @RequestMapping("/")
    public String home() {
        return "SuperTrunfoApplication";
    }

    public static void main(String[] args) {
        SpringApplication.run(SuperTrunfoApplication.class, args);
    }
}
