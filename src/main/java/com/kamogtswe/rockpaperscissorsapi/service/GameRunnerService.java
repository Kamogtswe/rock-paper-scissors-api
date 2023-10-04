package com.kamogtswe.rockpaperscissorsapi.service;
import java.util.UUID;

/**
 * The GameRunnerService will handle the game logic.
 * It will create new games, handle player moves,
 * and resolve the game outcome.
 */
import org.springframework.stereotype.Service;


@Service
public class GameRunnerService {
    
    public String startNewGame(){
        // Generate a unique game ID and initialize a new game session
        // Return the game ID
        return UUID.randomUUID().toString();
    }

    
}
