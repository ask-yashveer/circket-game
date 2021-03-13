package com.example.demo.model;

import com.example.demo.strategy.HittingStrategy;
import org.springframework.stereotype.Component;

@Component
public class Batsman implements Player {

    private String name;

    private int totalScore;

    private HittingStrategy hittingStrategy;

    public Batsman(final String name, HittingStrategy hittingStrategy){
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
