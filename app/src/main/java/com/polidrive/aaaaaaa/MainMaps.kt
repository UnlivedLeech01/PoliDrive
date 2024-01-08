package com.polidrive.aaaaaaa

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
import androidx.compose.ui.tooling.preview.Preview
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.PolylineOptions
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@Composable
fun MainMapScreen() {
    var selectedMarkers by remember { mutableStateOf(listOf<LatLng>()) }
    var start:String=""
    var end:String=""
    Column {
        // ... tu UI existente ...

        Button(
            onClick = {
                // Implementar la lógica para crear la ruta usando los marcadores seleccionados
                if (selectedMarkers.size >= 3) {
                    start = "${selectedMarkers[1].longitude},${selectedMarkers[1].latitude}"
                    end = "${selectedMarkers[2].longitude},${selectedMarkers[2].latitude}"
                    // Aquí iría la lógica para crear y mostrar la ruta
                    createRoute()
                }
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF880B56))
        ) {
            Text(text = "Crear ruta")
        }

        MapScreen(onMarkerAdded = { latLng ->
            selectedMarkers = listOf(latLng) + selectedMarkers.take(2)
        })
    }
}

@Composable
fun MapScreen(onMarkerAdded: (LatLng) -> Unit) {
    val escom = LatLng(19.504841431557495, -99.14630154688206)
    val conductor = LatLng(19.60154401792762, -99.04025319106024)
    val pasajero = LatLng(19.570988301429786, -99.06338216354723)
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(escom, 15f)
    }

    GoogleMap(
        modifier = Modifier.fillMaxSize(),
        cameraPositionState = cameraPositionState,
        onMapLongClick = { latLng ->
            // Llama a la función de callback cada vez que se agrega un nuevo marcador
            onMarkerAdded(latLng)
        }
    ) {
        // Marcadores predefinidos
        listOf(escom, conductor, pasajero).forEach { location ->
            Marker(
                state = MarkerState(position = location),
                title = "Marcador",
                snippet = ""
            )
        }
    }
}


fun createRoute(){
    CoroutineScope(Dispatchers.IO).launch{
        val call = getRetrofit().create(ApiService::class.java).getRoute("","","")
        if(call.isSuccessful){
            drawRoute(call.body())
        }else{

        }
    }
}

fun drawRoute(routeResponse: RouteResponse?) {
    val polylineOptions = PolylineOptions()
    routeResponse?.features?.first()?.geometry?.coordinates?.forEach{
        polylineOptions.add(LatLng(it[1], it[0]))
    }

}


fun getRetrofit(): Retrofit {
    return Retrofit.Builder()
        .baseUrl("https://api.openrouteservice.org/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}



@Preview
@Composable
fun MapSrceenPreview(){
    MainMapScreen()
}