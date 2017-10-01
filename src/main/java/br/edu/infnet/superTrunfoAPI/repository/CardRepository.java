package br.edu.infnet.superTrunfoAPI.repository;

import br.edu.infnet.superTrunfoAPI.model.Card;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card, Long> {
    Card findById(String Id);
}
