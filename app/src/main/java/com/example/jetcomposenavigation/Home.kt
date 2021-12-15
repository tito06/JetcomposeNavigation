package com.example.jetcomposenavigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController



    @Composable
    fun home(navController: NavHostController) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {

            Column {

                Text(text = "home Page", color = Color.Black)

                Spacer(modifier = Modifier.height(20.dp))
                Button(onClick = {
                    navController.navigate(Routes.Profile.route)
                }) {

                }

                Spacer(modifier = Modifier.height(20.dp))
                Button(onClick = { }) {
                    navController.navigate(Routes.Settings.route)
                }

            }

        }

    }
