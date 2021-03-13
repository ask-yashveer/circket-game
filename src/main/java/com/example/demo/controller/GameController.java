package com.example.demo.controller;

import com.example.demo.model.Player;
import com.example.demo.service.GameService;
import org.springframework.stereotype.Controller;

@Controller
public class GameController {

    private GameService gameService;

    private Player batsman;

    private Player bowler;

    public GameController(GameService gameService, Player batsman, Player bowler){
        this.batsman = batsman;
        this.bowler = bowler;
        this.gameService = gameService;
    }

    public String hasWonTheGame(int score, int scoreNeeded){
        return gameService.hasWonTheGame(score ,scoreNeeded, batsman, bowler);
    }

    public int getScoreOfPlayer(int numberOfOvers){
        return gameService.getScoreOfPlayer(numberOfOvers, batsman, bowler);
    }
}
