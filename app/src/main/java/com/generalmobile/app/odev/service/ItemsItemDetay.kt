package com.generalmobile.app.odev.service

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class ItemsItemDetay(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("team")
	val team: String? = null,

	@field:SerializedName("age")
	val age: Int? = null
): Parcelable {
	constructor(parcel: Parcel) : this(
			parcel.readString(),
			parcel.readValue(Int::class.java.classLoader) as? Int,
			parcel.readString(),
			parcel.readValue(Int::class.java.classLoader) as? Int)


	override fun writeToParcel(parcel: Parcel, flags: Int) {
		parcel.writeString(image)
		parcel.writeValue(id)
		parcel.writeString(team)
		parcel.writeValue(age)
	}

	override fun describeContents(): Int {
		return 0
	}


	fun ageString() : String {
		return "Age: $age"
	}

	companion object CREATOR : Parcelable.Creator<ItemsItemDetay> {
		override fun createFromParcel(parcel: Parcel): ItemsItemDetay {
			return ItemsItemDetay(parcel)
		}

		override fun newArray(size: Int): Array<ItemsItemDetay?> {
			return arrayOfNulls(size)
		}
	}
}
