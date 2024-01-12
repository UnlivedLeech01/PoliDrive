package com.polidrive.aaaaaaa

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.polidrive.aaaaaaa.Navigation.AppScreens

@Composable
fun MainMenuPasajeros(navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF975C6D))
    ) {
        Row {
            Spacer(modifier = Modifier.width(20.dp))
            Column {
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    text = "Pasajeros",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
                passengerList(navController)
            }
            Spacer(modifier = Modifier.width(20.dp))
        }
    }

}

@Composable
fun passengerList(navController: NavController) {
    Column(modifier = Modifier) {
        Spacer(modifier = Modifier.height(30.dp))
        Box(
            modifier = Modifier
                .background(color = Color(0xFFD8C3CC), RoundedCornerShape(20.dp))
                .width(370.dp)
        ) {
            Row {
                //De perfil
                Image(
                    painter = painterResource(id = R.drawable.persona_70),
                    contentDescription = "foto de perfil"
                )
                Column {
                    //Nombre conductor
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Marco Antonio",
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
                    Row(
                        modifier = Modifier.width(250.dp),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        //Auto
                        Button(
                            onClick = { navController.navigate(route = AppScreens.Passenger1.route)},
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000))

                        ) {
                            Text(text = "Perfil")
                        }
                        //Ruta
                        Button(
                            onClick = {
                            },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000))

                        ) {
                            Text(text = "Ruta")
                        }
                        Spacer(modifier = Modifier.width(20.dp))

                    }
                }
            }

        }
        Spacer(modifier = Modifier.height(30.dp))
        Box(
            modifier = Modifier
                .background(color = Color(0xFFD8C3CC), RoundedCornerShape(20.dp))
                .width(370.dp)
        ) {
            Row {
                //De perfil
                Image(
                    painter = painterResource(id = R.drawable.persona_70),
                    contentDescription = "foto de perfil"
                )
                Column {
                    //Nombre conductor
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Jorge Arturo",
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
                    Row(
                        modifier = Modifier.width(250.dp),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        //Auto
                        Button(
                            onClick = { navController.navigate(route = AppScreens.Passenger2.route)
                            },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000))

                        ) {
                            Text(text = "Perfil")
                        }
                        //Ruta
                        Button(
                            onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000))

                        ) {
                            Text(text = "Ruta")
                        }
                        Spacer(modifier = Modifier.width(20.dp))

                    }
                }
            }

        }
        Spacer(modifier = Modifier.height(30.dp))
        Box(
            modifier = Modifier
                .background(color = Color(0xFFD8C3CC), RoundedCornerShape(20.dp))
                .width(370.dp)
        ) {
            Row {
                //De perfil
                Image(
                    painter = painterResource(id = R.drawable.persona_70),
                    contentDescription = "foto de perfil"
                )
                Column {
                    //Nombre conductor
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Sol Jarelly",
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
                    Row(
                        modifier = Modifier.width(250.dp),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        //Auto
                        Button(
                            onClick = { navController.navigate(route = AppScreens.Passenger3.route)
                            },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000))

                        ) {
                            Text(text = "Perfil")
                        }
                        //Ruta
                        Button(
                            onClick = { navController.navigate(route = AppScreens.Driver2.route)
                            },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000))

                        ) {
                            Text(text = "Ruta")
                        }
                        Spacer(modifier = Modifier.width(20.dp))

                    }
                }
            }

        }
        Spacer(modifier = Modifier.height(30.dp))
        Box(
            modifier = Modifier
                .background(color = Color(0xFFD8C3CC), RoundedCornerShape(20.dp))
                .width(370.dp)
        ) {
            Row {
                //De perfil
                Image(
                    painter = painterResource(id = R.drawable.persona_70),
                    contentDescription = "foto de perfil"
                )
                Column {
                    //Nombre conductor
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Fernanda Michelle",
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
                    Row(
                        modifier = Modifier.width(250.dp),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        //Auto
                        Button(
                            onClick = { navController.navigate(route = AppScreens.Passenger4.route) },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000))

                        ) {
                            Text(text = "Perfil")
                        }
                        //Ruta
                        Button(
                            onClick = {
                            },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000))

                        ) {
                            Text(text = "Ruta")
                        }
                        Spacer(modifier = Modifier.width(20.dp))

                    }
                }
            }

        }
        Spacer(modifier = Modifier.height(30.dp))
        Box(
            modifier = Modifier
                .background(color = Color(0xFFD8C3CC), RoundedCornerShape(20.dp))
                .width(370.dp)
        ) {
            Row {
                //De perfil
                Image(
                    painter = painterResource(id = R.drawable.persona_70),
                    contentDescription = "foto de perfil"
                )
                Column {
                    //Nombre conductor
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Paul",
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
                    Row(
                        modifier = Modifier.width(250.dp),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        //Auto
                        Button(
                            onClick = { navController.navigate(route = AppScreens.Passerger5.route) },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000))

                        ) {
                            Text(text = "Perfil")
                        }
                        //Ruta
                        Button(
                            onClick = {
                            },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000))

                        ) {
                            Text(text = "Ruta")
                        }
                        Spacer(modifier = Modifier.width(20.dp))

                    }
                }
            }

        }


    }
}

