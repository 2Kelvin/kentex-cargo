package com.example.kentexcargo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kentexcargo.ui.theme.KentexCargoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KentexCargoTheme {
                App()
            }
        }
    }
}

/** * Scaffold holding all the bottom nav icons */
@Composable
fun App(modifier: Modifier = Modifier) {
    Scaffold(
        bottomBar = { CustomBottomAppbar() },
        modifier = modifier.fillMaxSize()// bottom appbar
    ) { innerPadding ->
        // Todo (add clicked page content here)
        Text(
            text = "Clicked page content goes here",
            modifier = modifier.padding(innerPadding)
        )
    }
}

/** custom bottom appbar */
@Composable
fun CustomBottomAppbar(modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.fillMaxWidth().padding(bottom = 2.dp)
    ) {
        // dashboard (home) icon
        IconButton(onClick = {}, modifier = Modifier.padding(end = 12.dp).weight(1f)) {
            Icon(
                Icons.Default.Home,
                contentDescription = "Home Icon"
            )
        }
        // orders icon
        IconButton(onClick = {}, modifier = Modifier.padding(end = 12.dp).weight(1f)) {
            Icon(
                Icons.Default.ShoppingCart,
                contentDescription = "Orders Icon"
            )
        }

        // floating action button to add packages to be tracked
        FloatingActionButton(
            onClick = {},
            modifier = modifier.clip(CircleShape)
        ) {
            Icon(Icons.Filled.Add, "Add package to track")
        }

        // plans + pricing icon
        IconButton(onClick = {}, modifier = Modifier.padding(end = 12.dp).weight(1f)) {
            Icon(
                painterResource( R.drawable.baseline_attach_money_24),
                contentDescription = "Pricing Icon"
            )
        }
        // profile and settings icon
        IconButton(onClick = {}, modifier = Modifier.padding(end = 12.dp).weight(1f)) {
            Icon(
                Icons.Default.Person,
                contentDescription = "Account Icon"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KentexCargoTheme {
        App()
    }
}