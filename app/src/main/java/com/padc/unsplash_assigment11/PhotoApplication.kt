package com.padc.unsplash_assigment11

import android.app.Application
import com.padc.unsplash_assigment11.data.model.PhotoListModelImpl

class PhotoApp: Application(){

    override fun onCreate() {
        super.onCreate()
        PhotoListModelImpl.initDatabase(applicationContext)
    }
}