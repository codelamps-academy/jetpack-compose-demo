package com.codelamps.lerningjetpackcompose.screen

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.codelamps.lerningjetpackcompose.navbar.LearnNavigationBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun LearningPotrait() {
    Scaffold(
        bottomBar = { LearnNavigationBar() }
    ) {
        HomeScreen()
    }
}
