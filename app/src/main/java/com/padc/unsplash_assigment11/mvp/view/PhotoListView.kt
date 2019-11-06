package com.padc.unsplash_assigment11.mvp.view

import com.padc.unsplash_assigment11.data.vos.PhotoVO

interface PhotoListView: BaseView {

    fun displayPhotoList(photoList: List<PhotoVO>)
    fun displayError(errorMessage: String)
    fun navigateToDetail(photoId: String)
}