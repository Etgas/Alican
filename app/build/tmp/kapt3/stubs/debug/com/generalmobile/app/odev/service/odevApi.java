package com.generalmobile.app.odev.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\'\u00a8\u0006\t"}, d2 = {"Lcom/generalmobile/app/odev/service/odevApi;", "", "tumDetaylariGetir", "Lio/reactivex/Observable;", "Lcom/generalmobile/app/odev/service/ItemsItemDetay;", "id", "", "tumListeleriGetir", "Lcom/generalmobile/app/odev/service/ListResponse;", "app_debug"})
public abstract interface odevApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "drivers")
    public abstract io.reactivex.Observable<com.generalmobile.app.odev.service.ListResponse> tumListeleriGetir();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "driverDetail/{id}")
    public abstract io.reactivex.Observable<com.generalmobile.app.odev.service.ItemsItemDetay> tumDetaylariGetir(@retrofit2.http.Path(value = "id")
    int id);
}