package com.codelamps.lerningjetpackcompose.util

import androidx.compose.runtime.Composable
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import com.codelamps.lerningjetpackcompose.screen.LearningLandscape
import com.codelamps.lerningjetpackcompose.screen.LearningPotrait


@Composable
fun LearnWindowScale(windowSize: WindowSizeClass) {
    when (windowSize.widthSizeClass) {
        WindowWidthSizeClass.Compact -> {
            LearningPotrait()
        }
        WindowWidthSizeClass.Expanded -> {
            LearningLandscape()
        }
    }
}