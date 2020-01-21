package com.generalmobile.app.odev.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.generalmobile.app.odev.db.dao.DriverDao
import com.generalmobile.app.odev.db.dao.DriverDetailDao
import com.generalmobile.app.odev.db.dao.ExampleDao
import com.generalmobile.app.odev.db.entities.DriverDetailEntity
import com.generalmobile.app.odev.db.entities.DriverEntity
import com.generalmobile.app.odev.db.entities.Example


@Database(entities = arrayOf(Example::class,DriverEntity::class,DriverDetailEntity::class), version = 2)
abstract class AppDatabase : RoomDatabase() {
    abstract fun exampleDao(): ExampleDao
    abstract fun driverDao(): DriverDao
    abstract fun driverDetailDao(): DriverDetailDao

}