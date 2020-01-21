package com.generalmobile.app.odev.ui.main;

import java.lang.System;

/**
 * * A simple [Fragment] subclass.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0016"}, d2 = {"Lcom/generalmobile/app/odev/ui/main/GecisFragment;", "Lcom/generalmobile/app/odev/core/BaseFragment;", "Lcom/generalmobile/app/odev/ui/main/GecisFragmentViewModel;", "Lcom/generalmobile/app/odev/databinding/FragmentGecisBinding;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "databaseManager", "Lcom/generalmobile/app/odev/ui/main/GecisFragment$DataBaseManager;", "getDatabaseManager", "()Lcom/generalmobile/app/odev/ui/main/GecisFragment$DataBaseManager;", "setDatabaseManager", "(Lcom/generalmobile/app/odev/ui/main/GecisFragment$DataBaseManager;)V", "getLayoutRes", "", "initViewModel", "", "DataBaseManager", "app_debug"})
public final class GecisFragment extends com.generalmobile.app.odev.core.BaseFragment<com.generalmobile.app.odev.ui.main.GecisFragmentViewModel, com.generalmobile.app.odev.databinding.FragmentGecisBinding> {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String TAG;
    @org.jetbrains.annotations.Nullable()
    private com.generalmobile.app.odev.ui.main.GecisFragment.DataBaseManager databaseManager;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    public final void setTAG(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.generalmobile.app.odev.ui.main.GecisFragment.DataBaseManager getDatabaseManager() {
        return null;
    }
    
    public final void setDatabaseManager(@org.jetbrains.annotations.Nullable()
    com.generalmobile.app.odev.ui.main.GecisFragment.DataBaseManager p0) {
    }
    
    @java.lang.Override()
    public void initViewModel() {
    }
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    public GecisFragment() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\t\u001a\u00020\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0000X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/generalmobile/app/odev/ui/main/GecisFragment$DataBaseManager;", "Landroidx/room/RoomDatabase;", "()V", "Instance", "getInstance", "()Lcom/generalmobile/app/odev/ui/main/GecisFragment$DataBaseManager;", "setInstance", "(Lcom/generalmobile/app/odev/ui/main/GecisFragment$DataBaseManager;)V", "getDatabaseManager", "context", "Landroid/content/Context;", "app_debug"})
    public static abstract class DataBaseManager extends androidx.room.RoomDatabase {
        @org.jetbrains.annotations.Nullable()
        private com.generalmobile.app.odev.ui.main.GecisFragment.DataBaseManager Instance;
        
        @org.jetbrains.annotations.Nullable()
        public final com.generalmobile.app.odev.ui.main.GecisFragment.DataBaseManager getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.Nullable()
        com.generalmobile.app.odev.ui.main.GecisFragment.DataBaseManager p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.generalmobile.app.odev.ui.main.GecisFragment.DataBaseManager getDatabaseManager(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        public DataBaseManager() {
            super();
        }
    }
}