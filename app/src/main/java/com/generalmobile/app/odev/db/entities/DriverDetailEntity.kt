package com.generalmobile.app.odev.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.generalmobile.app.odev.service.ItemsItemDetay


@Entity (tableName = "DriverDetail")
data class DriverDetailEntity (
        @PrimaryKey
        var id :Int =0,
        var driverAge : Int?=null,
        var driverTeam : String?,
        var driverImage : String?


) {
    constructor(it: ItemsItemDetay?) : this(


            driverAge=it?.age?:-1,
            driverTeam = it?.team,
            driverImage = it?.image
    )

}