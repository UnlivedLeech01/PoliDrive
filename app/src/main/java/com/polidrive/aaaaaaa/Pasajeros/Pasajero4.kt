package com.polidrive.aaaaaaa.Pasajeros

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.polidrive.aaaaaaa.R

@Composable
fun pantallaMenuRegistroPasajero4 (navController: NavController){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF975C6D))
    ) {
        Row {
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Spacer(modifier = Modifier.height(30.dp))
                Row {
                    Text(
                        text = "Perfil",
                        fontSize = 50.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.width(130.dp))
                    Image(
                        painter = painterResource(id = R.drawable.f_elconfidencial_com_original_317_ae0_456_317ae0456e63bd37ce7fa809d5955672),
                        contentDescription = "foto de perfil",
                        modifier = Modifier
                            .size(80.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                }

                datosPerfilPasajero4()

                Spacer(modifier = Modifier.height(320.dp))

                Row(Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End){
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)),


                        ) {
                        Text(text = "Conductores")
                    }
                    Spacer(modifier = Modifier.width(150.dp))
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)),


                        ) {
                        Text(text = "Ruta")
                    }
                    Text(text = "      ")
                }

            }
        }

    }


}
@Composable
fun datosPerfilPasajero4() {
    Spacer(modifier = Modifier.height(30.dp))
    Box(
        modifier = Modifier
            .background(color = Color(0xFFD8C3CC), RoundedCornerShape(20.dp))
            .width(390.dp)
    ) {
        Row(horizontalArrangement = Arrangement.SpaceBetween) {
            Column {
                // Nombre del usuario
                Spacer(modifier = Modifier.height(10.dp)) // Espaciado de 45dp
                Text(
                    text = "Fernanda Michelle",
                    modifier = Modifier
                        .background(
                            color = Color(0xFF880B56),
                            shape = RoundedCornerShape(20.dp)
                        )
                        .width(200.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    color = Color.White,
                )
                Spacer(modifier = Modifier.height(45.dp)) // Espaciado de 45dp
                // Teléfono
                Text(
                    text = "5528487989",
                    modifier = Modifier
                        .background(
                            color = Color(0xFF880B56),
                            shape = RoundedCornerShape(20.dp)
                        )
                        .width(200.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    color = Color.White,
                )
                Spacer(modifier = Modifier.height(45.dp)) // Espaciado de 45dp
                // Correo Institucional
                Text(
                    text = "fdoming@alumno.ipn",
                    modifier = Modifier
                        .background(
                            color = Color(0xFF880B56),
                            shape = RoundedCornerShape(20.dp)
                        )
                        .width(200.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    color = Color.White,
                )
                Spacer(modifier = Modifier.height(45.dp)) // Espaciado de 45dp
                // Dirección
                Text(
                    text = "Cerca de Lindavista",
                    modifier = Modifier
                        .background(
                            color = Color(0xFF880B56),
                            shape = RoundedCornerShape(20.dp)
                        )
                        .width(200.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    color = Color.White,
                )
                Spacer(modifier = Modifier.height(45.dp)) // Espaciado de 45dp
                // Horario debajo de Dirección
                Text(
                    text = "N/A",
                    modifier = Modifier
                        .background(
                            color = Color(0xFF880B56),
                            shape = RoundedCornerShape(20.dp)
                        )
                        .width(200.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    color = Color.White,
                )
                Spacer(modifier = Modifier.height(10.dp)) // Espaciado de 45dp

            }
            Column {
                // Rol
                Spacer(modifier = Modifier.height(10.dp)) // Espaciado de 45dp
                Text(
                    text = "Dominguez Moreno",
                    modifier = Modifier
                        .background(
                            color = Color(0xFF880B56),
                            shape = RoundedCornerShape(20.dp)
                        )
                        .width(250.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    color = Color.White,
                )
                Spacer(modifier = Modifier.height(45.dp)) // Espaciado de 45dp
                // Apellidos
                Text(
                    text = "Pasajera",
                    modifier = Modifier
                        .background(
                            color = Color(0xFF880B56),
                            shape = RoundedCornerShape(20.dp)
                        )
                        .width(250.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    color = Color.White,
                )
                Spacer(modifier = Modifier.height(45.dp)) // Espaciado de 45dp
                // No. Boleta
                Text(
                    text = "2020564889",
                    modifier = Modifier
                        .background(
                            color = Color(0xFF880B56),
                            shape = RoundedCornerShape(20.dp)
                        )
                        .width(250.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    color = Color.White,
                )
                Spacer(modifier = Modifier.height(45.dp)) // Espaciado de 45dp
                // Edad
                Text(
                    text = "22 años",
                    modifier = Modifier
                        .background(
                            color = Color(0xFF880B56),
                            shape = RoundedCornerShape(20.dp)
                        )
                        .width(250.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    color = Color.White,
                )
                Spacer(modifier = Modifier.height(45.dp)) // Espaciado de 45dp
                // Horario debajo de Edad
                Text(
                    text = "N/A",
                    modifier = Modifier
                        .background(
                            color = Color(0xFF880B56),
                            shape = RoundedCornerShape(20.dp)
                        )
                        .width(250.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    color = Color.White,
                )
                Spacer(modifier = Modifier.height(10.dp)) // Espaciado de 45dp

            }
        }
    }//Aqui
}



