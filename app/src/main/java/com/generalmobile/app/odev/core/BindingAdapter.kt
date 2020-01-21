package com.generalmobile.app.odev.core

import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso
import org.jetbrains.anko.db.TEXT
import org.w3c.dom.Text
import retrofit2.Retrofit

object BindingAdapter {

    @JvmStatic
    @BindingAdapter("app:loadImage")
    fun loadImage(view: ImageView, url: String?) {
        if (url == null || url.isEmpty()) {
            return
        }
        Picasso.get().load(url).into(view)

    }


    @JvmStatic
    @BindingAdapter("app:loadTeam")
    fun loadText(view: TextView, team: String?) {

        team?.let {
            view.text = team

        }
    }

    @JvmStatic
    @BindingAdapter("app:loadAge")
    fun loadAge(view:TextView,age : String?){

        age?.let {
            view.text = age
        }
    }

    @JvmStatic
    @BindingAdapter("app:loadEditText")
    fun loadEditText(view:EditText?,name:String?){

        name.let {
            view?.setText(name)
        }

    }

    @JvmStatic
    @BindingAdapter("app:loadMoviesName")
    fun loadMoviesName(view: TextView,moviesName:String?){
        moviesName?.let {
            view.text = moviesName
        }
    }
}