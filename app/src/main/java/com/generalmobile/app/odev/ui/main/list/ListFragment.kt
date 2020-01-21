package com.generalmobile.app.odev.ui.main.list


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelStore
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager

import com.generalmobile.app.odev.R
import com.generalmobile.app.odev.core.BaseFragment
import com.generalmobile.app.odev.databinding.FragmentListBinding
import com.generalmobile.app.odev.db.entities.DriverEntity
import com.generalmobile.app.odev.service.ItemsItem
import com.generalmobile.app.odev.service.ListResponse
import com.generalmobile.app.odev.ui.main.adapter.ItemsListAdapter
import com.generalmobile.app.odev.ui.main.detay.DetayFragment
import com.generalmobile.app.odev.utils.service.CallbackWrapper
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import org.jetbrains.anko.doAsync
import timber.log.Timber

/**
 * A simple [Fragment] subclass.
 */
class ListFragment : BaseFragment<ListFragmentViewModel, FragmentListBinding>(ListFragmentViewModel::class.java) {
    private var list = mutableListOf<ItemsItem?>()
    private val disposable = CompositeDisposable()

    override fun initViewModel() {
        mBinding.viewModel=viewModel
    }

    override fun getLayoutRes() = R.layout.fragment_list


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        getListe()

    }

    private fun getListe() {




        list.clear()
        val adapter = ItemsListAdapter {


            val bundle = Bundle()
            bundle.putInt("id", it?.id ?: -1)
            findNavController().navigate(R.id.detayFragment, bundle)

        }
        mBinding.recyclerViewList.adapter = adapter
        mBinding.recyclerViewList.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        disposable.add(with(viewModel) {
            getList()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeWith(object : CallbackWrapper<ListResponse>(activity?.application) {
                        override fun onSuccess(t: ListResponse) {

                            viewModel.liste.set(t)
                        }

                        override fun onComplete() {

                            viewModel.liste.get()?.items?.forEach {
                                list.add(it)
                            }
                            doAsync {
                                list.forEach {
                                    viewModel.db.driverDao().insert(DriverEntity(it))
                                }

                            }
                            (mBinding.recyclerViewList.adapter as ItemsListAdapter).submitList(list)
                        }

                        override fun onError(e: Throwable) {
                            Timber.e(e)


                        }
                    })
        })

    }

}
