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

    object Driver1: AppScreens("Ruta_conductor_pasajero1")
    object Driver2: AppScreens("Ruta_conductor_pasajero2")
    object Driver3: AppScreens("Ruta_conductor_pasajero3")
    object Driver4: AppScreens("Ruta_conductor_pasajero4")
    object Driver5: AppScreens("Ruta_conductor_pasajero5")

    object Passenger1: AppScreens("Ruta_conductor_pasajero6")
    object Passenger2: AppScreens("Ruta_conductor_pasajero7")
    object Passenger3: AppScreens("Ruta_conductor_pasajero8")
    object Passenger4: AppScreens("Ruta_conductor_pasajero9")
    object Passerger5: AppScreens("Ruta_conductor_pasajero10")








}