package com.padc.unsplash_assigment11.mvp.presenter

import androidx.lifecycle.ViewModel
import com.padc.unsplash_assigment11.mvp.view.BaseView

abstract class BasePresenter<T: BaseView> : ViewModel() {

    protected lateinit var mView: T

    open fun initPresenter(view: T){
        this.mView  = view
    }
}