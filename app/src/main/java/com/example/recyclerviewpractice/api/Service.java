package com.example.recyclerviewpractice.api;

import com.example.recyclerviewpractice.model.MoviesRespospone;

import retrofit2.Call;
import retrofit2.http.Query;
import retrofit2.http.GET;

public interface Service {
    @GET("movie/popular")
    Call<MoviesRespospone> getPopularMovies(@Query("api_key") String apikey);

    @GET("movie/top_rated")
    Call<MoviesRespospone> geTopRatedMovies(@Query("api_key") String apikey);
}
