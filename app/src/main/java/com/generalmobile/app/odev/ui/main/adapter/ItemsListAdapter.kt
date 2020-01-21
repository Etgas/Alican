package com.generalmobile.app.odev.ui.main.adapter


import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil

import com.generalmobile.app.odev.R
import com.generalmobile.app.odev.core.BaseAdapter
import com.generalmobile.app.odev.core.BaseFragment
import com.generalmobile.app.odev.databinding.FragmentItemsListAdapterBinding
import com.generalmobile.app.odev.service.ItemsItem

/**
 * A simple [Fragment] subclass.
 */
class ItemsListAdapter(private val  callBack:(ItemsItem?) -> Unit) : BaseAdapter<ItemsItem>(diffCallback) {
    override fun createBinding(parent: ViewGroup, viewType: Int): ViewDataBinding {

        val mBinding = DataBindingUtil.inflate<FragmentItemsListAdapterBinding>(
            LayoutInflater.from(parent.context),
                R.layout.fragment_items_list_adapter,
                parent,
                false

        )

        val viewModel = ItemsListAdapterViewModel((parent.context as Activity).application)

        mBinding.viewModel = viewModel
        mBinding.itemsAdapter.setOnClickListener {
            mBinding.viewModel?.item?.get()?.let {
                callBack(it)
            }
         }

        return mBinding


    }

    override fun bind(binding: ViewDataBinding, position: Int) {

        (binding as? FragmentItemsListAdapterBinding)?.viewModel?.item?.set(getItem(position))
        binding.executePendingBindings()



    }



}
val diffCallback = object : DiffUtil.ItemCallback<ItemsItem>(){
    override fun areItemsTheSame(oldItem: ItemsItem, newItem: ItemsItem): Boolean =
            oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: ItemsItem, newItem: ItemsItem): Boolean =
            oldItem == newItem





}
