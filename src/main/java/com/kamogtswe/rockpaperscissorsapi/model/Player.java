package com.kamogtswe.rockpaperscissorsapi.model;

import java.util.List;
import java.util.Objects;

import com.kamogtswe.rockpaperscissorsapi.model.hands.Hand;
import com.kamogtswe.rockpaperscissorsapi.service.Game;

public class Player {
    
    private Game currentGame;
    private Hand hand;
    private int wins = 0;

    public void join(Game game) {
        this.currentGame = game;
        this.currentGame.addPlayers(this);
    }

    public void choose(Hand hand) {
        this.hand = hand;
    }

    public List<Player> opponents() {
        return currentGame.getPlayers();
    }

    public Hand getHand(){
        return this.hand;
    }

    public int getWins() {
        return this.wins;
    }

    public void addWin() {
        wins = wins + 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Player player = (Player) obj;
        return Objects.equals(currentGame, player.currentGame) &&
               Objects.equals(hand, player.hand) &&
               wins == player.wins;
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentGame, hand, wins);
    }
}
