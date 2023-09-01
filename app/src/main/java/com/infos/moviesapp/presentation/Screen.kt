package com.infos.moviesapp.presentation

sealed class Screen(var route : String) {
    object MovieScreen : Screen("movie_screen")
    object MovieDetailScreen : Screen("movie_detail_screen")
}