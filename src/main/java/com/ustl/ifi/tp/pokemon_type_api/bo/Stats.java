package com.ustl.ifi.tp.pokemon_type_api.bo;

public class Stats {

    private Integer speed;
    private Integer defense;
    private Integer attack;
    private Integer hp;

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getHp() {
        return hp;
    }
}
