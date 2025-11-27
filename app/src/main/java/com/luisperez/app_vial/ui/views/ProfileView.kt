package com.luisperez.app_vial.ui.views

import android.R
import android.R.attr.tint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Create
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.luisperez.app_vial.ui.theme.backgroundColor
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily

@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileView() {
    Scaffold(
        modifier = Modifier,
        containerColor = backgroundColor,
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Transparent
                ),
                title = {
                    Text("")
                },
                actions = {
                    IconButton(
                        onClick = {
                            //ACÁ VA EL .POPSTACKBACK
                        }
                    ) {
                        Icon(
                            modifier = Modifier
                                .size(30.dp),
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "",
                            tint = Color.White
                        )
                    }
                    Spacer(
                        modifier = Modifier
                            .padding(start = 300.dp)
                    )
                    IconButton(onClick = {}
                    ) {
                        Icon(
                            modifier = Modifier
                                .size(30.dp),
                            imageVector = Icons.Default.Create,
                            contentDescription = "",
                            tint = Color.White
                        )
                    }
                }
            )
        }
    ) {
        ProfileContent(it)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileContent(paddingValues: PaddingValues) {
    Column(
        modifier = Modifier
            .padding(paddingValues),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(
            modifier = Modifier
                .padding(top = 20.dp)
        )
        Text(
            "Mi perfil",
            color = Color.LightGray,
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            modifier = Modifier
                .padding(horizontal = 15.dp)
                .fillMaxWidth()
        )
        Icon(
            imageVector = Icons.Default.AccountCircle,
            contentDescription = "Icono de perfil",
            tint = Color.LightGray,
            modifier = Modifier
                .padding(top = 20.dp)
                .size(150.dp),
        )
        Spacer(
            modifier = Modifier
                .padding(5.dp)
        )
        Text(
            "Nombre",
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, start = 20.dp),
            fontWeight = FontWeight.SemiBold,
            fontSize = 22.sp
        )
        Spacer(
            modifier = Modifier
                .padding(1.dp)
        )
        Text(
            "Antonio Gutiérrez Velazquez",
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            fontSize = 22.sp
        )

        Spacer(
            modifier = Modifier
                .padding(5.dp)
        )
        Text(
            "Número de teléfono",
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, start = 20.dp),
            fontWeight = FontWeight.SemiBold,
            fontSize = 22.sp
        )
        Spacer(
            modifier = Modifier
                .padding(5.dp)
        )
        Text(
            "963 1269 3310",
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            fontSize = 22.sp
        )

        Spacer(
            modifier = Modifier
                .padding(5.dp)
        )
        Text(
            "Correo electrónico",
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, start = 20.dp),
            fontWeight = FontWeight.SemiBold,
            fontSize = 22.sp
        )
        Spacer(
            modifier = Modifier
                .padding(5.dp)
        )
        Text(
            "alejandro@gmail.com",
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, start = 20.dp),
            fontSize = 22.sp
        )
    }
}