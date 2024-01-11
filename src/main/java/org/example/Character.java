package org.example;

public abstract class Character {
    // Variables and Attributes all characters have
    public String name;
    public  int maxHp, hp, xp;


    // Constructor for Character
    public Character(String name, int maxHp, int xp){
        this.name = name;
        this.maxHp = maxHp;
        this.xp = xp;
        this.hp = hp;
    }

    // methods all characters have
    public abstract int attack();
    public abstract int defend();

}
