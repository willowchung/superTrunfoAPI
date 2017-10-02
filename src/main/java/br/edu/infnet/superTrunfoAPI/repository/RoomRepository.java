package br.edu.infnet.superTrunfoAPI.repository;

import br.edu.infnet.superTrunfoAPI.model.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Long> {
    Room findById(String Id);
}
