package com.polidrive.aaaaaaa

import com.google.gson.annotations.SerializedName

data class RouteResponse (@SerializedName("features")val features:List<Features>)
data class Features(@SerializedName("geometry")val geometry:Geometry)
data class Geometry(@SerializedName("coodinates") val coordinates:List<List<Double>>)