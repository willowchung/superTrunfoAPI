package br.edu.infnet.superTrunfoAPI.controller;

import br.edu.infnet.superTrunfoAPI.model.Player;
import br.edu.infnet.superTrunfoAPI.model.Room;
import br.edu.infnet.superTrunfoAPI.model.dto.CreateRoomDTO;
import br.edu.infnet.superTrunfoAPI.model.dto.JoinRoomDTO;
import br.edu.infnet.superTrunfoAPI.service.RoomService;
import io.reactivex.Observable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    private RoomService roomService;

    @RequestMapping("/rooms")
    public List<Room> getRooms() {
        return roomService.getRooms();
    }

    @RequestMapping("/createRoom")
    public Room createRoom(@RequestBody CreateRoomDTO dto) {
        return roomService.createRoom(dto);
    }

    @RequestMapping("/joinRoom")
    public Room joinRoom(@RequestBody JoinRoomDTO dto) {
        return roomService.joinRoom(dto);
    }

    @RequestMapping("notityJoinRoom/{roomId}")
    public DeferredResult<Player> notityJoinRoom(@PathVariable("roomId") Long roomId) {
        Observable<Player> o = roomService.notifyJoinRoom(roomId);
        DeferredResult<Player> deffered = new DeferredResult<>(90000L);
        o.subscribe(m -> deffered.setResult(m),
                e -> deffered.setErrorResult(e));
        return deffered;
    }
}
