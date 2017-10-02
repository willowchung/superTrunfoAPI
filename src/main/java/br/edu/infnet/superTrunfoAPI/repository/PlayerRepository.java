package br.edu.infnet.superTrunfoAPI.repository;

import br.edu.infnet.superTrunfoAPI.model.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, String> {
    Player findByName(String name);
}
