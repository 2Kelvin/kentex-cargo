package com.example.kentexcargo.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kentexcargo.ui.theme.KentexCargoTheme

/** Screen for adding a package(s) to be tracked */
@Composable
fun AddScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        // assisted shopping
        ReusableCategories(
            title = "Assisted Shopping",
            text1 = "You live in Kenya",
            text2 = "You want us to shop and ship on your behalf",
            text3 = "Get a quote for shop and ship service",
            buttonText = "Get Assisted Shopping"
        )
        // shipping only
        ReusableCategories(
            title = "Shipping Only Order",
            text1 = "You can shop online without assistance",
            text2 = "You live in the US and you sent a package to our warehouse",
            text3 = "Create a notification and tell us the tracking and the receiver",
            buttonText = "Create a notification"
        )
        // add a receiver
        ReusableCategories(
            title = "Add a Receiver",
            text1 = "Receivers can only be in Kenya",
            text2 = "Add them to ship to them",
            text3 = "We only need their name and contact details",
            buttonText = "Generate a Warehouse Code"
        )
    }
}

/** Reusable card for shipping categories */
@Composable
fun ReusableCategories(
    title: String,
    text1: String,
    text2: String,
    text3: String,
    buttonText: String,
    modifier: Modifier = Modifier
) {
    ElevatedCard {
        Text(text = title, modifier = modifier.padding(bottom = 8.dp))
        ReusableDotList(
            listItemTxt1 = text1,
            listItemTxt2 = text2,
            listItemTxt3 = text3,
        )
        Button(onClick = {}, modifier = modifier.padding(top = 8.dp)) {
            Text(text = buttonText)
        }
    }
}

/** Reusable dot list component */
@Composable
fun ReusableDotList(
    listItemTxt1: String,
    listItemTxt2: String,
    listItemTxt3: String,
    modifier: Modifier = Modifier
) {
    Column {
        Row {
            Text(text = "\u2022", modifier = modifier.padding(end = 4.dp))
            Text(text = listItemTxt1)
        }
        Row {
            Text(text = "\u2022", modifier = modifier.padding(end = 4.dp))
            Text(text = listItemTxt2)
        }
        Row {
            Text(text = "\u2022", modifier = modifier.padding(end = 4.dp))
            Text(text = listItemTxt3)
        }
    }
}

/** Preview for Add screen */
@Preview
@Composable
fun AddScreenPreview() {
    KentexCargoTheme {
        AddScreen()
    }
}