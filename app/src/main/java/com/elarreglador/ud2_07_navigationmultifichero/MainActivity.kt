package com.elarreglador.ud2_07_navigationmultifichero

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
// Para que navController funcione se requiere de estas importaciones:
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.elarreglador.ud2_07_navigationmultifichero.screens.Home

// Y ademas:
// en /App/build.gradle.kts agregar esta linea en dependencies:
//  [versions]
//     compose-navigation = "2.5.3"
//  [libraries]
//     implementation(libs.androidx.navigation.compose)
// en /gradle/wrapper/lib.versions.toml agregar esta linea:
//  dependencies {
//      androidx-navigation-compose = { module = "androidx.navigation:navigation-compose", version = "2.8.3" }
//  }

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Home()
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun previoMain() {
    Home()
}