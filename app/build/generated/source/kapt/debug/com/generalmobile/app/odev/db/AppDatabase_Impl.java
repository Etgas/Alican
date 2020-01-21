package com.generalmobile.app.odev.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.generalmobile.app.odev.db.dao.DriverDao;
import com.generalmobile.app.odev.db.dao.DriverDao_Impl;
import com.generalmobile.app.odev.db.dao.DriverDetailDao;
import com.generalmobile.app.odev.db.dao.DriverDetailDao_Impl;
import com.generalmobile.app.odev.db.dao.ExampleDao;
import com.generalmobile.app.odev.db.dao.ExampleDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class AppDatabase_Impl extends AppDatabase {
  private volatile ExampleDao _exampleDao;

  private volatile DriverDao _driverDao;

  private volatile DriverDetailDao _driverDetailDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Example` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `exampleString` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Driver` (`driverId` INTEGER NOT NULL, `name` TEXT, `driverPoint` INTEGER, PRIMARY KEY(`driverId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `DriverDetail` (`id` INTEGER NOT NULL, `driverAge` INTEGER, `driverTeam` TEXT, `driverImage` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"5676353343997d5d0703db3984c7b24d\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Example`");
        _db.execSQL("DROP TABLE IF EXISTS `Driver`");
        _db.execSQL("DROP TABLE IF EXISTS `DriverDetail`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsExample = new HashMap<String, TableInfo.Column>(2);
        _columnsExample.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsExample.put("exampleString", new TableInfo.Column("exampleString", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysExample = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesExample = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoExample = new TableInfo("Example", _columnsExample, _foreignKeysExample, _indicesExample);
        final TableInfo _existingExample = TableInfo.read(_db, "Example");
        if (! _infoExample.equals(_existingExample)) {
          throw new IllegalStateException("Migration didn't properly handle Example(com.generalmobile.app.odev.db.entities.Example).\n"
                  + " Expected:\n" + _infoExample + "\n"
                  + " Found:\n" + _existingExample);
        }
        final HashMap<String, TableInfo.Column> _columnsDriver = new HashMap<String, TableInfo.Column>(3);
        _columnsDriver.put("driverId", new TableInfo.Column("driverId", "INTEGER", true, 1));
        _columnsDriver.put("name", new TableInfo.Column("name", "TEXT", false, 0));
        _columnsDriver.put("driverPoint", new TableInfo.Column("driverPoint", "INTEGER", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDriver = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDriver = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDriver = new TableInfo("Driver", _columnsDriver, _foreignKeysDriver, _indicesDriver);
        final TableInfo _existingDriver = TableInfo.read(_db, "Driver");
        if (! _infoDriver.equals(_existingDriver)) {
          throw new IllegalStateException("Migration didn't properly handle Driver(com.generalmobile.app.odev.db.entities.DriverEntity).\n"
                  + " Expected:\n" + _infoDriver + "\n"
                  + " Found:\n" + _existingDriver);
        }
        final HashMap<String, TableInfo.Column> _columnsDriverDetail = new HashMap<String, TableInfo.Column>(4);
        _columnsDriverDetail.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsDriverDetail.put("driverAge", new TableInfo.Column("driverAge", "INTEGER", false, 0));
        _columnsDriverDetail.put("driverTeam", new TableInfo.Column("driverTeam", "TEXT", false, 0));
        _columnsDriverDetail.put("driverImage", new TableInfo.Column("driverImage", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDriverDetail = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDriverDetail = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDriverDetail = new TableInfo("DriverDetail", _columnsDriverDetail, _foreignKeysDriverDetail, _indicesDriverDetail);
        final TableInfo _existingDriverDetail = TableInfo.read(_db, "DriverDetail");
        if (! _infoDriverDetail.equals(_existingDriverDetail)) {
          throw new IllegalStateException("Migration didn't properly handle DriverDetail(com.generalmobile.app.odev.db.entities.DriverDetailEntity).\n"
                  + " Expected:\n" + _infoDriverDetail + "\n"
                  + " Found:\n" + _existingDriverDetail);
        }
      }
    }, "5676353343997d5d0703db3984c7b24d", "bc3b6248b7e3285f368a2107d28e88c9");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "Example","Driver","DriverDetail");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Example`");
      _db.execSQL("DELETE FROM `Driver`");
      _db.execSQL("DELETE FROM `DriverDetail`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public ExampleDao exampleDao() {
    if (_exampleDao != null) {
      return _exampleDao;
    } else {
      synchronized(this) {
        if(_exampleDao == null) {
          _exampleDao = new ExampleDao_Impl(this);
        }
        return _exampleDao;
      }
    }
  }

  @Override
  public DriverDao driverDao() {
    if (_driverDao != null) {
      return _driverDao;
    } else {
      synchronized(this) {
        if(_driverDao == null) {
          _driverDao = new DriverDao_Impl(this);
        }
        return _driverDao;
      }
    }
  }

  @Override
  public DriverDetailDao driverDetailDao() {
    if (_driverDetailDao != null) {
      return _driverDetailDao;
    } else {
      synchronized(this) {
        if(_driverDetailDao == null) {
          _driverDetailDao = new DriverDetailDao_Impl(this);
        }
        return _driverDetailDao;
      }
    }
  }
}
