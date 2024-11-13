



## Configuración de Dependencias
Para que NavController funcione, se requiere agregar ciertas lineas de texto en ciertos archivos de gradle:

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