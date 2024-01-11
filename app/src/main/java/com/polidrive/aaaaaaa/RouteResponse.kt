package com.polidrive.aaaaaaa

import com.google.gson.annotations.SerializedName

data class RouteResponse (@SerializedName("features")val features:List<Features>)
data class Features(@SerializedName("geometry")val geometry:Geometry, @SerializedName("properties")val properties:Properties)
data class Geometry(@SerializedName("coordinates") val coordinates:List<List<Double>>)
data class Properties(@SerializedName("summary") val summary:Summary)
data class Summary (@SerializedName("distance")val distance:Float, @SerializedName("duration")val duration:Float)
