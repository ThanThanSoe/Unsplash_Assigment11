package com.padc.unsplash_assigment11.data.model

import android.content.Context
import com.padc.unsplash_assigment11.network.dataagent.PhotoDataAgent
import com.padc.unsplash_assigment11.network.dataagent.RetrofitDataAgent
import com.padc.unsplash_assigment11.persistance.PhotoDatabase

abstract class BaseModel{

    protected val dataAgent: PhotoDataAgent = RetrofitDataAgent

    protected lateinit var database: PhotoDatabase

    fun initDatabase(context: Context){
        database = PhotoDatabase.getInstance(context)
    }
}