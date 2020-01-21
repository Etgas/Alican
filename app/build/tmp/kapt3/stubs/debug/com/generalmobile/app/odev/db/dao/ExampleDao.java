package com.generalmobile.app.odev.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0007H\'J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\fH\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0010"}, d2 = {"Lcom/generalmobile/app/odev/db/dao/ExampleDao;", "", "deleteExample", "", "example", "Lcom/generalmobile/app/odev/db/entities/Example;", "getCount", "", "getExample", "exampleId", "", "getExamples", "Landroidx/lifecycle/LiveData;", "", "insertExample", "updateExample", "app_debug"})
public abstract interface ExampleDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Example")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.generalmobile.app.odev.db.entities.Example>> getExamples();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Example where id = :exampleId")
    public abstract com.generalmobile.app.odev.db.entities.Example getExample(long exampleId);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertExample(@org.jetbrains.annotations.NotNull()
    com.generalmobile.app.odev.db.entities.Example example);
    
    @androidx.room.Update()
    public abstract void updateExample(@org.jetbrains.annotations.NotNull()
    com.generalmobile.app.odev.db.entities.Example example);
    
    @androidx.room.Delete()
    public abstract void deleteExample(@org.jetbrains.annotations.NotNull()
    com.generalmobile.app.odev.db.entities.Example example);
    
    @androidx.room.Query(value = "Select count(*) from Example")
    public abstract int getCount();
}