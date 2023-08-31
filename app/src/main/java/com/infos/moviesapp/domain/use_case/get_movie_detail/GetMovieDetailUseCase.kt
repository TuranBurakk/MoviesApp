package com.infos.moviesapp.domain.use_case.get_movie_detail

import com.infos.moviesapp.data.remote.dto.toMovieDetail
import com.infos.moviesapp.domain.model.MovieDetail
import com.infos.moviesapp.domain.repository.MovieRepository
import com.infos.moviesapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOError
import javax.inject.Inject

class GetMovieDetailUseCase @Inject constructor(
    private val repository: MovieRepository
) {
    fun executeGetMovieDetails(imdbId : String) : Flow<Resource<MovieDetail>> = flow{
        try {
            emit(Resource.Loading())
            val movieDetail = repository.getMovieDetail(imdbId)
                emit(Resource.Success(movieDetail.toMovieDetail()))

        }catch (e : IOError){
            emit(Resource.Error("No internet connection"))
        }
    }
}