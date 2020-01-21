package com.generalmobile.app.odev.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.generalmobile.app.odev.db.entities.DriverDetailEntity

@Dao
interface DriverDetailDao {


    @Query("SELECT * FROM DriverDetail")
    fun getAllDetail():List<DriverDetailEntity>


  @Query("SELECT * FROM DriverDetail WHERE id = :driverId")
  fun getDriverId(driverId:Int):DriverDetailEntity
    @Insert
    fun Insert(driverDetail: DriverDetailEntity)

    @Delete
    fun Delete(driverDetail: DriverDetailEntity)



}