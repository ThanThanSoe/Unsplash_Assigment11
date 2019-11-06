package com.padc.unsplash_assigment11.data.vos

import com.google.gson.annotations.SerializedName

data class PhotoUrlVO(

    @SerializedName("raw")
    var raw: String,

    @SerializedName("full")
    var full: String,

    @SerializedName("regular")
    var regular: String,

    @SerializedName("small")
    var small: String,

    @SerializedName("thumb")
    var thumb: String
)