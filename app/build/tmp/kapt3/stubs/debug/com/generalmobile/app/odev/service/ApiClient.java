package com.generalmobile.app.odev.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/generalmobile/app/odev/service/ApiClient;", "", "()V", "BASE_URL", "", "getBASE_URL", "()Ljava/lang/String;", "BASE_URL_MOVIES", "getBASE_URL_MOVIES", "client", "Lretrofit2/Retrofit;", "getClient", "()Lretrofit2/Retrofit;", "retrofit", "app_debug"})
public final class ApiClient {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String BASE_URL = "http://my-json-server.typicode.com/oguzayan/kuka/";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String BASE_URL_MOVIES = "https://api.themoviedb.org/3/movie/550";
    private static retrofit2.Retrofit retrofit;
    public static final com.generalmobile.app.odev.service.ApiClient INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBASE_URL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBASE_URL_MOVIES() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final retrofit2.Retrofit getClient() {
        return null;
    }
    
    private ApiClient() {
        super();
    }
}