package com.codelamps.lerningjetpackcompose.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.codelamps.lerningjetpackcompose.navbar.LearnNavigationRail

@Composable
fun LearningLandscape() {
    Surface(
        color = MaterialTheme.colorScheme.surface
    ) {
        Row {
            LearnNavigationRail()
            HomeScreen()
        }
    }
}