package com.example.moviemaker.presentation.movies

import com.example.moviemaker.ui.movies.models.MoviesState

interface MoviesView {

    // Методы, меняющие внешний вид экрана

    fun render(state: MoviesState)

    // Методы «одноразовых событий»

    fun showToast(additionalMessage: String)

}