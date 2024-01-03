@file:OptIn(ExperimentalMaterial3Api::class)

package com.polidrive.aaaaaaa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Text
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.TextStyle
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun RegistroScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Registro",
            style = TextStyle(fontSize = 32.sp),
            modifier = Modifier.padding(bottom = 24.dp)
        )
        OutlinedButton(onClick = { /* TODO: Handle click */ }) {
            Text("¿Cuentas con Credencial?")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text("No tengo credencial :(")
        Spacer(modifier = Modifier.height(16.dp))
        RegistroForm()
    }
}

@Composable
fun RegistroForm() {
    Column {
        OutlinedTextField(
            value = "",
            onValueChange = { /* TODO: Handle text change */ },
            label = { Text("Nombre Completo") }
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = "",
            onValueChange = { /* TODO: Handle text change */ },
            label = { Text("Correo") }
        )
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            OutlinedTextField(
                value = "",
                onValueChange = { /* TODO: Handle text change */ },
                label = { Text("Teléfono") },
                modifier = Modifier.weight(1f),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
            )
            Spacer(modifier = Modifier.width(8.dp))
            OutlinedTextField(
                value = "",
                onValueChange = { /* TODO: Handle text change */ },
                label = { Text("Boleta") },
                modifier = Modifier.weight(1f)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = "",
            onValueChange = { /* TODO: Handle text change */ },
            label = { Text("Dirección") }
        )
    }
}

@Preview

@Composable
fun registroprew ()
{
    RegistroScreen()
}

