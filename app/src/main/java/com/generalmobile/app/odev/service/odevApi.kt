package com.generalmobile.app.odev.service

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface odevApi {

    @GET("drivers")
    fun tumListeleriGetir():Observable<ListResponse>

    @GET("driverDetail/{id}")
    fun tumDetaylariGetir(@Path("id")id : Int):Observable<ItemsItemDetay>


}