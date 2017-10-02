package br.edu.infnet.superTrunfoAPI.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Round")
public class Round implements Serializable {
    @Id
    @Column(name = "ID_ROUND")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ROUND")
    @SequenceGenerator(name = "SEQ_ROUND", sequenceName = "SEQ_ROUND", allocationSize = 1)
    private Long id;

    private Integer number;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "ROUND_PLAYER_MOVE", joinColumns = {@JoinColumn(name = "ID_ROUND")}, inverseJoinColumns = {@JoinColumn(name = "ID_PLAYER_MOVE")})
    private List<PlayerMove> playerMoves;
    @JoinColumn(name = "ID_WINNER_PLAYER")
    private Player winnerPlayer;
    private Integer skill;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public List<PlayerMove> getPlayerMoves() {
        return playerMoves;
    }

    public void setPlayerMoves(List<PlayerMove> playerMoves) {
        this.playerMoves = playerMoves;
    }

    public Player getWinnerPlayer() {
        return winnerPlayer;
    }

    public void setWinnerPlayer(Player winnerPlayer) {
        this.winnerPlayer = winnerPlayer;
    }

    public String getWinnerPlayerName() {
        return winnerPlayer.getName();
    }

    public Integer getSkill() {
        return skill;
    }

    public void setSkill(Integer skill) {
        this.skill = skill;
    }
}