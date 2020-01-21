package com.generalmobile.app.odev.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.generalmobile.app.odev.db.entities.DriverEntity

@Dao
interface DriverDao {


@Query("SELECT * FROM Driver")
fun getAllDrivers():List<DriverEntity>


    @Insert
    fun insert(driver:DriverEntity)

    @Delete
    fun delete(driver: DriverEntity)
}