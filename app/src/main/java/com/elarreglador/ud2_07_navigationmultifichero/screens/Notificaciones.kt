package com.elarreglador.ud2_07_navigationmultifichero.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun Notificaciones() {
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
        Button(onClick = { /*TODO*/ }){
            Icon(
                Icons.Filled.Home,
                contentDescription = "Check!"
            )
            Text("Nagegar a Home")
        }
        Button(onClick = { /*TODO*/ }){
            Text("Nagegar a la Favoritos")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun previoNotificaciones() {
    Notificaciones()
}