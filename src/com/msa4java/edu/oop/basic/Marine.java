package com.msa4java.edu.oop;

public class Marine {
    private int hp;
    private int damage;
    private int armor;

    public Marine() {
        this(40, 6, 0);
    }

    public Marine(int hp) {
        this(hp, 6, 0);
    }

    public Marine(int hp, int damage, int armor) {
        this.hp = hp;
        this.damage = damage;
        this.armor = armor;
    }

    // Getter
    public int getHp () {
        return this.hp;
    }
    public int getDamage () {
        return this.damage;
    }
    public int getArmor () {
        return this.armor;
    }
    // Setter
    public void setHp (int hp) {
        this.hp = hp;
    }
    public void setDamage (int damage) {
        this.damage = damage;
    }
    public void setArmor (int armor) {
        this.armor = armor;
    }






}
