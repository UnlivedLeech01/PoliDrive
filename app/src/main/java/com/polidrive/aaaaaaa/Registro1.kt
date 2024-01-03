@file:OptIn(ExperimentalMaterial3Api::class)

package com.polidrive.aaaaaaa

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
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FirstScreen1() {
    var nombre by remember { mutableStateOf(" ") }
    Column {
        Box(modifier = Modifier
            .height(670.dp)
            .fillMaxWidth()) {
            Column() {
                Text(text = "Registro")
                RowNombre(nombre = nombre , nombreChange = {nombre = it} )
                Spacer(modifier = Modifier.height(500.dp))
                Row(Modifier.fillMaxWidth()) {
                    Text(text = "     ")
                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Text(text = "    ")
                        Button(
                            onClick = { },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF880B56))
                        ) {
                            Text(text = "Siguiente")
                        }

//a
                    }

                }
            }
        }
    }
}
@Composable
fun RowNombre(
    nombre: String,
    nombreChange: (String) -> Unit
) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center
    )
    {
        OutlinedTextField(
            value = nombre,
            onValueChange = nombreChange,
            label = { Text(text = "Nombre Completo") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            maxLines = 1,
            singleLine = true,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedLabelColor = Color.Green,
                    focusedBorderColor = Color.Green
                )

        )
        Text(text = " ")
    }


}

@Preview(
    showBackground = true
)
@Composable
fun PreviewPantalladeRegistro1() {
    FirstScreen1()
}




