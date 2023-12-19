package com.polidrive.aaaaaaa

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.polidrive.aaaaaaa.Navigation.AppScreens

@Composable
fun FirstScreen (navController: NavController){
    androidx.compose.foundation.Image(
        painter = painterResource(id = R.drawable.a2),
        contentDescription = "Logo de Polidrive",
        modifier = Modifier.fillMaxSize()
    )
    Column {
        Spacer(modifier = Modifier.height(20.dp))
        Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center){
            Text(text = "     ")
            Row(Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center){
                Text(text = "    ")
                Button(
                    onClick = { navController.navigate(route = AppScreens.Pantalla5.route) }) {
                    Text(text = "Siguiente")

                }

            }
        }
    }
}



