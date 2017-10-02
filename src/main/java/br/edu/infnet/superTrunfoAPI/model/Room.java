package br.edu.infnet.superTrunfoAPI.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

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
    @JoinTable(name = "ROOM_PLAYER", joinColumns = {@JoinColumn(name = "ID_ROOM")}, inverseJoinColumns = {@JoinColumn(name = "ID_PLAYER")})
    private Set<Player> players;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "room")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private Set<Round> rounds;

    public Room() {
        super();
        players = new HashSet<>();
        rounds = new HashSet<>();
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

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    public Set<Round> getRounds() {
        return rounds;
    }

    public void setRounds(Set<Round> rounds) {
        this.rounds = rounds;
    }
}
