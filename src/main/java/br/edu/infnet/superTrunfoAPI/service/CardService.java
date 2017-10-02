package br.edu.infnet.superTrunfoAPI.service;

import br.edu.infnet.superTrunfoAPI.model.Card;
import br.edu.infnet.superTrunfoAPI.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    public List<Card> sortDeck() {
        return (List<Card>) cardRepository.findAll();
    }
}