package com.polidrive.aaaaaaa.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.polidrive.aaaaaaa.Conductores.pantallaMenuRegistroConductor1
import com.polidrive.aaaaaaa.Conductores.pantallaMenuRegistroConductor2
import com.polidrive.aaaaaaa.Conductores.pantallaMenuRegistroConductor3
import com.polidrive.aaaaaaa.Conductores.pantallaMenuRegistroConductor4
import com.polidrive.aaaaaaa.Conductores.pantallaMenuRegistroConductor5
import com.polidrive.aaaaaaa.DriverMap
import com.polidrive.aaaaaaa.FirstScreen
import com.polidrive.aaaaaaa.FourthScreen
import com.polidrive.aaaaaaa.MainMapScreen
import com.polidrive.aaaaaaa.MainMenuConductores
import com.polidrive.aaaaaaa.MainScreen
import com.polidrive.aaaaaaa.MainScreen1
import com.polidrive.aaaaaaa.Pasajeros.pantallaMenuRegistroPasajero1
import com.polidrive.aaaaaaa.Pasajeros.pantallaMenuRegistroPasajero2
import com.polidrive.aaaaaaa.Pasajeros.pantallaMenuRegistroPasajero3
import com.polidrive.aaaaaaa.Pasajeros.pantallaMenuRegistroPasajero4
import com.polidrive.aaaaaaa.Pasajeros.pantallaMenuRegistroPasajero5
import com.polidrive.aaaaaaa.SecondScreen
import com.polidrive.aaaaaaa.SplashScreen
import com.polidrive.aaaaaaa.ThirdScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController
        , startDestination = AppScreens.SplashScreen.route){
        composable(AppScreens.SplashScreen.route){
            SplashScreen(navController)
        }
        composable(AppScreens.MainScreen.route){
            MainScreen(navController)
        }
        composable(AppScreens.Pantalla1.route){
            FirstScreen(navController)
        }
        composable(AppScreens.Pantalla2.route){
            SecondScreen(navController)
        }
        composable(AppScreens.Pantalla3.route){
            ThirdScreen(navController)
        }
        composable(AppScreens.Pantalla4.route){
            FourthScreen(navController)
        }
        composable(AppScreens.Pantalla5.route){
            MainScreen1(navController)
        }
        composable(AppScreens.CONDUCTORES.route){
            MainMenuConductores(navController)
        }
        composable(AppScreens.Ruta1.route){
            MainMapScreen(navController)
        }
        composable(AppScreens.Ruta2.route){
            DriverMap(navController)
        }
        composable(AppScreens.Driver1.route){
            pantallaMenuRegistroConductor1(navController)
        }
        composable(AppScreens.Driver2.route){
            pantallaMenuRegistroConductor2(navController)
        }
        composable(AppScreens.Driver3.route){
            pantallaMenuRegistroConductor3(navController)
        }
        composable(AppScreens.Driver4.route){
            pantallaMenuRegistroConductor4(navController)
        }
        composable(AppScreens.Driver5.route){
            pantallaMenuRegistroConductor5(navController)
        }

        composable(AppScreens.Passenger1.route){
            pantallaMenuRegistroPasajero1(navController)
        }
        composable(AppScreens.Passenger2.route){
            pantallaMenuRegistroPasajero2(navController)
        }
        composable(AppScreens.Passenger3.route){
            pantallaMenuRegistroPasajero3(navController)
        }
        composable(AppScreens.Passenger4.route){
            pantallaMenuRegistroPasajero4(navController)
        }
        composable(AppScreens.Passerger5.route){
            pantallaMenuRegistroPasajero5(navController)
        }

    }
}