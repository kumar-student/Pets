package com.example.pets.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pets.ui.theme.PetsTheme

@Composable
fun ExampleBottomNavigationBar() {
    NavigationBar(
        modifier = Modifier.fillMaxWidth(),
        containerColor = MaterialTheme.colorScheme.background,
        content = {
            NavigationBarItem(
                selected = false, onClick = { /*TODO*/ },
                icon = {
                    Icon(
                        imageVector = Icons.Rounded.Home,
                        contentDescription = "Home Screen"
                    )
                },
                label = {
                    Text(text = "Home")
                }
            )

            NavigationBarItem(
                selected = false, onClick = { /*TODO*/ },
                icon = {
                    Icon(
                        imageVector = Icons.Rounded.ShoppingCart,
                        contentDescription = "Cart Screen"
                    )
                },
                label = {
                    Text(text = "Cart")
                }
            )

            NavigationBarItem(
                selected = false, onClick = { /*TODO*/ },
                icon = {
                    Icon(
                        imageVector = Icons.Rounded.AccountCircle,
                        contentDescription = "Account Screen"
                    )
                },
                label = {
                    Text(text = "Account")
                }
            )
        }
    )
}


@Preview
@Composable
fun ExampleBottomNavigationBarPreview() {
    PetsTheme {
        ExampleBottomNavigationBar()
    }
}