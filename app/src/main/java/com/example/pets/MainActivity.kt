package com.example.pets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import com.example.pets.components.ExampleCenterAlignedTopAppBar
import com.example.pets.components.ExampleExtendedFloatingActionButton
import com.example.pets.components.ExampleFloatingActionButton
import com.example.pets.components.ExampleLargeTopAppBar
import com.example.pets.components.ExampleMediumTopAppBar
import com.example.pets.components.ExampleSmallTopAppBar
import com.example.pets.ui.theme.PetsTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PetsTheme {
                ExampleFloatingActionButton()
                // ExampleExtendedFloatingActionButton()

                // ExampleSmallTopAppBar()
                // ExampleMediumTopAppBar()
                // ExampleLargeTopAppBar()
                // ExampleCenterAlignedTopAppBar()

                // ExampleColumn()
                // ExampleRow()
                // ExampleBox()
                // ExampleLazyColumn()
                // ExampleLazyRow()
                // ExampleLazyVerticalGrid()
                // ExampleLazyHorizontalGrid()
                // ExampleConstraintLayout()
            }
        }
    }
}