package com.infos.moviesapp.presentation.movies

import com.infos.moviesapp.domain.model.Movie

data class MovieState(
    val isLoading : Boolean = false,
    val movies : List<Movie> = emptyList(),
    val error : String = "",
    val search : String = ""
)
