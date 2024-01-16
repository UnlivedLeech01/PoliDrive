package com.polidrive.aaaaaaa.Conductores

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.polidrive.aaaaaaa.Navigation.AppScreens
import com.polidrive.aaaaaaa.R


@Composable
fun pantallaMenuRegistroConductor2 (navController: NavController){

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
                        painter = painterResource(id = R.drawable._0_cualidades_que_te_hacen_mas_atractiva),
                        contentDescription = "foto de perfil",
                        modifier = Modifier
                            .size(80.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                }

                datosPerfilConductor2()
                Row(horizontalArrangement = Arrangement.Center){
                    Spacer(modifier = Modifier.width(50.dp))
                    Box() {
                        androidx.compose.foundation.Image(
                            painter = painterResource(id = R.drawable._99507585_mediaitem99501693),
                            contentDescription = "JeepMamalona",
                            modifier = Modifier
                                .size(275.dp)
                                .clip(CircleShape)
                                .align(Alignment.Center)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(55.dp))

                Row(Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End){
                    Button(
                        onClick = { navController.navigate(route = AppScreens.CONDUCTORES.route) },
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
        Spacer(modifier = Modifier.width(10.dp))

    }


}
@Composable
fun datosPerfilConductor2() {
    Spacer(modifier = Modifier.height(30.dp))
    Box(
        modifier = Modifier
            .background(color = Color(0xFFD8C3CC), RoundedCornerShape(20.dp))
            .width(373.dp)
    ) {
        Row(horizontalArrangement = Arrangement.SpaceBetween) {
            Column {
                // Nombre del usuario
                Spacer(modifier = Modifier.height(10.dp)) // Espaciado de 45dp
                Text(
                    text = "Brenda",
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
                    text = "5578894556",
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
                    text = "bperezp@alumno.ipn",
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
                    text = "Cerca de Polanco",
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
                    text = "Jeep 2023",
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
                    text = "Perez Perez",
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
                    text = "Conductora",
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
                    text = "2022366545",
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
                    text = "23 años",
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
                    text = "MG-7896",
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
/*
@Preview(showBackground = true)
@Composable
fun pantallaRegistroPreviewConductor2()
{
    pantallaMenuRegistroConductor2()
}*/

