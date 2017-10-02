package br.edu.infnet.superTrunfoAPI.model.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class CreateRoomDTO implements Serializable {
    private String playerName;
    private String roomName;
    private BigDecimal latitude;
    private BigDecimal longitude;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
}
