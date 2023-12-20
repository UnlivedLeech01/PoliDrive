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
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.polidrive.aaaaaaa.Navigation.AppScreens

@Composable
fun ThirdScreen(navController: NavController){
    Image(painter = painterResource(id = R.drawable.a4),
        contentDescription = "Logo de Polidrive",
        modifier = Modifier.fillMaxSize()
    )
    Column {
        Spacer(modifier = Modifier.height(655.dp))
        Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center){
            Text(text = "     ")
            Row(Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End){//va a rol
                Text(text = "    ")
                Button(
                    onClick = { navController.navigate(route = AppScreens.Pantalla2.route) },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF880B56))) {
                    Text(text = "Siguiente")


                }

            }
        }
    }
}

