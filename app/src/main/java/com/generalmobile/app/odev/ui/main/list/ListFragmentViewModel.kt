package com.generalmobile.app.odev.ui.main.list

import android.app.Application
import androidx.databinding.ObservableField
import com.generalmobile.app.odev.App
import com.generalmobile.app.odev.core.BaseViewModel
import com.generalmobile.app.odev.db.AppDatabase
import com.generalmobile.app.odev.service.ListResponse
import com.generalmobile.app.odev.service.odevApi
import io.reactivex.Observable
import javax.inject.Inject

class ListFragmentViewModel(app:Application):BaseViewModel(app) {


    @Inject
lateinit var baseApi : odevApi

    @Inject
    lateinit var db:AppDatabase

    var liste :ObservableField<ListResponse> = ObservableField()


    init {

        (app as? App)?.component?.inject(this)
    }

    fun getList(): Observable<ListResponse> {

        return baseApi.tumListeleriGetir()
    }

}