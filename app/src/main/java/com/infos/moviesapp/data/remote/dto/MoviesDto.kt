package com.infos.moviesapp.data.remote.dto

import com.infos.moviesapp.domain.model.Movie

data class MoviesDto(
    val Response: String,
    val Search: List<Search>,
    val totalResults: String
)

fun MoviesDto.toMovieList(): List<Movie>{
    return  Search.map { search -> Movie(search.poster,search.title,search.year,search.imdbID)  }
}

