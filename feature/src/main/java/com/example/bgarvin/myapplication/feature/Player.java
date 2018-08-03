package com.example.bgarvin.myapplication.feature;

public class Player {

    private String mPlayerName;
    private int mCurrentOrder;
    private int mGamesPlayed;

    public Player(String PlayerName, int CurrentOrder, int GamesPlayed) {
        mPlayerName = PlayerName;
        mCurrentOrder = CurrentOrder;
        mGamesPlayed = GamesPlayed;
    }

    public String getPlayerName(){
        return mPlayerName;
    }

    public void setPlayerName(String PlayerName) {
        mPlayerName = PlayerName;
    }

    public int getCurrentOrder(){
        return mCurrentOrder;
    }

    public void setCurrentOrder(int CurrentOrder) {
        mCurrentOrder = CurrentOrder;
    }

    public int getGamesPlayed(){
        return mGamesPlayed;
    }

    public void setGamesPlayed(int GamesPlayed) {
        mGamesPlayed = GamesPlayed;
    }
}
