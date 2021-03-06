// Generated by Dagger (https://google.github.io/dagger).
package com.generalmobile.app.odev.ui.main;

import com.generalmobile.app.odev.db.AppDatabase;
import com.generalmobile.app.odev.service.odevApi;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class MainActivityViewModel_MembersInjector
    implements MembersInjector<MainActivityViewModel> {
  private final Provider<AppDatabase> dbProvider;

  private final Provider<odevApi> baseApiProvider;

  public MainActivityViewModel_MembersInjector(
      Provider<AppDatabase> dbProvider, Provider<odevApi> baseApiProvider) {
    this.dbProvider = dbProvider;
    this.baseApiProvider = baseApiProvider;
  }

  public static MembersInjector<MainActivityViewModel> create(
      Provider<AppDatabase> dbProvider, Provider<odevApi> baseApiProvider) {
    return new MainActivityViewModel_MembersInjector(dbProvider, baseApiProvider);
  }

  @Override
  public void injectMembers(MainActivityViewModel instance) {
    injectDb(instance, dbProvider.get());
    injectBaseApi(instance, baseApiProvider.get());
  }

  public static void injectDb(MainActivityViewModel instance, AppDatabase db) {
    instance.db = db;
  }

  public static void injectBaseApi(MainActivityViewModel instance, odevApi baseApi) {
    instance.baseApi = baseApi;
  }
}
