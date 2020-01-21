package com.generalmobile.app.odev.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u0016H\'J\r\u0010\u0017\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u0010\u0011J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u0019H&J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0016H\u0016J\u0012\u0010!\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J$\u0010$\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010&\u001a\u00020\u0019H\u0016J\b\u0010\'\u001a\u00020\u0019H\u0016R\u001c\u0010\t\u001a\u00028\u0001X\u0096.\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006("}, d2 = {"Lcom/generalmobile/app/odev/core/BaseFragment;", "VM", "Lcom/generalmobile/app/odev/core/BaseViewModel;", "DB", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/Fragment;", "mViewModelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "mBinding", "getMBinding", "()Landroidx/databinding/ViewDataBinding;", "setMBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "viewModel", "getViewModel", "()Lcom/generalmobile/app/odev/core/BaseViewModel;", "setViewModel", "(Lcom/generalmobile/app/odev/core/BaseViewModel;)V", "Lcom/generalmobile/app/odev/core/BaseViewModel;", "getLayoutRes", "", "getViewM", "init", "", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "initViewModel", "navigate", "action", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "onInject", "refresh", "app_debug"})
public abstract class BaseFragment<VM extends com.generalmobile.app.odev.core.BaseViewModel, DB extends androidx.databinding.ViewDataBinding> extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public VM viewModel;
    @org.jetbrains.annotations.NotNull()
    public DB mBinding;
    private final java.lang.Class<VM> mViewModelClass = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final VM getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    VM p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public DB getMBinding() {
        return null;
    }
    
    public void setMBinding(@org.jetbrains.annotations.NotNull()
    DB p0) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container) {
    }
    
    public void init() {
    }
    
    @androidx.annotation.LayoutRes()
    public abstract int getLayoutRes();
    
    private final VM getViewM() {
        return null;
    }
    
    public void onInject() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public void navigate(int action) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public abstract void initViewModel();
    
    public void refresh() {
    }
    
    public BaseFragment(@org.jetbrains.annotations.NotNull()
    java.lang.Class<VM> mViewModelClass) {
        super();
    }
}