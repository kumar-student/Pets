package com.example.pets

import android.R
import androidx.compose.foundation.background
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout


@Composable
fun ExampleColumn() {
    var count by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Counter: $count", style = MaterialTheme.typography.bodyLarge)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { count++ }) {
            Text("Increment")
        }
    }
}

@Composable
fun ExampleRow() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Hello")
        Text(text = "Sharp")
        Text(text = "Learners")
    }
}

@Composable
fun ExampleBox() {
    Box(
        modifier = Modifier
            .size(100.dp),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            modifier = Modifier
                .size(80.dp),
            imageVector = Icons.Outlined.Notifications,
            contentDescription = null,
            tint = Color.Green
        )
        Text(text = "10")
    }
}

@Composable
fun ExampleLazyColumn() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        items(100) {
            Text(
                modifier = Modifier
                    .padding(8.dp),
                text = "Item $it"
            )
        }
    }
}

@Composable
fun ExampleLazyRow() {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .padding(8.dp)
    ) {
        items(100) {
            Text(
                modifier = Modifier
                    .padding(8.dp),
                text = "Item $it"
            )
        }
    }
}

@Composable
fun ExampleLazyVerticalGrid() {
    LazyVerticalGrid(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(8.dp),
        columns = GridCells.Fixed(3)
    ) {
        items(100) {
            Text(
                modifier = Modifier
                    .padding(8.dp),
                text = "Item $it"
            )
        }
    }
}

@Composable
fun ExampleLazyHorizontalGrid() {
    LazyHorizontalGrid(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(8.dp),
        rows = GridCells.Fixed(3)
    ) {
        items(100) {
            Text(
                modifier = Modifier
                    .padding(8.dp),
                text = "Item number $it"
            )
        }
    }
}

@Composable
fun ExampleConstraintLayout() {
    ConstraintLayout(
        modifier = Modifier
            .padding(16.dp)
    ) {
        val (icon, text) = createRefs()
        Icon(
            modifier = Modifier
                .size(80.dp)
                .constrainAs(icon) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                },
            imageVector = Icons.Outlined.Notifications,
            contentDescription = null,
            tint = Color.Green
        )
        Text(
            modifier = Modifier
                .constrainAs(text) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(icon.end)
                },
            text = "10",
            style = MaterialTheme.typography.titleLarge
        )
    }
}


@Preview(showBackground = true)
@Composable
fun ExampleColumnPreview() {
    ExampleColumn()
}

@Preview(showBackground = true)
@Composable
fun ExampleRowPreview() {
    ExampleRow()
}

@Preview(showBackground = true)
@Composable
fun ExampleBoxPreview() {
    ExampleBox()
}

@Preview(showBackground = true)
@Composable
fun ExampleLazyColumnPreview() {
    ExampleLazyColumn()
}

@Preview(showBackground = true)
@Composable
fun ExampleLazyRowPreview() {
    ExampleLazyRow()
}

@Preview(showBackground = true)
@Composable
fun ExampleLazyVerticalGridPreview() {
    ExampleLazyVerticalGrid()
}

@Preview(showBackground = true)
@Composable
fun ExampleLazyHorizontalGridPreview() {
    ExampleLazyHorizontalGrid()
}