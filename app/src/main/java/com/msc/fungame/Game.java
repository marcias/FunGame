package com.msc.fungame;

public interface Game {

    void startNewGame(int level);

    void resumeGame();

    void pauseGame();

    void displayResult();

    void onSpotTouched();

    void noSpotTouched();

    void finishGame();

    void addSpots();

    boolean isGameOver();

}
