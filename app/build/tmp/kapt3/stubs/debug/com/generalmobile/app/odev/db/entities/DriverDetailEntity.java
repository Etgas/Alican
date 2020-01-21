package com.generalmobile.app.odev.db.entities;

import java.lang.System;

@androidx.room.Entity(tableName = "DriverDetail")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004B/\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001b\u001a\u00020\u0006H\u00c6\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u00c6\u0003J<\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0006H\u00d6\u0001J\t\u0010%\u001a\u00020\tH\u00d6\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006&"}, d2 = {"Lcom/generalmobile/app/odev/db/entities/DriverDetailEntity;", "", "it", "Lcom/generalmobile/app/odev/service/ItemsItemDetay;", "(Lcom/generalmobile/app/odev/service/ItemsItemDetay;)V", "id", "", "driverAge", "driverTeam", "", "driverImage", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getDriverAge", "()Ljava/lang/Integer;", "setDriverAge", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDriverImage", "()Ljava/lang/String;", "setDriverImage", "(Ljava/lang/String;)V", "getDriverTeam", "setDriverTeam", "getId", "()I", "setId", "(I)V", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/generalmobile/app/odev/db/entities/DriverDetailEntity;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class DriverDetailEntity {
    @androidx.room.PrimaryKey()
    private int id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer driverAge;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String driverTeam;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String driverImage;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDriverAge() {
        return null;
    }
    
    public final void setDriverAge(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDriverTeam() {
        return null;
    }
    
    public final void setDriverTeam(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDriverImage() {
        return null;
    }
    
    public final void setDriverImage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public DriverDetailEntity(int id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer driverAge, @org.jetbrains.annotations.Nullable()
    java.lang.String driverTeam, @org.jetbrains.annotations.Nullable()
    java.lang.String driverImage) {
        super();
    }
    
    public DriverDetailEntity(@org.jetbrains.annotations.Nullable()
    com.generalmobile.app.odev.service.ItemsItemDetay it) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.generalmobile.app.odev.db.entities.DriverDetailEntity copy(int id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer driverAge, @org.jetbrains.annotations.Nullable()
    java.lang.String driverTeam, @org.jetbrains.annotations.Nullable()
    java.lang.String driverImage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}