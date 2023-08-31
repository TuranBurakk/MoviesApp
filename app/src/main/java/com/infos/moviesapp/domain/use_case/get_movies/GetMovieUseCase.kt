package com.infos.moviesapp.domain.use_case.get_movies

import com.infos.moviesapp.data.remote.dto.toMovieList
import com.infos.moviesapp.domain.model.Movie
import com.infos.moviesapp.domain.repository.MovieRepository
import com.infos.moviesapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOError
import javax.inject.Inject

class GetMovieUseCase @Inject constructor(
    private val repository: MovieRepository
) {
    fun executeGetMovies(search : String) : Flow<Resource<List<Movie>>> = flow{
        try {
            emit(Resource.Loading())
            val movieList = repository.getMovies(search)
            if (movieList.Response.equals("True")){
                emit(Resource.Success(movieList.toMovieList()))
            }else{
                emit(Resource.Error("No movie found!"))
            }
        }catch (e : IOError){
            emit(Resource.Error("No internet connection"))
        }
    }
}