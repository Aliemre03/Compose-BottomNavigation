package com.example.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(){
    Box(modifier = Modifier.fillMaxSize().background(Color.DarkGray), contentAlignment = Alignment.Center) {
        Text("Home", fontSize = MaterialTheme.typography.h3.fontSize, fontWeight = FontWeight.Bold, color = Color.White)
    }
}

@Composable
fun ProfileScreen(){
    Box(modifier = Modifier.fillMaxSize().background(Color.Magenta), contentAlignment = Alignment.Center) {
        Text("Profile", fontSize = MaterialTheme.typography.h3.fontSize, fontWeight = FontWeight.Bold, color = Color.White)
    }
}

@Composable
fun SettingsScreen(){
    Box(modifier = Modifier.fillMaxSize().background(Color.Cyan), contentAlignment = Alignment.Center) {
        Text("Settings", fontSize = MaterialTheme.typography.h3.fontSize, fontWeight = FontWeight.Bold, color = Color.White)
    }
}
