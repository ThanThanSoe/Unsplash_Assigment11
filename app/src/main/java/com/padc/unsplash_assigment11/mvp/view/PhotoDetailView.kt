package com.padc.unsplash_assigment11.mvp.view

import com.padc.unsplash_assigment11.data.vos.PhotoVO

interface PhotoDetailView: BaseView {
    fun displayPhotoDetail(photoVO: PhotoVO)
    fun errorMessage(errorMessage: String)
}