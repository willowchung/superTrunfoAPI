package br.edu.infnet.controller;

import br.edu.infnet.superTrunfoAPI.model.Card;
import br.edu.infnet.superTrunfoApi.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardController {

    @Autowired
    private CardService cardService;

    @RequestMapping("/")
    public String home() {
        return "SuperTrunfoApplication";
    }

    @RequestMapping("/sortDeck")
    public List<Card> sortDeck() {
        return cardService.sortDeck();
    }
}
