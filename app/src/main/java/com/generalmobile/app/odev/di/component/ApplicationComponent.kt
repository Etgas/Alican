package com.generalmobile.app.odev.di.component

import android.content.Context
import android.content.SharedPreferences
import com.generalmobile.app.odev.App
import com.generalmobile.app.odev.di.module.ApplicationModule
import com.generalmobile.app.odev.di.module.DatabaseModule
import com.generalmobile.app.odev.ui.main.MainActivityViewModel

import com.generalmobile.app.odev.di.module.NetModule
import com.generalmobile.app.odev.ui.main.GecisFragmentViewModel
import com.generalmobile.app.odev.ui.main.adapter.ItemsListAdapterViewModel

import com.generalmobile.app.odev.ui.main.dashboard.DashboardActivityViewModel
import com.generalmobile.app.odev.ui.main.detay.DetayFragmentViewModel
import com.generalmobile.app.odev.ui.main.list.ListFragmentViewModel


import dagger.Component
import javax.inject.Singleton


@Singleton

@Component(modules = arrayOf(ApplicationModule::class,NetModule::class,DatabaseModule::class))


interface ApplicationComponent {
    fun app(): App


    fun context(): Context

    fun inject (itemsListAdapterViewModel: ItemsListAdapterViewModel)



    fun preferences(): SharedPreferences

    fun inject (gecisFragmentViewModel: GecisFragmentViewModel)

    fun inject (dashboardActivityViewModel: DashboardActivityViewModel)

    fun inject (detayFragmentViewModel: DetayFragmentViewModel)

    fun inject (listFragmentViewModel: ListFragmentViewModel)

    fun inject(mainActivityViewModel: MainActivityViewModel)




}
