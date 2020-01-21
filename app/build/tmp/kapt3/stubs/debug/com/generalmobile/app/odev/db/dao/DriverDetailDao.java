package com.generalmobile.app.odev.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\'\u00a8\u0006\f"}, d2 = {"Lcom/generalmobile/app/odev/db/dao/DriverDetailDao;", "", "Delete", "", "driverDetail", "Lcom/generalmobile/app/odev/db/entities/DriverDetailEntity;", "Insert", "getAllDetail", "", "getDriverId", "driverId", "", "app_debug"})
public abstract interface DriverDetailDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM DriverDetail")
    public abstract java.util.List<com.generalmobile.app.odev.db.entities.DriverDetailEntity> getAllDetail();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM DriverDetail WHERE id = :driverId")
    public abstract com.generalmobile.app.odev.db.entities.DriverDetailEntity getDriverId(int driverId);
    
    @androidx.room.Insert()
    public abstract void Insert(@org.jetbrains.annotations.NotNull()
    com.generalmobile.app.odev.db.entities.DriverDetailEntity driverDetail);
    
    @androidx.room.Delete()
    public abstract void Delete(@org.jetbrains.annotations.NotNull()
    com.generalmobile.app.odev.db.entities.DriverDetailEntity driverDetail);
}