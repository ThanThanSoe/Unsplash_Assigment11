package com.padc.unsplash_assigment11.network

import com.padc.unsplash_assigment11.data.vos.PhotoVO
import com.padc.unsplash_assigment11.utils.GET_PHOTO_DETAIL
import com.padc.unsplash_assigment11.utils.GET_PHOTO_LIST
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PhotoApi {

    @GET(GET_PHOTO_LIST)
    fun getAllPhotos(): Call<List<PhotoVO>>

    @GET(GET_PHOTO_LIST)
    fun getAllPhotosObservable(): Observable<List<PhotoVO>>

    @GET(GET_PHOTO_DETAIL)
    fun getPhotoDetail(@Path("id") id: String): Call<PhotoVO>
}