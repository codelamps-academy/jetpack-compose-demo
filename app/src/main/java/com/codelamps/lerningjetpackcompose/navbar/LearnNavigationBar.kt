package com.codelamps.lerningjetpackcompose.navbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.codelamps.lerningjetpackcompose.R

@Composable
fun LearnNavigationBar(modifier : Modifier = Modifier) {
    NavigationBar (
        modifier = modifier,
        containerColor = MaterialTheme.colorScheme.surfaceVariant
    ){
        NavigationBarItem(selected = true, onClick = { /*TODO*/ }, icon = { Icon(
            imageVector = Icons.Filled.Home,
            contentDescription = "Home"
        ) }, label = {
            Text(text = stringResource(id = R.string.bottom_navigation_home))
        })

        NavigationBarItem(selected = false, onClick = { /*TODO*/ }, icon = { Icon(
            imageVector = Icons.Filled.Person,
            contentDescription = "Profile"
        )}, label = {
            Text(text = stringResource(id = R.string.bottom_navigation_profile))
        })
    }
}


@Preview
@Composable
fun LearnNavigationBarPreview() {
    LearnNavigationBar()
}