package com.generalmobile.app.odev.service

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class ListResponse (



        @field:SerializedName("items")
        val items: List<ItemsItem?>? = null
): Parcelable {
    constructor(parcel: Parcel) : this(parcel.createTypedArrayList(ItemsItem))


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeTypedList(items)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ListResponse> {
        override fun createFromParcel(parcel: Parcel): ListResponse {
            return ListResponse(parcel)
        }

        override fun newArray(size: Int): Array<ListResponse?> {
            return arrayOfNulls(size)
        }
    }

}

