package com.infos.moviesapp.presentation.movie_detail

import com.infos.moviesapp.domain.model.MovieDetail

data class MovieDetailState (

    val isLoading : Boolean = false,
    val movie : MovieDetail? = null,
    val error : String = ""
    )