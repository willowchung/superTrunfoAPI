package br.edu.infnet.superTrunfoAPI.controller;

import br.edu.infnet.superTrunfoAPI.model.Room;
import br.edu.infnet.superTrunfoAPI.model.dto.CreateRoomDTO;
import br.edu.infnet.superTrunfoAPI.model.dto.JoinRoomDTO;
import br.edu.infnet.superTrunfoAPI.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Room createRoom(@RequestBody CreateRoomDTO dto) {
        return roomService.createRoom(dto);
    }

    @PostMapping("/joinRoom")
    public Room joinRoom(@RequestBody JoinRoomDTO dto) {
        return roomService.joinRoom(dto);
    }
}
