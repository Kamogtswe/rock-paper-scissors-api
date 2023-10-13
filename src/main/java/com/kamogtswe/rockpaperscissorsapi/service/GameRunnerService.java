package com.kamogtswe.rockpaperscissorsapi.service;

/**
 * The GameRunnerService will handle the game logic.
 * It will create new games, handle player moves,
 * and resolve the game outcome.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


import org.springframework.stereotype.Service;

import com.kamogtswe.rockpaperscissorsapi.model.GameConfig;
import com.kamogtswe.rockpaperscissorsapi.model.Player;


@Service
public class GameRunnerService {

    protected int players;
    private List<Player> playersList;
    private boolean player1Win = false;
    private boolean player2Win = false;
    private boolean enoughPlayers = true;
    private String gameID;

    static class StillInProgressException extends RuntimeException{
        public StillInProgressException(){

            super("Still in progress");
        }
    }

    static class GameEndedException extends RuntimeException{
        public GameEndedException(){

            super("Game ended");
        }
    }

    public GameRunnerService(){
        this.playersList = new ArrayList<>();
    }

    public GameRunnerService(GameConfig config)  {
        this.playersList = new ArrayList<>();
        this.players = config.getPlayers();

        if (config.getPlayers() < config.getMinimumPlayers()) {
            setEnoughPlayers(false);
            
        }
    }

    private void setEnoughPlayers(boolean isEnough){
         this.enoughPlayers = isEnough;
    }

    private boolean getEnoughPlayers() {
        return this.enoughPlayers;
    }

    // public GameResult play() throws NotEnoughPlayersException
    // , PlayerWithUnchosenHandException{

    //     for (Player player : playersList) 
    //         if (player.getHand() == null) throw new PlayerWithUnchosenHandException();

    //     if (!getEnoughPlayers()) throw new NotEnoughPlayersException();

    //     Player player1 = playersList.get(0);
    //     Player player2 = playersList.get(1);
    //     boolean player1Wins = player1.getWins() > player2.getWins();
    //     boolean player2Wins = player2.getWins() > player1.getWins();

    //     if(player1.getHand().compareTo(player2.getHand() ) > 0
    //             && player2.getHand().compareTo(player1.getHand()) > 0){
    //         return new DrawResult(this);
    //     }else if(player1.getHand().compareTo(player2.getHand() ) > 0){
    //         player1.addWin();
    //         this.player1Win = true;
    //         return new WinLossResult(this);
    //     }else if (player2.getHand().compareTo(player1.getHand()) > 0){
    //         player2.addWin();
    //         this.player2Win = true;

    //     }
    //     return new WinLossResult(this);
    // }


    public List<Player> getPlayersStillChoosing(){
        List<Player> stillChoosing = new ArrayList<Player>();
        for(Player player : this.playersList){
            if(player.getHand() == null ||
            player.getHand().getHandName().equals("")){
                stillChoosing.add(player);
            }
        }
        return stillChoosing;
    }

    public void addPlayers(Player player){
        this.playersList.add(player);
    };

    public GameRunnerService getResult() throws StillInProgressException{
        if (getPlayersStillChoosing() != null) 
            throw new StillInProgressException();
        return this;
    }

    public List<Player> getPlayers() {
        return this.playersList;
    }

    public boolean getPlayer1WinStatus(){
        return this.player1Win;

    }

    public boolean getPlayer2WinStatus(){
        return this.player2Win;

    }
    
    public String startNewGame(){
        // Generate a unique game ID and initialize a new game session
        // Return the game ID
        return UUID.randomUUID().toString();
    }

    
}
