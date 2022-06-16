package com.example.gamenews;

import android.app.Application;

public class GameNewsApp extends Application {

    private static GameNewsApp instance;

    public static GameNewsApp getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}