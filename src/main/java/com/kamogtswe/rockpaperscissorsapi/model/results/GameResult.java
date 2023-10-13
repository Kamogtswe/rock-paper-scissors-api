package com.kamogtswe.rockpaperscissorsapi.model.results;

import java.util.List;

import com.kamogtswe.rockpaperscissorsapi.model.Player;
import com.kamogtswe.rockpaperscissorsapi.service.Game;

public class GameResult {
    protected Game game;

    public GameResult(Game game){
        this.game = game;
    }

    public List<Player> players(){
        return this.game.getPlayers();
    }
}
