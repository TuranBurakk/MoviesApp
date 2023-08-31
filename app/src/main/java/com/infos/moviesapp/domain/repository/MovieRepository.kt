package com.infos.moviesapp.domain.repository

import com.infos.moviesapp.data.remote.dto.MovieDetailDto
import com.infos.moviesapp.data.remote.dto.MoviesDto

interface MovieRepository {

    suspend fun getMovies(search:String):MoviesDto
    suspend fun getMovieDetail(imdbId:String):MovieDetailDto

}