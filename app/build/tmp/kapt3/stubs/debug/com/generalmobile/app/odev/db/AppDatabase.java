package com.generalmobile.app.odev.db;

import java.lang.System;

@androidx.room.Database(entities = {com.generalmobile.app.odev.db.entities.Example.class, com.generalmobile.app.odev.db.entities.DriverEntity.class, com.generalmobile.app.odev.db.entities.DriverDetailEntity.class}, version = 2)
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/generalmobile/app/odev/db/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "driverDao", "Lcom/generalmobile/app/odev/db/dao/DriverDao;", "driverDetailDao", "Lcom/generalmobile/app/odev/db/dao/DriverDetailDao;", "exampleDao", "Lcom/generalmobile/app/odev/db/dao/ExampleDao;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.generalmobile.app.odev.db.dao.ExampleDao exampleDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.generalmobile.app.odev.db.dao.DriverDao driverDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.generalmobile.app.odev.db.dao.DriverDetailDao driverDetailDao();
    
    public AppDatabase() {
        super();
    }
}