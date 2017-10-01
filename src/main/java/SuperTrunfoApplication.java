import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@EnableAutoConfiguration
@EntityScan(basePackages = "br.edu.infnet.superTrunfoAPI.model")
@EnableJpaRepositories(basePackages = "br.edu.infnet.superTrunfoAPI.repository")
@ComponentScan({"br.edu.infnet.superTrunfoAPI"})
public class SuperTrunfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuperTrunfoApplication.class, args);
    }
}