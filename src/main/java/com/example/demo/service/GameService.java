package com.example.demo.service;

import com.example.demo.model.Player;
import com.example.demo.strategy.PlayingStrategy;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    private PlayingStrategy playingStrategy;

    public static final int Total_BALL = 6;

    public GameService(PlayingStrategy playingStrategy){
        this.playingStrategy = playingStrategy;
    }

    public int getScoreOfPlayer(int numberOfOvers, Player batman, Player bowler){
        int totalScoreOfBatman=0;
        int totalScoreOfBowler=0;

        for(int ball=0;ball<Total_BALL*numberOfOvers;ball++){
            int valueBatsman = batman.getHittingStrategy().incrementScore() ;
            int valueBowler = bowler.getHittingStrategy().incrementScore() ;
            if(valueBatsman == valueBowler){
                return -1;
            }
            totalScoreOfBatman+=valueBatsman;
            totalScoreOfBowler+=valueBowler;
        }
        batman.setTotalScore(totalScoreOfBatman);
        bowler.setTotalScore(totalScoreOfBowler);
        return totalScoreOfBatman;
    }

    public String hasWonTheGame(int result, int scoreNeeded, Player batsman, Player bowler){
        return playingStrategy.decideWinner(result, scoreNeeded ,batsman, bowler);
    }
}
