package com.padc.unsplash_assigment11.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.padc.unsplash_assigment11.R
import com.padc.unsplash_assigment11.data.vos.PhotoVO
import com.padc.unsplash_assigment11.delegate.ItemClicked
import com.padc.unsplash_assigment11.viewHolders.PhotoItemViewHolder

class PhotoItemAdapter(private val delegate: ItemClicked): BaseAdapter<PhotoItemViewHolder, PhotoVO>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoItemViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.photo_item_view, parent, false)
        return PhotoItemViewHolder(layout, delegate)
    }
}