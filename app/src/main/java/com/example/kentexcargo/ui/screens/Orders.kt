package com.example.kentexcargo.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kentexcargo.App
import com.example.kentexcargo.ui.theme.KentexCargoTheme

/**
 *  Orders screen
 *  Lists all assisted and self-shipped packages and their status
 */
@Composable
fun OrdersScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        // todo
    }
}

/** One self-shipped package card */
@Composable
fun ReusablePackageItem(
    packageName: String,
    cost: Double,
    trackingNumber: Int,
    status: String,
    deliveredInWHDate: String,
    shipTo: String,
    createdOnDate: String,
    modifier: Modifier = Modifier
) {
    OutlinedCard {
        Column {
            //todo
        }
    }
}

/** One order request package item */
@Composable
fun ReusableOrderRequestItem(
    orderNumber: Int,
    date: String,
    status: String,
    totalCost: Double,
    action: String,
    modifier: Modifier = Modifier
) {
    OutlinedCard {
        Column {
            //todo
        }
    }
}

/** Preview */
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KentexCargoTheme {
        App()
    }
}