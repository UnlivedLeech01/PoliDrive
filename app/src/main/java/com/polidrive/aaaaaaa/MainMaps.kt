package com.polidrive.aaaaaaa

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.PolylineOptions
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.Polyline
import com.google.maps.android.compose.rememberCameraPositionState
import com.polidrive.aaaaaaa.Navigation.AppScreens
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@Composable
fun MainMapScreen(navController: NavController) {
    var selectedMarkers by remember { mutableStateOf(listOf<LatLng>()) }
    var start:String=""
    var end:String=""
    Column {
        Box() {
            MapScreen(onMarkerAdded = { latLng ->
                selectedMarkers = listOf(latLng) + selectedMarkers.take(2)
                }, navController
            )
        }

    }
}

@Composable
fun MapScreen(onMarkerAdded: (LatLng) -> Unit, navController: NavController) {
    var selectedMarkers by remember { mutableStateOf(listOf<LatLng>()) }
    var start:String=""
    var end:String=""

    //Lista con coordenadas
    var routePoints by remember { mutableStateOf(listOf<LatLng>()) }

    val escom = LatLng(19.504841431557495, -99.14630154688206)
    val conductor = LatLng(19.60154401792762, -99.04025319106024)
    val pasajero = LatLng(19.570988301429786, -99.06338216354723)
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(escom, 15f)
    }
    var kilometros: Float = 0f
    var minutos: Float = 0f


    Column {


        Button(
            onClick = {
                Log.d("RouteData", "Jala el boton")
                // Implementar la lógica para crear la ruta usando los marcadores seleccionados
                createRoute (
                    { newRoutePoints ->
                        routePoints = newRoutePoints
                    },
                    { newDistancia -> kilometros = newDistancia },
                    { newTime -> minutos = newTime }
                )


            },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF880B56))
        ) {
            Text(text = "Calcular Ruta")
            //routePoints = createRoute()
        }
        val context = LocalContext.current




        Box(modifier = Modifier.height(700.dp)){
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
                        snippet = "",
                        icon = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE),

                    )
                    Polyline(points = listOf(escom, conductor, pasajero))
                    Log.d("RouteData", "polyline 1")

                    Polyline(
                        points = routePoints,
                        color = Color.Green
                    )

                    minutos /= 60
                    kilometros /= 1000
                    Log.d("RouteData", "antes del Marker")
                    if (routePoints.size > 0) {
                        Marker(
                            state = MarkerState(position = routePoints[routePoints.size / 2]),
                            title = "Distancia y tiempo",
                            snippet = "$kilometros km. / $minutos min. "
                            //icon = BitmapDescriptorFactory.fromBitmap(/*imagen*/ )
                        )
                    }
                }
            }
        }
        //Ruta intermedia
        Button(
            onClick = {
                navController.navigate(route = AppScreens.Ruta2.route)
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF880B56))
        ) {
            Text(text = "Punto medio")
            //routePoints = createRoute()
        }
    }
}


fun createRoute(updateRoutePoints: (List<LatLng>) -> Unit, newDistancia: (Float) -> Unit, newTime: (Float) -> Unit) {
    Log.d("RouteData", "Paso sin acento")
    CoroutineScope(Dispatchers.IO).launch {
        val escom1 = LatLng(19.504841431557495, -99.14630154688206)
        val conductor2 = LatLng(19.60154401792762, -99.04025319106024)
        val call = getRetrofit().create(ApiService::class.java).getRoute("5b3ce3597851110001cf6248dab664ccc8a543caa4beefa356a82bc8","${escom1.longitude},${escom1.latitude}", "${conductor2.longitude},${conductor2.latitude}")

        Log.d("RouteData", "Paso sin acento 2")

        if (call.isSuccessful) {
            Log.d("RouteData", "Paso sin acento 3")
            val responseBody = call.body()?.features?.first()?.properties
            Log.d("RouteData", "API Response: $responseBody")
            val newRoutePoints = mutableListOf<LatLng>()

            var nuevosMinutos: Float
            var nuevaDistancia: Float

            nuevaDistancia = call.body()?.features?.first()?.properties?.summary?.distance!!
            nuevosMinutos = call.body()?.features?.first()?.properties?.summary?.duration!!
            Log.d("RouteDataa", "Paso sin acento 2")
            Log.d("RouteData", "$nuevaDistancia metros y $nuevosMinutos segundos")
            withContext(Dispatchers.Main) {

                newDistancia(nuevaDistancia)
                newTime(nuevosMinutos)
            }
            call.body()?.features?.first()?.geometry?.coordinates?.forEach {
                val latLng = LatLng(it[1], it[0])
                newRoutePoints.add(latLng)
                //Log.d("RouteData", "Route points: xd")
            }
            withContext(Dispatchers.Main) {
                updateRoutePoints(newRoutePoints)
            }
        } else {
            Log.e("RouteData", "API Call Failed: ${call.errorBody()}")
            // Manejo de error
        }

    }
}


fun drawRoute(routeResponse: RouteResponse?) {
    val polylineOptions = PolylineOptions()
    routeResponse?.features?.first()?.geometry?.coordinates?.forEach{
        //polylineOptions.add(LatLng(it[1], it[0]))
        //Polyline(points = LatLng(it[1], it[0]))

    }

}


fun getRetrofit(): Retrofit {
    return Retrofit.Builder()
        .baseUrl("https://api.openrouteservice.org/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}