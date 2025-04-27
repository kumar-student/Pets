package com.example.pets.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pets.ui.theme.PetsTheme

@Composable
fun ExampleFloatingActionButton() {
    FloatingActionButton(
        onClick = { /*TODO*/ },
        content = {
            Icon(
                imageVector = Icons.Default.Add ,
                contentDescription = "New Chat"
            )
        }
    )
}

@Composable
fun ExampleExtendedFloatingActionButton() {
    ExtendedFloatingActionButton(
        onClick = { /*TODO*/ },
        content = {
            Icon(
                imageVector = Icons.Default.Add ,
                contentDescription = "New Chat"
            )
            Text(
                modifier = Modifier.padding(10.dp),
                text = "New Chat"
            )
        }
    )
}

@Preview
@Composable
fun ExampleExtendedFloatingActionButtonPreview() {
    PetsTheme {
        Column(
            modifier = Modifier
                .width(400.dp)
                .height(200.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ExampleExtendedFloatingActionButton()
        }
    }
}

@Preview
@Composable
fun ExampleFloatingActionButtonPreview() {
    PetsTheme {
        Column(
            modifier = Modifier.size(200.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ExampleFloatingActionButton()
        }
    }
}