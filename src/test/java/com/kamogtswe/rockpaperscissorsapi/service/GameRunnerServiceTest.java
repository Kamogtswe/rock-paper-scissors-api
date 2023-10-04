package com.kamogtswe.rockpaperscissorsapi.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

// @TestInstance(Lifecycle.PER_CLASS)
public class GameRunnerServiceTest {

    static GameRunnerService gameRunnerService;

    @BeforeAll
    static void initClass(){
        gameRunnerService = new GameRunnerService();
    }

    @Test
    void testEndGame() {

    }

    @Test
    void testGetGameStatus() {

    }

    @Test
    void testMakeMove() {

    }

    @Test
    void testStartNewGame() {

        assertNotNull(gameRunnerService.startNewGame());
        
    }
}
