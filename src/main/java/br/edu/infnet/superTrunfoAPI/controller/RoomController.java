package br.edu.infnet.superTrunfoAPI.controller;

import br.edu.infnet.superTrunfoAPI.model.Room;
import br.edu.infnet.superTrunfoAPI.model.dto.createRoomDTO;
import br.edu.infnet.superTrunfoAPI.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/rooms")
    public List<Room> getRooms() {
        return roomService.getRooms();
    }

    @PutMapping("/createRoom")
    public Room createRoom(@RequestBody createRoomDTO dto) {
        return roomService.createRoom(dto);
    }
}
