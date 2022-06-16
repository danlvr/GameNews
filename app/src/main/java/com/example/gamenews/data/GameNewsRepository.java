package com.example.gamenews.data;

import androidx.room.Room;

import com.example.gamenews.GameNewsApp;
import com.example.gamenews.data.local.GameNewsDatabase;
import com.example.gamenews.data.remote.GameNewsApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GameNewsRepository {

    private static final String REMOTE_API_URL = "https://danlvr.github.io/GameNewsApi/";
    private static final String LOCAL_DB_NAME = "game-news";

    private GameNewsApi remoteApi;
    private GameNewsDatabase localDb;

    public GameNewsApi getRemoteApi() {
        return remoteApi;
    }

    public GameNewsDatabase getLocalDb() {
        return localDb;
    }


    private GameNewsRepository() {
        remoteApi = new Retrofit.Builder()
                .baseUrl(REMOTE_API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(GameNewsApi.class);

        localDb = Room.databaseBuilder(GameNewsApp.getInstance(), GameNewsDatabase.class, LOCAL_DB_NAME).build();
    }

    public static GameNewsRepository getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final GameNewsRepository INSTANCE = new GameNewsRepository();
    }
}
