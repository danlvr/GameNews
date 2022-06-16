package com.example.gamenews.data.local;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import com.example.gamenews.domain.News;

@Dao
public interface GameNewsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void save(News news);

    @Query("SELECT * FROM news WHERE favorite = 1")
    LiveData<List<News>> loadFavoriteNews();
}
