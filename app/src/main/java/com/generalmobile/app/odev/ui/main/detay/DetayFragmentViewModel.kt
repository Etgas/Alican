package com.generalmobile.app.odev.ui.main.detay

import android.app.Application
import android.widget.ImageView
import androidx.databinding.ObservableField
import androidx.lifecycle.viewModelScope
import com.generalmobile.app.odev.App
import com.generalmobile.app.odev.R
import com.generalmobile.app.odev.core.BaseViewModel
import com.generalmobile.app.odev.db.AppDatabase
import com.generalmobile.app.odev.service.ListDetayResponse
import com.generalmobile.app.odev.service.ItemsItemDetay
import com.generalmobile.app.odev.service.odevApi
import com.squareup.picasso.Picasso
import io.reactivex.Observable
import javax.inject.Inject

class DetayFragmentViewModel(app:Application):BaseViewModel(app) {



    @Inject
    lateinit var baseApi : odevApi

    @Inject
    lateinit var db : AppDatabase


    var liste : ObservableField<ItemsItemDetay> = ObservableField()
    var editTextTest : ObservableField<String?> = ObservableField()




    init {
        (app as? App)?.component?.inject(this)


    }

    fun getDetay(id:Int): Observable<ItemsItemDetay> {

        return baseApi.tumDetaylariGetir(id = id)




    }
}