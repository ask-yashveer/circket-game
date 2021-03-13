package com.example.demo.model;

import com.example.demo.strategy.HittingStrategy;

public interface Player {

    String getName();

    int getTotalScore();

    void setTotalScore(int totalScore);

    public HittingStrategy getHittingStrategy();
}
