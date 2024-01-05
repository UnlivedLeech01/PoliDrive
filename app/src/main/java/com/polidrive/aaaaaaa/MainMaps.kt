package com.polidrive.aaaaaaa

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState


@Composable
fun MainMapScreen(){
    Column {
        Row (
            modifier= Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Black),
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(text = "POLIDRIVE",
                color = Color.White,
                )
            Spacer(modifier = Modifier.weight(1f))
            Image(painter = painterResource(id = R.drawable.baseline_face_white_24), contentDescription = "Carita blanca",
                 )
        }
        MapScreen()
    }
}

@Composable
fun MapScreen(){
    val escom = LatLng(19.504841431557495, -99.14630154688206)
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(escom, 15f)
    }
    GoogleMap(
        modifier = Modifier.fillMaxSize(),
        cameraPositionState = cameraPositionState
    ) {
        Marker(
            state = MarkerState(position = escom),
            title = "Escom",
            snippet = ""
        )
    }
}

@Preview
@Composable
fun MapSrceenPreview(){
    MapScreen()
}