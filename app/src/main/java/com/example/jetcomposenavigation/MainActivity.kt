package com.example.jetcomposenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.input.key.Key.Companion.Home
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetcomposenavigation.ui.theme.JetcomposeNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetcomposeNavigationTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    ScreenMain()
                }
            }
        }
        
    }
}

@Composable
fun ScreenMain(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Home.route){

        composable(Routes.Home.route){


            
        }
    }


}