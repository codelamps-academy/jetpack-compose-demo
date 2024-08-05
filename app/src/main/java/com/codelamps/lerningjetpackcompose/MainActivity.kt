package com.codelamps.lerningjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.codelamps.lerningjetpackcompose.component.AlignYourBodyElement
import com.codelamps.lerningjetpackcompose.component.AlignYourBodyRow
import com.codelamps.lerningjetpackcompose.component.ButtonMaster
import com.codelamps.lerningjetpackcompose.component.CardContentMaster
import com.codelamps.lerningjetpackcompose.component.FavoriteCollectionsGrid
import com.codelamps.lerningjetpackcompose.component.OnBoardingScreen
import com.codelamps.lerningjetpackcompose.component.SearchBar
import com.codelamps.lerningjetpackcompose.screen.HomeScreen
import com.codelamps.lerningjetpackcompose.screen.LearningPotrait
import com.codelamps.lerningjetpackcompose.section.HomeSection
import com.codelamps.lerningjetpackcompose.ui.theme.LerningJetpackComposeTheme
import com.codelamps.lerningjetpackcompose.util.LearnWindowScale

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val windowSizeClass = calculateWindowSizeClass(this)
            LearnWindowScale(windowSize = windowSizeClass)
        }
    }
}


@Composable
fun MyApp(modifier: Modifier = Modifier) {
    var shouldShowOnBoarding by remember {
        mutableStateOf(true)
    }

    Surface(modifier) {
        if (shouldShowOnBoarding) {
            OnBoardingScreen(onContinueClicked = { shouldShowOnBoarding = false })
        } else {
            Column {
                ButtonMaster()
            }
        }
    }
}