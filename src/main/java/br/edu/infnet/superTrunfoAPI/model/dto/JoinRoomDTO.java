package br.edu.infnet.superTrunfoAPI.model.dto;

import java.io.Serializable;

public class JoinRoomDTO implements Serializable {
    private String playerName;
    private Long roomId;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }
}
