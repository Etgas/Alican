package com.generalmobile.app.odev.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    val BASE_URL = "http://my-json-server.typicode.com/oguzayan/kuka/"
    val BASE_URL_MOVIES = "https://api.themoviedb.org/3/movie/550"
    private var retrofit:Retrofit? = null


    val client :Retrofit?
    get() {
        if (retrofit==null){
            retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
        }
        return retrofit
    }
}