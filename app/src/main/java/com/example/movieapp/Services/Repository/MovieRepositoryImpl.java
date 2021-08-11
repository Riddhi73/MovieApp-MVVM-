package com.example.movieapp.Services.Repository;

import androidx.lifecycle.MutableLiveData;

import com.example.movieapp.Services.Model.MovieModel;
import com.example.movieapp.Services.Model.Result;
import com.example.movieapp.Services.Network.ApiServices;
import com.example.movieapp.Services.Network.RetrofitInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public interface MovieRepositoryImpl {

    public MutableLiveData<List<Result>> getTopRatedMovieLists();




}
