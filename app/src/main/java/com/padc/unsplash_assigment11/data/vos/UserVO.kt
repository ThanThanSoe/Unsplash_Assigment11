package com.padc.unsplash_assigment11.data.vos

import androidx.room.Embedded
import com.google.gson.annotations.SerializedName

data class UserVO(

    @SerializedName("id")
    var id: String,

    @SerializedName("name")
    var name: String?,

    @SerializedName("twitter_username")
    var twitter_username: String?,

    @SerializedName("portfolio_url")
    var photo: String?,

    @SerializedName("profile_image")
    @Embedded(prefix = "profile_image_")
    var profileImageVO: ProfileImageVO?
)