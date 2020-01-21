package com.generalmobile.app.odev.ui.main.dashboard

import android.app.Application
import com.generalmobile.app.odev.App
import com.generalmobile.app.odev.core.BaseViewModel

class DashboardActivityViewModel(app:Application):BaseViewModel(app) {

    init {
        (app as? App)?.component?.inject(this)
    }
}