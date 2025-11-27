package com.luisperez.app_vial.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LoginView(){
}

@Composable
fun LoginBox(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFD4D7D8))
        .padding(16.dp),
        contentAlignment = Alignment.Center
    ){
        Card(modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(0.9f),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation()){  }
    }
}