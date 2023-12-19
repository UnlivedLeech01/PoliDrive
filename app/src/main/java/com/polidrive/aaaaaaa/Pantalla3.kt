package com.polidrive.aaaaaaa

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.polidrive.aaaaaaa.Navigation.AppScreens

@Composable
fun ThirdScreen(navController: NavController){
    Image(painter = painterResource(id = R.drawable.a4),
        contentDescription = "Logo de Polidrive",
        modifier = Modifier.fillMaxSize()
    )
    Row(Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center){
        Text(text = "     ")
        Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center){//va a rol
            Text(text = "    ")
            Button(
                onClick = { navController.navigate(route = AppScreens.Pantalla2.route) }) {
                Text(text = "Siguiente")

            }

        }
    }
}

