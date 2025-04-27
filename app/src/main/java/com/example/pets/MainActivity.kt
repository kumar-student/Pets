package com.example.pets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import com.example.pets.components.PacktCenterAlignedTopAppBar
import com.example.pets.components.PacktLargeTopAppBar
import com.example.pets.components.PacktMediumTopAppBar
import com.example.pets.components.PacktSmallTopAppBar
import com.example.pets.ui.theme.PetsTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PetsTheme {
                PacktSmallTopAppBar()
                // PacktMediumTopAppBar()
                // PacktLargeTopAppBar()
                // PacktCenterAlignedTopAppBar()
                // PacktColumn()
                // PacktRow()
                // PacktBox()
                // PacktLazyColumn()
                // PacktLazyRow()
                // PacktLazyVerticalGrid()
                // PacktLazyHorizontalGrid()
                // PacktConstraintLayout()
            }
        }
    }
}