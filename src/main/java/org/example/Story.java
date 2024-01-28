package org.example;

// This class does nothing but storing the methods to print the parts of the story
public class Story {

    public static void printIntro(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println("PROLOG");
        GameLogic.printSeperator(30);
        System.out.println(
                "Du bist Student*in an der Duale Hochschule Karlsruhe und quälst dich an einem Montag bis zur letzten " + "\n" +
                "Vorlesung um 18:30 durch. Um deinen Tag noch mehr zu vermiesen, haben die Chemie-Promovierenden des KIT" + "\n" +
                "vor einigen Stunden einen riesigen Fehler im Audimax begangen. Sie haben die Reagenzien bei ihrer Präsentation" + "\n" +
                        "falsch gemischt und dadurch alle Anwesenden mit dem entstandenen Gas zombifiziert.");
        GameLogic.printSeperator(30);
        System.out.println(
                "Die Zombieapokalypse ist dir ziemlich egal. Schließlich sind wir nicht in Amerika und es gibt keine Waffen an jeder Ecke." + "\n"
                + "Du bist dir sicher, dass der Katastrophenschutz das schon regeln wird.");
        System.out.println(
                "Dein Problem hingegen ist, dass du unbedingt eine Abgabe für Software-Engineering fertigstellen musst und dein Wohnheim " + "\n"
                + "leider in Durlach liegt. Was ein Pech, dass du heute dein Tablet, anstelle deines Laptops dabei hast!");
        System.out.println(
                "Du hast keine Zeit, um auf den Katastrophenschutz zu warten. SE ist wichtiger, also läufst du los... ");
        GameLogic.anythingToContinue();
    }

    public static void printChapterOne(){
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println("DER WEG AUS DER DHBW");
        GameLogic.printSeperator(30);
        System.out.println(
                "Du stehst im Flur vor deinem Hörsaal und überlegst, wie du heimkommst. Du erfährst, dass die Bahn nur bis zum Mühlburgertor fährt."
                + "\n" + "Das Casino ist leider schon geschlossen und du bekommst keine Snacks mehr."
                + "\n" + "Deine Gedanken werden paranoider... du könntest die herumliegenden Objekte zum Selbstschutz klauen! ") ;
        System.out.println("Vor dir liegt ein Besenstock ohne Besenkopf und der Pelzmantel der aggressiven, russischen Tellerwäscherin aus der Mensa.");
        GameLogic.printSeperator(30);
        GameLogic.anythingToContinue();
    }

}
