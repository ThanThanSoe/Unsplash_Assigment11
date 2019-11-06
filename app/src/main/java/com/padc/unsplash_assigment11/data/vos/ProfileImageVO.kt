package com.padc.unsplash_assigment11.data.vos

import com.google.gson.annotations.SerializedName

data class ProfileImageVO(

    @SerializedName("small")
    var small: String?,

    @SerializedName("medium")
    var medium: String?,

    @SerializedName("large")
    var large: String?
)