package com.example.codingassesment_eveniontechnologies.model

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.codingassesment_eveniontechnologies.R

data class Animals(
        val image_src: String,
        val name: String,
        val description: String
) {
    companion object {
        @JvmStatic
        @BindingAdapter("animalSrc")
        fun loadImage(imageView: ImageView, imageURL: String?) {
            Glide.with(imageView.context)
                .load(imageURL)
                .placeholder(R.mipmap.ic_launcher)
                .into(imageView)
        }
    }
}


