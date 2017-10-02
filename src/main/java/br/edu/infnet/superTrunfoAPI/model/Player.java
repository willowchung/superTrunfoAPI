package br.edu.infnet.superTrunfoAPI.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Player")
public class Player implements Serializable {
    @Id
    @Column(name = "ID_PLAYER")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PLAYER")
    @SequenceGenerator(name = "SEQ_PLAYER", sequenceName = "SEQ_PLAYER", allocationSize = 1)
    private Long id;

    private String name;

    public Player(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
