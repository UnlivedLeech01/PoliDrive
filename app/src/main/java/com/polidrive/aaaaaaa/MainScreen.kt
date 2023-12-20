@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class
)

package com.polidrive.aaaaaaa

import android.content.Context
import android.util.Patterns
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.polidrive.aaaaaaa.Navigation.AppScreens


@Composable
fun MainScreen(navController: NavController) {
    Spacer(modifier = Modifier.height(50.dp))
    Column {
        Text(text = " ")
        Row {
            Text(text = "     ")
            Column(
                modifier = Modifier.background(Color.LightGray, RoundedCornerShape(20.dp)),


                ) {
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "      POLIDRIVE      ",
                    fontSize = 45.sp,
                    fontWeight = FontWeight.Bold,
                )

                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "      Ingresa tu correo institucional",
                    fontWeight = FontWeight.Bold
                )
                //Spacer(modifier = Modifier.height(10.dp))
                Correo(navController)
                Spacer(modifier = Modifier.height(20.dp))

                Box(modifier = Modifier.fillMaxSize()){
                    Row(Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center){
                        Text(text = "     ")
                        Button(
                            onClick = { navController.navigate(route = AppScreens.Pantalla1.route) }) {
                            Text(text = "Registrate!!")

                        }

                    }
                }

                Box(modifier = Modifier.fillMaxSize()) {
                    androidx.compose.foundation.Image(
                        painter = painterResource(id = R.drawable.polidrivelogo),
                        contentDescription = "Logo",
                        modifier = Modifier
                            .size(275.dp)
                            .clip(CircleShape)
                            .align(Alignment.Center))
                }



            }
            Text(text = "     ")
        }

    }
}

@Composable
fun Image() {

}

@Composable
fun Correo(navController: NavController) {
    val context = LocalContext.current

    var email by remember { mutableStateOf(" ") }
    var isValidEmail by remember { mutableStateOf(false) }

    var contrasena by remember { mutableStateOf(" ") }
    var isValidPasword by remember { mutableStateOf(false) }

    var passwordVisible by remember { mutableStateOf(false) }

    Box(modifier = Modifier.background(Color.LightGray, RoundedCornerShape(10.dp))) {
        Column(
            Modifier
                .align(Alignment.Center)
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Card(
                Modifier.padding(12.dp),
                shape = RoundedCornerShape(10.dp)
            )
            {
                Column(Modifier.padding(16.dp)) {
                    RowEmail(
                        email = email,
                        emailChange = {
                            email = it
                            isValidEmail = Patterns.EMAIL_ADDRESS.matcher(email).matches()
                        }, isValidEmail
                    )
                    RowPassword(
                        contrasena = contrasena,
                        passwordChange = {
                            contrasena = it;
                            isValidPasword = contrasena.length >= 6
                        },
                        passwordVisible = passwordVisible,
                        passwordVisibleChange = { passwordVisible = !passwordVisible },
                        isValidPasword
                    )
                    RowLoginButton(
                        context = context,
                        isValidEmail = isValidEmail,
                        isValidPasword,
                        navController
                    )

                }
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RowEmail(
    email: String,
    emailChange: (String) -> Unit,
    isValid: Boolean
) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center
    )
    {
        OutlinedTextField(
            value = email,
            onValueChange = emailChange,
            label = { Text(text = "ejemplo@correo.com") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            maxLines = 1,
            singleLine = true,
            colors = if (isValid) {
                TextFieldDefaults.outlinedTextFieldColors(
                    focusedLabelColor = Color.Green,
                    focusedBorderColor = Color.Green
                )
            } else {
                TextFieldDefaults.outlinedTextFieldColors(
                    focusedLabelColor = Color.Red,
                    focusedBorderColor = Color.Red
                )
            }
        )
        Text(text = " ")
    }


}

@Composable
fun RowPassword(
    contrasena: String,
    passwordChange: (String) -> Unit,
    passwordVisible: Boolean,
    passwordVisibleChange: () -> Unit,
    isValidPassword: Boolean
) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp), horizontalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            contrasena, passwordChange,
            maxLines = 1,
            singleLine = true,
            label = { Text(text = "Contraseña") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            trailingIcon = {
                val image = if (passwordVisible) {
                    Icons.Filled.VisibilityOff
                } else {
                    Icons.Filled.Visibility
                }
                IconButton(onClick = passwordVisibleChange) {
                    Icon(imageVector = image, contentDescription = null)
                }
            }, visualTransformation = if (passwordVisible) {
                VisualTransformation.None
            } else {
                PasswordVisualTransformation()
            }, colors = if (isValidPassword) {
                TextFieldDefaults.outlinedTextFieldColors(
                    focusedLabelColor = Color.Green,
                    focusedBorderColor = Color.Green
                )
            } else {
                TextFieldDefaults.outlinedTextFieldColors(
                    focusedLabelColor = Color.Red,
                    focusedBorderColor = Color.Red
                )
            }
        )
    }
}

@Composable
fun RowLoginButton(
    context: Context,
    isValidEmail: Boolean,
    isValidPassword: Boolean,
    navController: NavController
){
    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center
    ){
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { login(context)
                        navController.navigate(route = AppScreens.Pantalla4.route)
                      },
            enabled = isValidPassword && isValidEmail
        ) {
            Text(text = " Iniciar Sesión ")
        }
    }
}

fun login(context: Context){
    Toast.makeText(context, "Loggeado :)", Toast.LENGTH_LONG).show()
}

