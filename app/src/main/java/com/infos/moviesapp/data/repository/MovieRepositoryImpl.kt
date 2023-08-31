package com.infos.moviesapp.data.repository

import com.infos.moviesapp.data.remote.MovieAPI
import com.infos.moviesapp.data.remote.dto.MovieDetailDto
import com.infos.moviesapp.data.remote.dto.MoviesDto
import com.infos.moviesapp.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val api : MovieAPI
) : MovieRepository {
    override suspend fun getMovies(search: String): MoviesDto {
            return api.getMovies(search)
    }

    override suspend fun getMovieDetail(imdbId: String): MovieDetailDto {
        return api.getMovieDetail(imdbId)
    }
}