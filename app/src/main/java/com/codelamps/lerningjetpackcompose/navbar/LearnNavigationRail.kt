package com.codelamps.lerningjetpackcompose.navbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.codelamps.lerningjetpackcompose.R

@Composable
fun LearnNavigationRail(modifier: Modifier = Modifier) {
    NavigationRail (
        modifier = modifier.padding(start = 8.dp, end = 8.dp),
        containerColor = MaterialTheme.colorScheme.background
    ){
        Column (
            modifier = Modifier
                .fillMaxHeight()
                .padding(horizontal = 8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            NavigationRailItem(selected = true, onClick = { /*TODO*/ }, icon = {
                Icon(
                    imageVector = Icons.Filled.Home,
                    contentDescription = "Home"
                )
            }, label = { Text(text = stringResource(id = R.string.bottom_navigation_home))})

            NavigationRailItem(selected = true, onClick = { /*TODO*/ }, icon = {
                Icon(
                    imageVector = Icons.Filled.Person,
                    contentDescription = "Person"
                )
            }, label = { Text(text = stringResource(id = R.string.bottom_navigation_profile))})


        }
    }
}