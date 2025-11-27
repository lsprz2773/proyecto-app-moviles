package com.luisperez.app_vial.ui.views

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview(showBackground = true)
fun CreateReportView(){
    Scaffold(
        topBar = {
            MediumTopAppBar(
                title = { Text(text = "Crear reporte", fontWeight = FontWeight.Bold, fontSize = 35.sp, fontFamily = FontFamily.SansSerif)},
                navigationIcon = {
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(imageVector = Icons.AutoMirrored.Rounded.ArrowBack, contentDescription = "Regresar vista")
                    }
                }
            )
        }
    ) { innerPadding ->
        CreateReportContent(innerPadding)
    }
}

@Composable
fun CreateReportContent(paddingValues: PaddingValues){}