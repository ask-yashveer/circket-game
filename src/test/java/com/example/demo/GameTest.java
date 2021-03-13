package com.example.demo;

import com.example.demo.controller.GameController;
import com.example.demo.model.Batsman;
import com.example.demo.model.Bowler;
import com.example.demo.model.Player;
import com.example.demo.service.GameService;
import com.example.demo.strategy.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class GameTest {

    private GameController gameController;

    private GameService gameService;

    private PlayingStrategy playingStrategy;

    private HittingStrategy defaultStrategy;

    private HittingStrategy nonBoundaryHittingStrategy;

    private HittingStrategy attackingHittingStrategy;

    final String SACHIN = "Virat";

    final String BUMRAH = "Bumrah";

    private Player batsman;

    private Player bowler;

    @BeforeEach
    void setUp(){
        this.attackingHittingStrategy = new AttackingHittingStrategy();
        this.defaultStrategy = new DefaultHittingStrategy();
        this.nonBoundaryHittingStrategy = new NonBoundaryHittingStrategy();

        batsman = new Batsman(SACHIN, nonBoundaryHittingStrategy);
        bowler = new Bowler(BUMRAH, defaultStrategy);

        playingStrategy = new DefaultPlayingStrategy();
        gameService = new GameService(playingStrategy);
        gameController = new GameController(gameService, batsman, bowler);
    }

    @Test
    void defaultTestCase(){
        int scoreNeeded = 12;
        int numberOfOvers = 2;
        int result = gameController.getScoreOfPlayer(numberOfOvers);
        System.out.println(gameController.hasWonTheGame(result,scoreNeeded));

    }
}
