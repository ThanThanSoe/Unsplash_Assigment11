package com.padc.unsplash_assigment11.mvp.presenter
import com.padc.unsplash_assigment11.activity.BaseActivity
import com.padc.unsplash_assigment11.data.model.PhotoListModelImpl
import com.padc.unsplash_assigment11.mvp.view.PhotoDetailView

class PhotoDetailPresenter: BasePresenter<PhotoDetailView>() {

    fun onUiReady(activity: BaseActivity, photoId: String) {
        if (photoId != null) {
            val model = PhotoListModelImpl
            model.getPhotoDetail(photoId, {
                mView.displayPhotoDetail(it)
            }, {
                mView.errorMessage(it)
            })
        }
    }
}