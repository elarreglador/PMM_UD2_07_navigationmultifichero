# Navegación Múltiple en Jetpack Compose
Este proyecto es una aplicación de Android que utiliza Jetpack Compose para la navegación entre múltiples pantallas (Home, Favoritos y Notificaciones). Se implementa un sistema de navegación mediante NavController y NavHost, facilitando la navegación entre diferentes pantallas.

## Estructura del Proyecto
El proyecto se organiza en tres paquetes principales:

- MainActivity: La actividad principal donde se inicializa Navegador.
- navegacion: Contiene el componente Navegador que maneja la lógica de navegación.
- screens: Incluye tres composables (Home, Favoritos, y Notificaciones) que representan las diferentes pantallas de la aplicación.

## Configuración de Dependencias
Para que NavController funcione, se requiere ( y he agregado ) ciertas lineas de texto en ciertos archivos de gradle:

### /gradle/libs.versions.toml
```
  [versions]
     compose-navigation = "2.5.3"
  [libraries]
     implementation(libs.androidx.navigation.compose)
```
### /App/build.gradle.kts
```
  dependencies {
      androidx-navigation-compose = { module = "androidx.navigation:navigation-compose", version = "2.8.3" }
  }
```

## Componentes Principales
### MainActivity
MainActivity es el punto de entrada de la aplicación y llama a Navegador, que administra la navegación entre las pantallas.

### Navegador
La función Navegador utiliza NavHost y NavController para manejar la navegación de las tres pantallas (Home, Favoritos, y Notificaciones). Define las rutas que cada pantalla puede utilizar.

### Pantallas
#### Home: 
Pantalla principal con opciones para navegar a Favoritos o Notificaciones.
#### Favoritos: 
Pantalla de favoritos con un botón para regresar a Home o navegar a Notificaciones.
#### Notificaciones: 
Pantalla de notificaciones con un botón para regresar a Home o navegar a Favoritos.

Cada pantalla incluye un Button que permite navegar a otras pantallas o volver a la pantalla anterior usando navController.popBackStack().