package com.example.kentexcargo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
fun App(modifier: Modifier = Modifier.fillMaxSize()) {
    Scaffold(
        bottomBar = { // BottomAppBar
            BottomAppBar(
                actions = {
                    // dashboard (home) icon
                    IconButton(onClick = {}, modifier = Modifier.padding(end = 12.dp)) {
                        Icon(
                            Icons.Default.Home,
                            contentDescription = "Home Icon"
                        )
                    }
                    // orders icon
                    IconButton(onClick = {}, modifier = Modifier.padding(end = 12.dp)) {
                        Icon(
                            Icons.Default.ShoppingCart,
                            contentDescription = "Orders Icon"
                        )
                    }
                    // addresses icon
                    IconButton(onClick = {}, modifier = Modifier.padding(end = 12.dp)) {
                        Icon(
                            Icons.Default.LocationOn,
                            contentDescription = "Addresses Icon"
                        )
                    }
                    // plans + pricing icon
                    IconButton(onClick = {}, modifier = Modifier.padding(end = 12.dp)) {
                        Icon(
                            painterResource( R.drawable.baseline_attach_money_24),
                            contentDescription = "Pricing Icon"
                        )
                    }
                    // profile and settings icon
                    IconButton(onClick = {}, modifier = Modifier.padding(end = 12.dp)) {
                        Icon(
                            Icons.Default.Person,
                            contentDescription = "Profile Icon"
                        )
                    }
                },

                // floating action button to add packages to be tracked
                floatingActionButton = {
                    FloatingActionButton(onClick = {/* do something */}) {
                        Icon(Icons.Filled.Add, "Add package to track")
                    }
                }
            )
        }
    ) { innerPadding ->
        // add clicked page content here
        Text(
            text = "Clicked page content goes here",
            modifier = modifier.padding(innerPadding)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KentexCargoTheme {
        App()
    }
}