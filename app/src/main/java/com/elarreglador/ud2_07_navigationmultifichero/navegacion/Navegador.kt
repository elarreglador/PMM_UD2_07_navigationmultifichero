package com.elarreglador.ud2_07_navigationmultifichero.navegacion

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringArrayResource
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.elarreglador.ud2_07_navigationmultifichero.screens.Favoritos
import com.elarreglador.ud2_07_navigationmultifichero.screens.Home
import com.elarreglador.ud2_07_navigationmultifichero.screens.Notificaciones

@Composable
fun Navegador() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "principal") {
        // (route es el apodo para llamar a la ventana) {funcion/pantalla + parametro a usar}
        // En este caso hay tres funciones que NavHost toma a modo de opcion

        composable( // ventana principal o home
            route = "principal"
        ) {
            Home(navController)
        }

        composable( // ventana de favoritos
            route = "favoritos"
        ) {
            Favoritos(navController)
        }

        composable( // ventana de notificaciones
            route = "notificaciones"
        ) {
            Notificaciones(navController)
        }
    }
}