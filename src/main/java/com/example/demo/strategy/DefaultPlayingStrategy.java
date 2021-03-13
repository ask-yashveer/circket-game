package com.example.demo.strategy;

import com.example.demo.model.Player;
import org.springframework.stereotype.Component;

@Component
public class DefaultPlayingStrategy implements PlayingStrategy{

    public String decideWinner(int score, int scoreNeeded, Player batsman , Player bowler){
        if(score == -1){
            return bowler.getName();
        }
        if(batsman.getTotalScore() >= bowler.getTotalScore() && batsman.getTotalScore()>=scoreNeeded){
            return batsman.getName();
        }
        else if(bowler.getTotalScore()>=scoreNeeded){
            return bowler.getName();
        }
        else {
            return "Tie";
        }
    }
}
