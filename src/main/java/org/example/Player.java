package org.example;

public class Player extends Character{


    // integers to store number of upgrades/Skills in each path
    public int numAtkUpgrades, numDefUpgrades;

    // Arrays to store skills
    public String[] atkUpgrades = {"Alltagstaugliche Stärke", "Power", "Might", "Godlike Strength"};
    public String[] defUpgrades = {"Robuster Körperbau", "Stoneskin", "Scale Armor", "Holy Aura"};

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
        GameLogic.printHeading("Wähle eine Eigenschaft für dich aus:");
        System.out.println("(1) " + atkUpgrades[numAtkUpgrades]);
        System.out.println("(2) " + defUpgrades[numDefUpgrades]);
        // get the players choice:
        int input = GameLogic.readInt("-> ", 2 );
        GameLogic.clearConsole();
        //deal with both cases
        if (input == 1){
            GameLogic.printHeading("You chose " + atkUpgrades[numAtkUpgrades] + "!");
            numAtkUpgrades++;
        } else {
            GameLogic.printHeading("You chose " + defUpgrades[numDefUpgrades] + "!");
            numDefUpgrades++;
        }
        GameLogic.anythingToContinue();
    }
}
