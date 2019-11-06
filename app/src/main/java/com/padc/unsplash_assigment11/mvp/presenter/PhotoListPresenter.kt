package com.padc.unsplash_assigment11.mvp.presenter

import androidx.lifecycle.Observer
import com.padc.unsplash_assigment11.activity.BaseActivity
import com.padc.unsplash_assigment11.data.model.PhotoListModelImpl
import com.padc.unsplash_assigment11.delegate.ItemClicked
import com.padc.unsplash_assigment11.mvp.view.PhotoListView

class PhotoListPresenter: BasePresenter<PhotoListView>(), ItemClicked {

    override fun onItemClicked(id: String) {
        mView.navigateToDetail(id)
    }

    fun onUiReady(activity: BaseActivity){
        val model = PhotoListModelImpl
        model.getAllPhotos { mView.displayError(it) }
            .observe(activity, Observer {
                mView.displayPhotoList(it)
            })
    }
}