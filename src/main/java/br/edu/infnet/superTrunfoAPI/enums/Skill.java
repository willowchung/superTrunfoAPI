package br.edu.infnet.superTrunfoAPI.enums;

public enum Skill {
    STRENGTH(1),
    SPEED(2),
    EQUIPMENT(3),
    INTELLIGENCE(4);

    private Integer id;

    Skill(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return id.toString();
    }
}
