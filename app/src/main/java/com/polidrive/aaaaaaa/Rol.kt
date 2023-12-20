package com.polidrive.aaaaaaa

import androidx.compose.foundation.Image
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
fun MainScreen1(navController: NavController){
    Image(painter = painterResource(id = R.drawable.a3),
        contentDescription = "Logo de Polidrive",
        modifier = Modifier.fillMaxSize()
    )
    Column {
        Spacer(modifier = Modifier.height(655.dp))
        Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center){
            Text(text = "     ")
            Row(Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End){
                Text(text = "    ")
                Button(
                    onClick = { navController.navigate(route = AppScreens.Pantalla3.route) }) {
                    Text(text = "Siguiente")

                }

            }
        }
    }
}

