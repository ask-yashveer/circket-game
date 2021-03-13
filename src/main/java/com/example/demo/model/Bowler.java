package com.example.demo.model;

import com.example.demo.strategy.HittingStrategy;
import org.springframework.stereotype.Component;

@Component
public class Bowler implements Player {

    private String name;

    int totalScore;

    private HittingStrategy hittingStrategy;

    public Bowler(final String name, HittingStrategy hittingStrategy){
        this.name = name;
        this.hittingStrategy = hittingStrategy;
    }

    public String getName() {
        return name;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public HittingStrategy getHittingStrategy() {
        return hittingStrategy;
    }
}
