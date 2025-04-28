package com.example.pets.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.pets.ui.theme.PetsTheme

@Composable
fun ExampleBottomAppBar() {
    BottomAppBar(
        actions = {
            Icon(imageVector = Icons.Rounded.Home, contentDescription = "Home")
            Icon(imageVector = Icons.Rounded.ShoppingCart, contentDescription = "Cart")
            Icon(imageVector = Icons.Rounded.AccountCircle, contentDescription = "Account")
        },
        floatingActionButton = {
            ExampleFloatingActionButton()
        }
    )
}

@Preview
@Composable
fun ExampleBottomAppBarPreview() {
    PetsTheme {
        ExampleBottomAppBar()
    }
}