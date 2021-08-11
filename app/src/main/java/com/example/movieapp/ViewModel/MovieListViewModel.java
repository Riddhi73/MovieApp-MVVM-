package com.example.movieapp.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.movieapp.Services.Model.Result;
import com.example.movieapp.Services.Repository.MovieRepository;

import java.util.List;

public class MovieListViewModel extends AndroidViewModel {

    private MovieRepository mRepo;


    public MovieListViewModel(@NonNull Application application) {
        super(application);
        mRepo = MovieRepository.getInstance(application);




    }

    public MutableLiveData<List<Result>> getTopRatedMovieList()
    {



        return mRepo.getTopRatedMovieLists();
    }


}
