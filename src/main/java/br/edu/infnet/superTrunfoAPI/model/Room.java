package br.edu.infnet.superTrunfoAPI.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Room")
public class Room implements Serializable {
    @Id
    @Column(name = "ID_ROOM")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ROOM")
    @SequenceGenerator(name = "SEQ_ROOM", sequenceName = "SEQ_ROOM", allocationSize = 1)
    private Long id;
    private String name;
    private Boolean available;
    private String creator;
    private BigDecimal latitude;
    private BigDecimal longitude;
    @ManyToMany(fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    @JoinTable(name = "ROOM_PLAYER", joinColumns = {@JoinColumn(name = "ID_ROOM")}, inverseJoinColumns = {@JoinColumn(name = "ID_PLAYER")})
    private List<Player> players;
    @ManyToMany(fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    @JoinTable(name = "ROUND_PLAYER_MOVE", joinColumns = {@JoinColumn(name = "ID_ROOM")}, inverseJoinColumns = {@JoinColumn(name = "ID_ROUND")})
    private List<Round> rounds;

    public Room() {
        super();
        players = new ArrayList<>();
        rounds = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
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

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
