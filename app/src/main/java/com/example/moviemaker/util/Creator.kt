package com.example.moviemaker.util

import android.content.Context
import com.example.moviemaker.data.MoviesRepositoryImpl
import com.example.moviemaker.data.network.RetrofitNetworkClient
import com.example.moviemaker.domain.api.MoviesInteractor
import com.example.moviemaker.domain.api.MoviesRepository
import com.example.moviemaker.domain.impl.MoviesInteractorImpl
import com.example.moviemaker.presentation.movies.MoviesSearchPresenter
import com.example.moviemaker.presentation.PosterPresenter
import com.example.moviemaker.ui.poster.PosterView

object Creator {

    fun provideMoviesSearchPresenter(
        context: Context,
    ): MoviesSearchPresenter {
        return MoviesSearchPresenter(
            context = context,
        )
    }

    private fun getMoviesRepository(context: Context): MoviesRepository {
        return MoviesRepositoryImpl(RetrofitNetworkClient(context))
    }

    fun provideMoviesInteractor(context: Context): MoviesInteractor {
        return MoviesInteractorImpl(getMoviesRepository(context))
    }

    fun providePosterPresenter(
        posterView: PosterView,
        imageUrl: String
    ): PosterPresenter {
        return PosterPresenter(posterView, imageUrl)
    }
}