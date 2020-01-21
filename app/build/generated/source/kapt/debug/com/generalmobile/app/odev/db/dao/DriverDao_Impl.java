package com.generalmobile.app.odev.db.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.generalmobile.app.odev.db.entities.DriverEntity;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class DriverDao_Impl implements DriverDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfDriverEntity;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfDriverEntity;

  public DriverDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDriverEntity = new EntityInsertionAdapter<DriverEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Driver`(`driverId`,`name`,`driverPoint`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DriverEntity value) {
        stmt.bindLong(1, value.getDriverId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDriverPoint() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getDriverPoint());
        }
      }
    };
    this.__deletionAdapterOfDriverEntity = new EntityDeletionOrUpdateAdapter<DriverEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Driver` WHERE `driverId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DriverEntity value) {
        stmt.bindLong(1, value.getDriverId());
      }
    };
  }

  @Override
  public void insert(DriverEntity driver) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfDriverEntity.insert(driver);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(DriverEntity driver) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfDriverEntity.handle(driver);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<DriverEntity> getAllDrivers() {
    final String _sql = "SELECT * FROM Driver";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDriverId = _cursor.getColumnIndexOrThrow("driverId");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfDriverPoint = _cursor.getColumnIndexOrThrow("driverPoint");
      final List<DriverEntity> _result = new ArrayList<DriverEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final DriverEntity _item;
        final int _tmpDriverId;
        _tmpDriverId = _cursor.getInt(_cursorIndexOfDriverId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final Integer _tmpDriverPoint;
        if (_cursor.isNull(_cursorIndexOfDriverPoint)) {
          _tmpDriverPoint = null;
        } else {
          _tmpDriverPoint = _cursor.getInt(_cursorIndexOfDriverPoint);
        }
        _item = new DriverEntity(_tmpDriverId,_tmpName,_tmpDriverPoint);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
