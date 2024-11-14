package com.elarreglador.ud2_07_navigationmultifichero

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
// Para que navController funcione se requiere de estas importaciones:
import com.elarreglador.ud2_07_navigationmultifichero.navegacion.Navegador

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
            // Llamamos al navegador que abre la funcion/ventana correspondiente
            Navegador()
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun previoMain() {
    Navegador()
}