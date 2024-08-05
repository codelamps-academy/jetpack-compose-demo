package com.codelamps.lerningjetpackcompose.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codelamps.lerningjetpackcompose.R

//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun SearchBar(
//    modifier: Modifier = Modifier
//) {
//
//    TextField(
//        value = "",
//        onValueChange = {},
//        leadingIcon = {
//            Icon(imageVector = Icons.Filled.Search, contentDescription = "Search")
//        },
//        placeholder = {
//            Text(text = "Search")
//        },
//        modifier = modifier
//            .heightIn(min = 56.dp)
//            .fillMaxWidth()
//            .clip(RoundedCornerShape(5.dp))
//    )
//
//}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar() {
    var searchQuery by remember { mutableStateOf(TextFieldValue("")) }

    OutlinedTextField(value = searchQuery, onValueChange = { newValue -> searchQuery = newValue },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        label = { Text(text = "Search")},
        singleLine = true,
        shape = RoundedCornerShape(20.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = MaterialTheme.colorScheme.primary,
            unfocusedBorderColor = Color.Gray
        ))


}


@Preview
@Composable
fun SearchBarPreview() {
    SearchBar()
}