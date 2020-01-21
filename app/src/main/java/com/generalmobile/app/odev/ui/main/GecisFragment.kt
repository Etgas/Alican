package com.generalmobile.app.odev.ui.main


import android.content.Context
import android.database.DatabaseUtils
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.room.Room
import androidx.room.RoomDatabase

import com.generalmobile.app.odev.R
import com.generalmobile.app.odev.core.BaseFragment
import com.generalmobile.app.odev.databinding.FragmentGecisBinding
import com.generalmobile.app.odev.di.module.DatabaseModule_GetDatabaseFactory

/**
 * A simple [Fragment] subclass.
 */
class GecisFragment : BaseFragment<GecisFragmentViewModel,FragmentGecisBinding>(GecisFragmentViewModel::class.java) {



    var TAG = "GecisFragment"
    var databaseManager : DataBaseManager? = null

    override fun initViewModel() {
        mBinding.viewModel=viewModel
    }

    override fun getLayoutRes() = R.layout.fragment_gecis







    abstract class DataBaseManager:RoomDatabase(){

        var Instance:DataBaseManager? = null

        fun getDatabaseManager(context:Context):DataBaseManager?{
            if (Instance == null){
                Instance == Room.databaseBuilder(
                        context.applicationContext,
                        DataBaseManager::class.java,
                        "book-database"
                ).allowMainThreadQueries()
                        .build()
            }

            return Instance
        }


    }

}
