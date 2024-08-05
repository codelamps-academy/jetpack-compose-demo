package com.codelamps.lerningjetpackcompose.component

import android.content.res.Configuration.UI_MODE_NIGHT_MASK
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codelamps.lerningjetpackcompose.R
import com.codelamps.lerningjetpackcompose.ui.theme.Purple40


@Composable
fun ButtonFirst(name : String) {

    // state
    val expanded = rememberSaveable {
        mutableStateOf(false)
    }

    // extra padding disimpan state
    val extraPadding by animateDpAsState(if (expanded.value) 40.dp else 0.dp,
        animationSpec = spring(dampingRatio = Spring.DampingRatioHighBouncy, stiffness = Spring.StiffnessHigh)
    )


    // extra padding tidak disimpan di state
//    val extraPadding = if (expanded.value) 40.dp else 0.dp

    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
    ) {
        Row (
            Modifier.padding(24.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .weight(1f)
                    .padding(bottom = extraPadding.coerceAtLeast(0.dp))
            ) {
                //
                Text(text = "Hello", style = MaterialTheme.typography.headlineLarge.copy(
                    fontWeight = FontWeight.Bold
                ))
                Text(text = name, style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.Bold
                ))
            }

            ElevatedButton(onClick = { expanded.value = !expanded.value}) {
                Text(if (expanded.value) stringResource(R.string.show_less) else stringResource(R.string.show_more))
            }
        }
    }
}


@Composable
fun ButtonMaster(
    modifier: Modifier = Modifier,
    names : List<String> = List(1000) {"$it"}
) {
    LazyColumn(modifier = modifier.padding(vertical = 4.dp)){
        items(items = names) {name ->
            CardContent(name = name)
        }
    }
    
    
}

// preview
@Preview(
    showBackground = true,
    showSystemUi = true,
    uiMode = UI_MODE_NIGHT_MASK,
    name = "Button First Preview"
)
@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Button First Preview"
)
@Composable
fun ButtonFirstPreview() {
    Column {
        ButtonFirst(name = "Andre")
        ButtonFirst(name = "Brillianto")
    }
}