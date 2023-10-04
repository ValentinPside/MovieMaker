package com.example.moviemaker.presentation

import android.app.Activity
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.moviemaker.R
import com.example.moviemaker.ui.poster.PosterView

class PosterPresenter(
    private val view: PosterView,
    private val imageUrl: String,
) {

    fun onCreate() {
        view.setupPosterImage(imageUrl)
    }
}