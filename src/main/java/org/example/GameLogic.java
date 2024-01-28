package org.example;

import java.util.Scanner;
public class GameLogic {
    static Scanner scanner = new Scanner(System.in);

    static Player player;
    static boolean isRunning;
    // method to get user input from console
    public static int readInt(String prompt, int userChoices){
        int input;

        do{
            System.out.println(prompt);
            try{
                input = Integer.parseInt(scanner.next());
            }catch(Exception e){
                input = -1;
                System.out.println("Bitte ein Integer einfuegen!");
            }

        }while(input < 1 || input > userChoices);
        return input;
    }


    // method to simulate clearing out the console
    public static void clearConsole(){
        for(int i = 0; i > 100; i++){
            System.out.println();
        }
    }
    // method to print a seperator with length n
    public static void printSeperator(int n){
        for (int i = 0; i < n; i++){
            System.out.print("-");

        }
        System.out.println();
    }

    // method to print a heading
    public static void printHeading(String title){
        printSeperator(30);
        System.out.println(title);
        printSeperator(30);
    }

    // method to stop the game until user enters anything
    public static void anythingToContinue(){
        System.out.println("\nEnter anything to continue...");
        scanner.next();
    }


    // method to continue the journey
    public static void  continueJourney(){

    }

    // printing out the most important information about the player character
    public static void  characterInfo(){
        clearConsole();
        printHeading("Charakterinformation");
        System.out.println(player.name + "\tHP: " + player.hp + " / " + player.maxHp);
        printSeperator(20);
        System.out.println("XP: " + player.xp);

        //printing chosen traits
        if (player.numAtkUpgrades > 0){
            System.out.println("Offensiver Skill: " + player.atkUpgrades[player.numAtkUpgrades -1 ]);
            printSeperator(20);
        }
        if (player.numDefUpgrades > 0){
            System.out.println("Defensiver Skill: " + player.defUpgrades[player.numDefUpgrades - 1]);
            printSeperator(20);
        }

        anythingToContinue();
    }
    // printing the main menu
    private static void printMenu() {
        clearConsole();
        printHeading("MENÜ");
        System.out.println("Bitte eine Auswahl treffen: ");
        printSeperator(20);
        System.out.println("(1) Abenteuer fortzusetzen ");
        System.out.println("(2) Charakter-Infos ");
        System.out.println("(3) Abenteuer beenden ");

    }
    // gameloop method
    private static void gameLoop() {

        while (isRunning){
            printMenu();
            int input = readInt("-> ", 3):
            if(input == 1){
                continueJourney();
            } else if (input == 2) {
                characterInfo();
            } else {
                isRunning = false;
            }
        }
    }


    // method to start the game
    public static  void  startGame(){
        boolean nameSet = false;
        String name;
        // Print title screen
        clearConsole();
        printSeperator(40);
        printSeperator(30);
        System.out.println("ALS DIE KIT-ZOMBIES KAMEN");
        System.out.println("TEXT RPG BY ERIKA B.");
        printSeperator(30);
        printSeperator(40);
        anythingToContinue();

        //get the player name
        do {
            clearConsole();
            printHeading("Wie heißt du?");
            name = scanner.next();
            // asking  player if he want to correct his choice
            clearConsole();
            printHeading("Den Namen " + name + " bestätigen?");
            System.out.println("(1) für ''Ja!'' " );
            System.out.println("(2) für ''Nein, ich möchte mich gerne umbenennen!'' " );

            int input = readInt("-> ", 2);
            if (input == 1){
                nameSet = true;}
        } while(!nameSet);

        //create new player object with the name
        player = new Player(name);

        // setting isRunning to true, so the game loop can continue
        isRunning = true;

        // start main game loop
        gameLoop();
    }


}


