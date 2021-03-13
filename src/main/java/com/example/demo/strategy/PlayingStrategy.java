package com.example.demo.strategy;

import com.example.demo.model.Player;

public interface PlayingStrategy {

    public String decideWinner(int score, int scoreNeeded, Player batsman , Player bowler );
}
