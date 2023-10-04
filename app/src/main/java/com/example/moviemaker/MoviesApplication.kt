package com.example.moviemaker

import android.app.Application
import com.example.moviemaker.presentation.movies.MoviesSearchPresenter

class MoviesApplication : Application() {

    var moviesSearchPresenter : MoviesSearchPresenter? = null

}