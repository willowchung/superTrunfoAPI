package br.edu.infnet.superTrunfoAPI.model;

import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Immutable
@Table(name = "Card")
public class Card implements Serializable {
    @Id
    @Column(name = "ID_CARD")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CARD")
    @SequenceGenerator(name = "SEQ_CARD", sequenceName = "SEQ_CARD", allocationSize = 1)
    private Long id;
    private String name;
    private String category;
    private short rank;

    private short strength;
    private short speed;
    private short equipment;
    private short intelligence;

    private String imageUrl;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public short getRank() {
        return rank;
    }

    public void setRank(short rank) {
        this.rank = rank;
    }

    public short getStrength() {
        return strength;
    }

    public void setStrength(short strength) {
        this.strength = strength;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    public short getEquipment() {
        return equipment;
    }

    public void setEquipment(short equipment) {
        this.equipment = equipment;
    }

    public short getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(short intelligence) {
        this.intelligence = intelligence;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
