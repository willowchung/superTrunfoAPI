package br.edu.infnet.superTrunfoAPI.model;

import java.io.Serializable;

public class Card implements Serializable{
    private String name;
    private String category;
    private short rank;

    private short strength;
    private short speed;
    private short skill;
    private short equipment;
    private short intelligence;

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

    public short getSkill() {
        return skill;
    }

    public void setSkill(short skill) {
        this.skill = skill;
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
}
