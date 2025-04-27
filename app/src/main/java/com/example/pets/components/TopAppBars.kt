package com.example.pets.components

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import com.example.pets.ui.theme.PetsTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExampleSmallTopAppBar() {
    TopAppBar(
        title = {
            Text(text = "Small Top Appbar")
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExampleMediumTopAppBar() {
    MediumTopAppBar(
        title = {
            Text(text = "Medium Top Appbar")
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExampleLargeTopAppBar() {
    LargeTopAppBar(
        title = {
            Text(text = "Large Top Appbar")
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExampleCenterAlignedTopAppBar() {
    CenterAlignedTopAppBar(
        title = {
            Text(text = "Center Aligned Top Appbar")
        }
    )
}

@Preview
@Composable
fun ExampleSmallTopAppBarPreview() {
    PetsTheme {
        ExampleSmallTopAppBar()
    }
}

@Preview
@Composable
fun ExampleMediumTopAppBarPreview() {
    PetsTheme {
        ExampleMediumTopAppBar()
    }
}

@Preview
@Composable
fun ExampleLargeTopAppBarPreview() {
    PetsTheme {
        ExampleLargeTopAppBar()
    }
}

@Preview
@Composable
fun ExampleCenterAlignedTopAppBarPreview() {
    PetsTheme {
        ExampleCenterAlignedTopAppBar()
    }
}