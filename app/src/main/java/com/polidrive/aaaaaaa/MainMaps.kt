package com.polidrive.aaaaaaa

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState

@Composable
fun MapScreen(){
    val escom = LatLng(19.504841431557495, -99.14630154688206)
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(escom, 10f)
    }
    GoogleMap(
        modifier = Modifier.fillMaxSize(),
        cameraPositionState = cameraPositionState
    ) {
        Marker(
            state = MarkerState(position = escom),
            title = "Singapore",
            snippet = "Marker in Singapore"
        )
    }
}

@Preview
@Composable
fun MapSrceenPreview(){
    MapScreen()
}