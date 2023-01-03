package com.datavisionstudio.rogueli.tdujxcusw

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface Nerkgdfs {
    @GET("json/?key=mFBNVQSnCdDASI9")
    suspend fun reisokxkmckmzusua(): Response<Ncdusxz>
    @GET("const.json")
    suspend fun iuidjvcd(): Response<Yerkslxoz>



}



@Keep
data class Ncdusxz(
    @SerializedName("city")
    val vfyuds: String,
    @SerializedName("country")
    val qopsoojsjcx: String,
    @SerializedName("countryCode")
    val vftycxi: String,
)

@Keep
data class Yerkslxoz(
    @SerializedName("geo")
    val fesl: String,
    @SerializedName("view")
    val aops: String,
    @SerializedName("appsChecker")
    val nhyudiixjkzkushd: String,
)

