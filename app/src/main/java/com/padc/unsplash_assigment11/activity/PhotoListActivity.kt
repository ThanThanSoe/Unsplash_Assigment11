package com.padc.unsplash_assigment11.activity

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.WindowManager
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.padc.unsplash_assigment11.R
import com.padc.unsplash_assigment11.adapter.PhotoItemAdapter
import com.padc.unsplash_assigment11.data.model.PhotoListModel
import com.padc.unsplash_assigment11.data.model.PhotoListModelImpl
import com.padc.unsplash_assigment11.data.vos.PhotoVO
import com.padc.unsplash_assigment11.mvp.presenter.PhotoListPresenter
import com.padc.unsplash_assigment11.mvp.view.PhotoListView
import kotlinx.android.synthetic.main.photo_list_activity.*

class PhotoListActivity : BaseActivity(), PhotoListView {

    override fun displayPhotoList(photoList: List<PhotoVO>) {
        photoItemAdapter.setNewData(photoList.toMutableList())
    }

    override fun displayError(errorMessage: String) {
        Snackbar.make(rootView, errorMessage, Snackbar.LENGTH_LONG).show()
    }

    override fun navigateToDetail(photoId: String) {
        startActivity(PhotoDetailActivity.newIntent(applicationContext, photoId))
    }

    private lateinit var photoItemAdapter: PhotoItemAdapter
    private lateinit var photoListPresenter: PhotoListPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.photo_list_activity)

        photoListPresenter = ViewModelProviders.of(this).get(PhotoListPresenter::class.java)
        photoListPresenter.initPresenter(this)

        photoItemAdapter = PhotoItemAdapter(photoListPresenter)

        with(rv_photos){
            layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            setHasFixedSize(true)
            adapter = photoItemAdapter
        }

        photoListPresenter.onUiReady(this)
    }

}