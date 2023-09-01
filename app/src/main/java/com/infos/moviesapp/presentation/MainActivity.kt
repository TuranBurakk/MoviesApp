package com.infos.moviesapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.infos.moviesapp.presentation.movies.views.MovieScreen
import com.infos.moviesapp.presentation.ui.theme.MoviesAppTheme
import com.infos.moviesapp.presentation.ui.theme.Typography
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoviesAppTheme {
                Surface(color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    NavHost(navController = navController,
                        startDestination = Screen.MovieScreen.route
                    ){
                        composable(route = Screen.MovieScreen.route){
                            MovieScreen(navController = navController)
                        }

                        composable(route = Screen.MovieDetailScreen.route){

                        }
                    }
                }

            }
            }
        }
    }


