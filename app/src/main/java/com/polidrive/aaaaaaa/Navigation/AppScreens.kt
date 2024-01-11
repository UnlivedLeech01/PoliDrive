package com.polidrive.aaaaaaa.Navigation

sealed class AppScreens(val route: String){
    object SplashScreen: AppScreens("splash_screen")
    object MainScreen: AppScreens("main_screen")
    object Pantalla1: AppScreens("pantalla_1")
    object Pantalla2: AppScreens("pantalla_2")
    object Pantalla3: AppScreens("pantalla_3")
    object Pantalla4: AppScreens("pantalla_4")
    object Pantalla5: AppScreens("pantalla_5")
    object REGISTRO: AppScreens("pantalla_registro")
    object CONDUCTORES: AppScreens("menu_conductores")
    object Ruta1: AppScreens("Ruta_escom")
    object Ruta2: AppScreens("Ruta_conductor_pasajero")

}