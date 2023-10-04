package com.example.moviemaker.domain.api

import com.example.moviemaker.domain.models.Movie
import com.example.moviemaker.util.Resource

interface MoviesRepository {
    fun searchMovies(expression: String): Resource<List<Movie>>
}