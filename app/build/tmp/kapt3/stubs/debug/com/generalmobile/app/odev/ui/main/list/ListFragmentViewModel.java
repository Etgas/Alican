package com.generalmobile.app.odev.ui.main.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0019R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001a"}, d2 = {"Lcom/generalmobile/app/odev/ui/main/list/ListFragmentViewModel;", "Lcom/generalmobile/app/odev/core/BaseViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "baseApi", "Lcom/generalmobile/app/odev/service/odevApi;", "getBaseApi", "()Lcom/generalmobile/app/odev/service/odevApi;", "setBaseApi", "(Lcom/generalmobile/app/odev/service/odevApi;)V", "db", "Lcom/generalmobile/app/odev/db/AppDatabase;", "getDb", "()Lcom/generalmobile/app/odev/db/AppDatabase;", "setDb", "(Lcom/generalmobile/app/odev/db/AppDatabase;)V", "liste", "Landroidx/databinding/ObservableField;", "Lcom/generalmobile/app/odev/service/ListResponse;", "getListe", "()Landroidx/databinding/ObservableField;", "setListe", "(Landroidx/databinding/ObservableField;)V", "getList", "Lio/reactivex/Observable;", "app_debug"})
public final class ListFragmentViewModel extends com.generalmobile.app.odev.core.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.generalmobile.app.odev.service.odevApi baseApi;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.generalmobile.app.odev.db.AppDatabase db;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<com.generalmobile.app.odev.service.ListResponse> liste;
    
    @org.jetbrains.annotations.NotNull()
    public final com.generalmobile.app.odev.service.odevApi getBaseApi() {
        return null;
    }
    
    public final void setBaseApi(@org.jetbrains.annotations.NotNull()
    com.generalmobile.app.odev.service.odevApi p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.generalmobile.app.odev.db.AppDatabase getDb() {
        return null;
    }
    
    public final void setDb(@org.jetbrains.annotations.NotNull()
    com.generalmobile.app.odev.db.AppDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<com.generalmobile.app.odev.service.ListResponse> getListe() {
        return null;
    }
    
    public final void setListe(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<com.generalmobile.app.odev.service.ListResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.generalmobile.app.odev.service.ListResponse> getList() {
        return null;
    }
    
    public ListFragmentViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
}