package com.avishak;

public class PlayerTest extends Player {
    public static void main(String[] args) {
        Player player = new Player();
        player.setName(player.getName());
        player.setScore(player.getScore());
        System.out.println("Player name: " + player.getName());
        System.out.println("Player score: " + player.getScore());
        System.out.println("Player id: " + player.getId());
        System.out.println("Rolling dice: " + rollDice());
        Player[] players = new Player[4];
        int i;
        for (i = 0; i < players.length; i++) {
            players[i] = new Player();
            System.out.println("Enter player " + (i + 1) + "'s name: ");
            players[i].setName(player.getName());
        }
    }

}

