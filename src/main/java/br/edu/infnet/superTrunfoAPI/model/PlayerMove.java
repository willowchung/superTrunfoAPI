package br.edu.infnet.superTrunfoAPI.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Player_Move")
public class PlayerMove implements Serializable {
    @Id
    @Column(name = "ID_PLAYER_MOVE")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PLAYER_MOVE")
    @SequenceGenerator(name = "SEQ_PLAYER_MOVE", sequenceName = "SEQ_PLAYER_MOVE", allocationSize = 1)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_PLAYER")
    private Player player;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_CARD")
    private Card card;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getPlayerName() {
        return player.getName();
    }
}