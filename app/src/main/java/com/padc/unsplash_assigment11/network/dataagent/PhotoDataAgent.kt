package com.padc.unsplash_assigment11.network.dataagent

import com.padc.unsplash_assigment11.data.vos.PhotoVO
import io.reactivex.Observable

interface PhotoDataAgent {

    fun getPhotos(onSuccess: (List<PhotoVO>) -> Unit, onFailure: (String) -> Unit)

    fun getPhotosObservable(): Observable<List<PhotoVO>>

    fun getPhotoDetail(id: String, onSuccess: (PhotoVO) -> Unit, onFailure: (String) -> Unit
    )
}