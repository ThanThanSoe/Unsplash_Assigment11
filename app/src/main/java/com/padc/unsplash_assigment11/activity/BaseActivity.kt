package com.padc.unsplash_assigment11.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.padc.unsplash_assigment11.data.model.PhotoListModel
import com.padc.unsplash_assigment11.data.model.PhotoListModelImpl

abstract class BaseActivity: AppCompatActivity() {

    protected lateinit var model: PhotoListModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        model = PhotoListModelImpl
    }
}