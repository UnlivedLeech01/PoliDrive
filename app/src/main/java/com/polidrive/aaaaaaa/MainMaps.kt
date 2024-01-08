package com.polidrive.aaaaaaa

import android.graphics.Point
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState
import kotlin.math.roundToInt


@Composable
fun MainMapScreen() {
    // Estado para almacenar los marcadores seleccionados
    var selectedMarkers by remember { mutableStateOf(listOf<LatLng>()) }

    Column {
        // ... tu UI existente ...

        Button(
            onClick = {
                // Implementar la lógica para crear la ruta usando los marcadores seleccionados
                if (selectedMarkers.size >= 2) {
                    val start = selectedMarkers[0]
                    val end = selectedMarkers[1]
                    // Aquí iría la lógica para crear y mostrar la ruta
                }
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF880B56))
        ) {
            Text(text = "Crear ruta")
        }

        MapScreen(onMarkerSelected = { markerLatLng ->
            // Actualiza la lista de marcadores seleccionados
            selectedMarkers = listOf(markerLatLng) + selectedMarkers.take(1)
        })
    }
}
@Composable
fun MapScreen(onMarkerSelected: (LatLng) -> Unit) {
    val escom = LatLng(19.504841431557495, -99.14630154688206)
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(escom, 15f)
    }
    var markersList by remember { mutableStateOf(listOf<MarkerState>()) }

    GoogleMap(
        modifier = Modifier
            .fillMaxSize()
            .pointerInput(Unit) {
                detectTapGestures(
                    onPress = { offset ->
                        // Detecta un toque largo
                        tryAwaitRelease()
                        val point = Point(offset.x.roundToInt(), offset.y.roundToInt())
                        val latLng = cameraPositionState.projection?.fromScreenLocation(point)
                        latLng?.let {
                            val newMarkerState = MarkerState(position = it)
                            markersList = markersList + newMarkerState
                            onMarkerSelected(it)
                        }
                    }
                )
            },
        cameraPositionState = cameraPositionState
    ) {
        Marker(
            state = MarkerState(position = escom),
            title = "ESCOM",
            snippet = ""
        )
        markersList.forEach { markerState ->
            Marker(
                state = markerState,
                title = "Marcador",
                snippet = ""
            )
        }
    }
}



@Preview
@Composable
fun MapSrceenPreview(){
    MainMapScreen()
}