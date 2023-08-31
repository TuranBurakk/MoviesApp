package com.infos.moviesapp.presentation.movies

sealed class MovieEvent{
    data class Search(
            val searchString : String
            ): MovieEvent()
}