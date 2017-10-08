package com.javaUdemy;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health: "+ player.healthRemain());
//
//        damage = 12;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health: "+ player.healthRemain());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim ", 250, "Sword");
        System.out.println("Initial health is: "+ enhancedPlayer.getHealth());
    }
}
