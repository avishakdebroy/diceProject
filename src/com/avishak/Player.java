package com.avishak;
import java.util.*;

public class Player {
    private String name;
    private int score;
    private static int count = 0;
    private int id;
    private static final Scanner input = new Scanner(System.in);

    // Constructor
    public Player() {
        this.id = count++;
    }

    // Number of players method
    public static int numberOfPlayers() {
        Scanner scanner = new Scanner(System.in);
        int numberOfPlayers;
        do {
            System.out.println("Enter the number of players between 2 and 4: ");
            numberOfPlayers = scanner.nextInt();
            if (numberOfPlayers < 2 || numberOfPlayers > 4) {
                System.out.println("Invalid number of players. Please enter a number between 2 and 4.");
            }
        } while (numberOfPlayers < 2 || numberOfPlayers > 4);
        System.out.println(numberOfPlayers + " players are playing this game.");
        Player[] players = new Player[numberOfPlayers];
        int i;
        for (i = 0; i < numberOfPlayers; i++) {
            players[i] = new Player();
            System.out.println("Enter player " + (i + 1) + "'s name: ");
            players[i].setName(scanner.next());
        }
        return numberOfPlayers;
    }

    // rollDice method
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    // Display players` scores method
    public void displayPlayersScores(Player[] players) {
        int i;
        for (i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + players[i].getName() + " - " + players[i].getScore());
        }
    }

    // Sort players by score method
    public static void sortPlayersByScore(Player[] players) {
        for (int i = 0; i < players.length -1; i++) {
            for (int j = i + 1; j < players.length; j++) {
                if (players[i].getScore() < players[j].getScore()) {
                    Player temp = players[i];
                    players[i] = players[j];
                    players[j] = temp;
                }
            }
        }
    }

    // Getters and Setters
       public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getScore() {
            return score;
        }
        public void setScore(int score) {
            this.score = score;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }

}
