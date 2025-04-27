package com.example.pets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.pets.components.ExampleBottomAppBar
import com.example.pets.components.ExampleCenterAlignedTopAppBar
import com.example.pets.components.ExampleExtendedFloatingActionButton
import com.example.pets.components.ExampleFloatingActionButton
import com.example.pets.components.ExampleLargeTopAppBar
import com.example.pets.components.ExampleMediumTopAppBar
import com.example.pets.components.ExampleScaffold
import com.example.pets.components.ExampleSmallTopAppBar
import com.example.pets.ui.theme.PetsTheme
import com.example.pets.views.PetList

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PetsTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(text = "Pets")
                            },
                            colors = TopAppBarDefaults.topAppBarColors(
                                containerColor = MaterialTheme.colorScheme.primary,
                            )
                        )
                    },
                    content = { paddingValues ->
                        PetList(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(paddingValues)
                        )
                    }
                )

                // ExampleScaffold()

                // ExampleFloatingActionButton()
                // ExampleExtendedFloatingActionButton()

                // ExampleBottomAppBar()

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