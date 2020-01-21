package com.generalmobile.app.odev.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.generalmobile.app.odev.service.ItemsItem


@Entity(tableName = "Driver")
data class DriverEntity (
    @PrimaryKey
    var driverId : Int = 0,
     var name: String?=null,
     var driverPoint : Int? = null
) {
    constructor(it: ItemsItem?) : this(
            driverId=it?.id?:-1,
            name = it?.name,
            driverPoint = it?.point
    )
}



