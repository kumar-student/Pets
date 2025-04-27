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
fun PacktSmallTopAppBar() {
    TopAppBar(
        title = {
            Text(text = "Small Top Appbar")
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PacktMediumTopAppBar() {
    MediumTopAppBar(
        title = {
            Text(text = "Medium Top Appbar")
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PacktLargeTopAppBar() {
    LargeTopAppBar(
        title = {
            Text(text = "Large Top Appbar")
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PacktCenterAlignedTopAppBar() {
    CenterAlignedTopAppBar(
        title = {
            Text(text = "Center Aligned Top Appbar")
        }
    )
}

@Preview
@Composable
fun PacktSmallTopAppBarPreview() {
    PetsTheme {
        PacktSmallTopAppBar()
    }
}

@Preview
@Composable
fun PacktMediumTopAppBarPreview() {
    PetsTheme {
        PacktMediumTopAppBar()
    }
}

@Preview
@Composable
fun PacktLargeTopAppBarPreview() {
    PetsTheme {
        PacktLargeTopAppBar()
    }
}

@Preview
@Composable
fun PacktCenterAlignedTopAppBarPreview() {
    PetsTheme {
        PacktCenterAlignedTopAppBar()
    }
}