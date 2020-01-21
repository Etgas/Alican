package com.generalmobile.app.odev.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/generalmobile/app/odev/core/BindingAdapter;", "", "()V", "loadAge", "", "view", "Landroid/widget/TextView;", "age", "", "loadEditText", "Landroid/widget/EditText;", "name", "loadImage", "Landroid/widget/ImageView;", "url", "loadMoviesName", "moviesName", "loadText", "team", "app_debug"})
public final class BindingAdapter {
    public static final com.generalmobile.app.odev.core.BindingAdapter INSTANCE = null;
    
    @androidx.databinding.BindingAdapter(value = {"app:loadImage"})
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:loadTeam"})
    public static final void loadText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    java.lang.String team) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:loadAge"})
    public static final void loadAge(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    java.lang.String age) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:loadEditText"})
    public static final void loadEditText(@org.jetbrains.annotations.Nullable()
    android.widget.EditText view, @org.jetbrains.annotations.Nullable()
    java.lang.String name) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:loadMoviesName"})
    public static final void loadMoviesName(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    java.lang.String moviesName) {
    }
    
    private BindingAdapter() {
        super();
    }
}