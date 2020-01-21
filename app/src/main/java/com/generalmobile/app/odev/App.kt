package com.generalmobile.app.odev

import android.app.Application
import android.content.Context
import com.facebook.stetho.Stetho
import com.generalmobile.app.odev.di.component.DaggerApplicationComponent
import com.generalmobile.app.odev.di.module.ApplicationModule
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication


class App : MultiDexApplication() {


    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(base)
    }



    val component by lazy {
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
    }

}

