package com.generalmobile.app.odev.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/generalmobile/app/odev/ui/main/MainActivityViewModel;", "Lcom/generalmobile/app/odev/core/BaseViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "baseApi", "Lcom/generalmobile/app/odev/service/odevApi;", "getBaseApi", "()Lcom/generalmobile/app/odev/service/odevApi;", "setBaseApi", "(Lcom/generalmobile/app/odev/service/odevApi;)V", "db", "Lcom/generalmobile/app/odev/db/AppDatabase;", "getDb", "()Lcom/generalmobile/app/odev/db/AppDatabase;", "setDb", "(Lcom/generalmobile/app/odev/db/AppDatabase;)V", "app_debug"})
public final class MainActivityViewModel extends com.generalmobile.app.odev.core.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.generalmobile.app.odev.db.AppDatabase db;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.generalmobile.app.odev.service.odevApi baseApi;
    
    @org.jetbrains.annotations.NotNull()
    public final com.generalmobile.app.odev.db.AppDatabase getDb() {
        return null;
    }
    
    public final void setDb(@org.jetbrains.annotations.NotNull()
    com.generalmobile.app.odev.db.AppDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.generalmobile.app.odev.service.odevApi getBaseApi() {
        return null;
    }
    
    public final void setBaseApi(@org.jetbrains.annotations.NotNull()
    com.generalmobile.app.odev.service.odevApi p0) {
    }
    
    public MainActivityViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
}