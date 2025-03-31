package com.example.kentexcargo.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kentexcargo.ui.theme.KentexCargoTheme

/** Home Screen */
@Composable
fun DashboardScreen(modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "MY USA WAREHOUSE ADDRESS",
            modifier = modifier.padding(bottom = 12.dp)
        )

        OutlinedCard {
            ReusableRow(infoTitle = "Name: ", userInfo = "Kelvin Mwangi KM4697")
            ReusableRow(infoTitle = "Address: ", userInfo = "2120 Hutton Drive")
            ReusableRow(infoTitle = "Suite: ", userInfo = "Suite 300")
            ReusableRow(infoTitle = "State: ", userInfo = "Texas")
            ReusableRow(infoTitle = "Zip Code: ", userInfo = "75006-6880")
            ReusableRow(infoTitle = "Phone: ", userInfo = "4693076571")
        }
    }
}

@Composable
fun ReusableRow(
    infoTitle: String,
    userInfo: String,
    modifier: Modifier = Modifier.size(480.dp)
) {
    Text(
        text = infoTitle,
        fontWeight = FontWeight.Bold
    )
    Text(text = userInfo)
}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview() {
    KentexCargoTheme {
        DashboardScreen()
    }
}