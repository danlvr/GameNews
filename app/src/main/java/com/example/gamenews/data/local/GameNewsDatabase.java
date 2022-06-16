package com.example.gamenews.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.gamenews.domain.News;

@Database(entities = {News.class}, version = 1)
public abstract class GameNewsDatabase extends RoomDatabase {
    public abstract GameNewsDao newsDao();
}
