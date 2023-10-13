package com.kamogtswe.rockpaperscissorsapi.model;

public class GameConfig {
     // TODO implement this
     private int players;
     private int minumumPlayers = 2;
 
 
     public GameConfig(int players) {
         this.players = players;
     }
 
     public int getPlayers() {
         return this.players;
     }
 
     public int getMinimumPlayers() {
         return this.minumumPlayers;
     }
}
