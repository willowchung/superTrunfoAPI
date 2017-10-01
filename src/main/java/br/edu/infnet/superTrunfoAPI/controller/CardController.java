package br.edu.infnet.superTrunfoAPI.controller;

import br.edu.infnet.superTrunfoAPI.model.Card;
import br.edu.infnet.superTrunfoAPI.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardController {

    @Autowired
    private CardRepository cardRepository;

    @RequestMapping("/sortDeck")
    public List<Card> sortDeck() {
        return (List<Card>) cardRepository.findAll();
    }
}
