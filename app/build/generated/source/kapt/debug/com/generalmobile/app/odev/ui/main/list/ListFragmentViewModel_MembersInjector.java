// Generated by Dagger (https://google.github.io/dagger).
package com.generalmobile.app.odev.ui.main.list;

import com.generalmobile.app.odev.db.AppDatabase;
import com.generalmobile.app.odev.service.odevApi;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class ListFragmentViewModel_MembersInjector
    implements MembersInjector<ListFragmentViewModel> {
  private final Provider<odevApi> baseApiProvider;

  private final Provider<AppDatabase> dbProvider;

  public ListFragmentViewModel_MembersInjector(
      Provider<odevApi> baseApiProvider, Provider<AppDatabase> dbProvider) {
    this.baseApiProvider = baseApiProvider;
    this.dbProvider = dbProvider;
  }

  public static MembersInjector<ListFragmentViewModel> create(
      Provider<odevApi> baseApiProvider, Provider<AppDatabase> dbProvider) {
    return new ListFragmentViewModel_MembersInjector(baseApiProvider, dbProvider);
  }

  @Override
  public void injectMembers(ListFragmentViewModel instance) {
    injectBaseApi(instance, baseApiProvider.get());
    injectDb(instance, dbProvider.get());
  }

  public static void injectBaseApi(ListFragmentViewModel instance, odevApi baseApi) {
    instance.baseApi = baseApi;
  }

  public static void injectDb(ListFragmentViewModel instance, AppDatabase db) {
    instance.db = db;
  }
}
