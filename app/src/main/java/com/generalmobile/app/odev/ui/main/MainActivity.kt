package com.generalmobile.app.odev.ui.main

import com.generalmobile.app.odev.R
import com.generalmobile.app.odev.core.BaseActivity
import com.generalmobile.app.odev.databinding.ActivityMainBinding

class MainActivity : BaseActivity<MainActivityViewModel, ActivityMainBinding>(MainActivityViewModel::class.java) {




    override fun initViewModel(viewModel: MainActivityViewModel) {
        binding.viewModel = viewModel
    }

    override fun getLayoutRes() = R.layout.activity_main




}
