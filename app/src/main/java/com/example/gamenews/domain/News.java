package com.example.gamenews.domain;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class News {
    @PrimaryKey
    public int id;
    public String title;
    public String deck;
    public String image;
    public String site_detail_url;
    public boolean favorite;
}
