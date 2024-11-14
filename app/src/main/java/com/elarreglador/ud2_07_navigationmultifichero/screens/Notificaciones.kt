package com.elarreglador.ud2_07_navigationmultifichero.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun Notificaciones(navController: NavController) {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("Esta es la pantalla de notificaciones")
        Icon(
            Icons.Filled.Notifications,
            contentDescription = "Check!"
        )
        Spacer(modifier = Modifier.height(10.dp))
        Button( // Navegar a la pantalla principal
            onClick = { navController.navigate("principal") }
        ){
            Icon(
                Icons.Filled.Home,
                contentDescription = "Check!"
            )
            Text("navController.navigate(\"principal\")")
        }
        Button( // Navegar a la pantalla de favoritos
            onClick = { navController.navigate("favoritos") }
        ){
            Icon(
                Icons.Filled.Star,
                contentDescription = "Check!"
            )
            Text("navController.navigate(\"favoritos\")")
        }
        Button( // Regresar a la pantalla de la que vienes
            onClick = { navController.popBackStack() }
        ){
            Icon(
                Icons.Filled.ArrowBack,
                contentDescription = "Check!"
            )
            Text("navController.popBackStack()")
        }
    }
}
