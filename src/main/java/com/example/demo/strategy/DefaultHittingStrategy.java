package com.example.demo.strategy;

public class DefaultHittingStrategy implements HittingStrategy {

    public static final int Total_BALL = 6;

    public int incrementScore(){

        return (int) Math.random()*(Total_BALL-1) + 1;
    }
}
