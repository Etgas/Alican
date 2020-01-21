package com.generalmobile.app.odev.ui.main.detay;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d2\u0006\u0010\u001e\u001a\u00020\u001fR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017\u00a8\u0006 "}, d2 = {"Lcom/generalmobile/app/odev/ui/main/detay/DetayFragmentViewModel;", "Lcom/generalmobile/app/odev/core/BaseViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "baseApi", "Lcom/generalmobile/app/odev/service/odevApi;", "getBaseApi", "()Lcom/generalmobile/app/odev/service/odevApi;", "setBaseApi", "(Lcom/generalmobile/app/odev/service/odevApi;)V", "db", "Lcom/generalmobile/app/odev/db/AppDatabase;", "getDb", "()Lcom/generalmobile/app/odev/db/AppDatabase;", "setDb", "(Lcom/generalmobile/app/odev/db/AppDatabase;)V", "editTextTest", "Landroidx/databinding/ObservableField;", "", "getEditTextTest", "()Landroidx/databinding/ObservableField;", "setEditTextTest", "(Landroidx/databinding/ObservableField;)V", "liste", "Lcom/generalmobile/app/odev/service/ItemsItemDetay;", "getListe", "setListe", "getDetay", "Lio/reactivex/Observable;", "id", "", "app_debug"})
public final class DetayFragmentViewModel extends com.generalmobile.app.odev.core.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.generalmobile.app.odev.service.odevApi baseApi;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.generalmobile.app.odev.db.AppDatabase db;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<com.generalmobile.app.odev.service.ItemsItemDetay> liste;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> editTextTest;
    
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
    public final androidx.databinding.ObservableField<com.generalmobile.app.odev.service.ItemsItemDetay> getListe() {
        return null;
    }
    
    public final void setListe(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<com.generalmobile.app.odev.service.ItemsItemDetay> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getEditTextTest() {
        return null;
    }
    
    public final void setEditTextTest(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.generalmobile.app.odev.service.ItemsItemDetay> getDetay(int id) {
        return null;
    }
    
    public DetayFragmentViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
}