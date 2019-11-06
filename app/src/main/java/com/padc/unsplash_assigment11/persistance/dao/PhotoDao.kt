package com.padc.unsplash_assigment11.persistance.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.padc.unsplash_assigment11.data.vos.PhotoVO
import io.reactivex.Maybe
import io.reactivex.Single

@Dao
interface PhotoDao {

    @Insert(onConflict =  OnConflictStrategy.REPLACE)
    abstract fun insertPhotos(events: List<PhotoVO>): Single<LongArray>

    @Query("SELECT * FROM photo")
    abstract fun getAllPhotos(): LiveData<List<PhotoVO>>

    @Query("SELECT * FROM photo")
    abstract fun getAllPhotosMaybe(): Maybe<List<PhotoVO>>

    @Query("SELECT * FROM photo WHERE id LIKE :id")
    abstract fun getSearchPhoto(id: String): List<PhotoVO>
}