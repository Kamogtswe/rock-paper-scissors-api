package com.kamogtswe.rockpaperscissorsapi.service;

/**
 * The GameRunnerService will handle the game logic.
 * It will create new games, handle player moves,
 * and resolve the game outcome.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamogtswe.rockpaperscissorsapi.model.GameConfig;
import com.kamogtswe.rockpaperscissorsapi.model.Player;


@Service
public class GameRunnerService {

    private String gameID;
    @Autowired
    private Game game;

    
    public String startNewGame(){
        // Generate a unique game ID and initialize a new game session
        // Return the game ID
        return UUID.randomUUID().toString();
    }

    
}
