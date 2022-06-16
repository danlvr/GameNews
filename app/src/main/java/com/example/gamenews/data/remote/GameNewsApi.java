package com.example.gamenews.data.remote;

import java.util.List;

import com.example.gamenews.domain.News;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GameNewsApi {

    @GET("gameNews.json")
    Call<List<News>> getNews();
}
