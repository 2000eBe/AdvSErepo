package org.example;

public class Player extends Character{


    // integers to store number of upgrades/Skills in each path
    public int numAtkUpgrades, numDefUpgrades;

    // Arrays to store skills
    public String[] atkUpgrades = {"Strength", "Power", "Might", "Godlike Strength"};
    public String[] defUpgrades = {"Heavy Bones", "Stoneskin", "Scale Armor", "Holy Aura"};

    // Player specific constructor
    public Player(String name) {
        super(name, 100, 0);
        // setting # of Upgrades to 0
        this.numAtkUpgrades = 0;
        this.numDefUpgrades = 0;
        // let player choose a trait when creating a new character
        chooseTrait();
    }

    // Player specific methods
    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }

    // let the player choose a trait of either skill path
    public void chooseTrait(){
        GameLogic.clearConsole();
        GameLogic.printHeading("Choose a trait:");
    }
}
