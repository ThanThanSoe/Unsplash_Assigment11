package com.padc.unsplash_assigment11.data.model

import androidx.lifecycle.LiveData
import com.padc.unsplash_assigment11.data.vos.PhotoVO

interface PhotoListModel {

    fun getAllPhotos(
        onFailure: (String) -> Unit
    ) : LiveData<List<PhotoVO>>

    fun getPhotoDetail(
        id: String,
        onSuccess: (PhotoVO) -> Unit,
        onFailure: (String) -> Unit
    )

    fun getSearchPhoto(id: String): List<PhotoVO>
}