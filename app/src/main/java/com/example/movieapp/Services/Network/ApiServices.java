package com.example.movieapp.Services.Network;

import com.example.movieapp.Services.Model.MovieModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServices {

    @GET("3/movie/top_rated?api_key=fa53b023e7f46c562212ffada77d005c")
    Call<MovieModel> getTopRatedMovieList();
}
