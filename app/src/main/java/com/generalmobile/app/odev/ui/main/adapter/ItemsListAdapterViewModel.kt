package com.generalmobile.app.odev.ui.main.adapter

import android.app.Application
import androidx.databinding.ObservableField
import com.generalmobile.app.odev.App
import com.generalmobile.app.odev.core.BaseViewModel
import com.generalmobile.app.odev.service.ItemsItem

class ItemsListAdapterViewModel(app:Application): BaseViewModel(app) {

    init {
        (app as? App)?.component?.inject(this)
    }


    var item = ObservableField<ItemsItem?>()
}