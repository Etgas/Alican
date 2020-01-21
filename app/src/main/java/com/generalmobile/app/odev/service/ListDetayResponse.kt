package com.generalmobile.app.odev.service

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class ListDetayResponse(

        @field:SerializedName("items")
        val items: List<ItemsItemDetay?>? = null
): Parcelable {
    constructor(parcel: Parcel) : this(parcel.createTypedArrayList(ItemsItemDetay))

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeTypedList(items)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ListDetayResponse> {
        override fun createFromParcel(parcel: Parcel): ListDetayResponse {
            return ListDetayResponse(parcel)
        }

        override fun newArray(size: Int): Array<ListDetayResponse?> {
            return arrayOfNulls(size)
        }
    }
}




