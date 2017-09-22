import br.edu.infnet.superTrunfoAPI.model.Card;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@RestController
@EnableAutoConfiguration
public class SuperTrunfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuperTrunfoApplication.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "SuperTrunfoApplication";
    }

    @RequestMapping("/sortDeck")
    public List<Card> sortDeck() {
        List<Card> deck = new ArrayList<>();
        String[] categories = {"A","B","C","D","E"};
        int[] ranks = {1,2,3,4,5,6};


        Arrays.stream(categories).forEach(c -> {
            Arrays.stream(ranks).forEach(r -> {
                deck.add(generateCard(c + r, c, (short)r));
            });
        });

        return deck;
    }

    private Card generateCard(String name, String category, short rank) {
        Random random = new Random();
        Card c = new Card();
        c.setName(name);
        c.setCategory(category);
        c.setRank(rank);

        c.setStrength((short) (random.nextInt(6) + 1));
        c.setEquipment((short) (random.nextInt(6) + 1));
        c.setIntelligence((short) (random.nextInt(6) + 1));
        c.setSkill((short) (random.nextInt(6) + 1));
        c.setSpeed((short) (random.nextInt(6) + 1));
        return c;
    }

}
