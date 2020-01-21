package com.generalmobile.app.odev.ui.main

import android.app.Application
import com.generalmobile.app.odev.db.AppDatabase
import com.generalmobile.app.odev.App
import com.generalmobile.app.odev.core.BaseViewModel
import com.generalmobile.app.odev.service.odevApi
import javax.inject.Inject

class MainActivityViewModel(app: Application) : BaseViewModel(app) {
    // private var examples: LiveData<List<Example>>? = null

    @Inject
    lateinit var db: AppDatabase

    @Inject
    lateinit var baseApi:odevApi

    //var liste : ObservableField<Response> = ObservableField()



    init {
        (app as? App)?.component?.inject(this)
    }




}