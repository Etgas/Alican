package com.generalmobile.app.odev.ui.main

import android.app.Application
import com.generalmobile.app.odev.App
import com.generalmobile.app.odev.core.BaseViewModel

class GecisFragmentViewModel(app:Application):BaseViewModel(app) {


    init {
        (app as? App)?.component?.inject(this)
    }
}