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
fun pantallaMenuRegistroConductor5 (navController: NavController){

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
                        painter = painterResource(id = R.drawable.yurgen),
                        contentDescription = "foto de perfil",
                                modifier = Modifier
                                .size(80.dp)
                            .clip(CircleShape)
                        //Text(text = "      ")
                        //.align(Alignment.Center)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                }

                datosPerfilConductor5()
                Row(horizontalArrangement = Arrangement.Center){
                    Spacer(modifier = Modifier.width(50.dp))
                    Box() {
                        androidx.compose.foundation.Image(
                            painter = painterResource(id = R.drawable.leopard2a7),
                            contentDescription = "Logo",
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
                        onClick = {navController.navigate(route = AppScreens.CONDUCTORES.route)},
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
fun datosPerfilConductor5() {
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
                    text = "Yurgen",
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
                    text = "0800999999",
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
                    text = "ymagicf@alumno.ipn",
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
                    text = "Cerca del cielo",
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
                    text = "leopard 2a7",
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
                    text = "Magic Flores",
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
                    text = "Conductor",
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
                    text = "2019654819",
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
                    text = "21 años",
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
                    text = "PZKPFW",
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
fun pantallaRegistroPreviewConductor5()
{
    pantallaMenuRegistroConductor5()
}*/
