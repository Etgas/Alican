package com.generalmobile.app.odev.ui.main.detay


import android.content.Context
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.ListFragment

import com.generalmobile.app.odev.R
import com.generalmobile.app.odev.core.BaseFragment
import com.generalmobile.app.odev.databinding.FragmentDetayBinding
import com.generalmobile.app.odev.db.entities.DriverDetailEntity
import com.generalmobile.app.odev.service.ItemsItemDetay
import com.generalmobile.app.odev.service.ListDetayResponse
import com.generalmobile.app.odev.utils.extensions.toast
import com.generalmobile.app.odev.utils.service.CallbackWrapper
import com.squareup.picasso.Picasso
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_detay.*
import kotlinx.android.synthetic.main.fragment_items_list_adapter.*
import org.jetbrains.anko.doAsync
import timber.log.Timber

/**
 * A simple [Fragment] subclass.
 */
class DetayFragment : BaseFragment<DetayFragmentViewModel, FragmentDetayBinding>(DetayFragmentViewModel::class.java) {

    private var list = mutableListOf<ItemsItemDetay>()
    private val disposable = CompositeDisposable()

    override fun initViewModel() {
        mBinding.viewModel=viewModel
    }

    override fun getLayoutRes() = R.layout.fragment_detay

    override fun init() {


        mBinding.viewModel = viewModel
        mBinding.lifecycleOwner = this
        val id = arguments?.getInt("id") ?: -1
        getDetay(id)


    }

    private fun getDetay(id: Int) {
        mBinding.viewModel?.let {
            disposable.add(it.getDetay(id)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeWith(object : CallbackWrapper<ItemsItemDetay>(activity?.application) {
                        override fun onSuccess(t: ItemsItemDetay) {
                            mBinding.viewModel?.liste?.set(t)


                        }


                        override fun onError(e: Throwable) {

                            Timber.e(e)
                        }

                        override fun onComplete() {
                            doAsync {
                                viewModel.db.driverDetailDao().Insert(DriverDetailEntity(viewModel.liste.get()))
                                viewModel.db.driverDetailDao().getDriverId(id)

                            }
                            //  mBinding.viewModel?.editTextTest?.get()
                            //  Picasso.get().load(viewModel.liste.get()?.image).into(mBinding.imgDetay)

                        }

                    }))

        }
    }


}



