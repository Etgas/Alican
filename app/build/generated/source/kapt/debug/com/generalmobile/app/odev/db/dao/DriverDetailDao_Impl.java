package com.generalmobile.app.odev.db.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.generalmobile.app.odev.db.entities.DriverDetailEntity;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class DriverDetailDao_Impl implements DriverDetailDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfDriverDetailEntity;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfDriverDetailEntity;

  public DriverDetailDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDriverDetailEntity = new EntityInsertionAdapter<DriverDetailEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `DriverDetail`(`id`,`driverAge`,`driverTeam`,`driverImage`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DriverDetailEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getDriverAge() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getDriverAge());
        }
        if (value.getDriverTeam() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDriverTeam());
        }
        if (value.getDriverImage() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDriverImage());
        }
      }
    };
    this.__deletionAdapterOfDriverDetailEntity = new EntityDeletionOrUpdateAdapter<DriverDetailEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `DriverDetail` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DriverDetailEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public void Insert(DriverDetailEntity driverDetail) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfDriverDetailEntity.insert(driverDetail);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void Delete(DriverDetailEntity driverDetail) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfDriverDetailEntity.handle(driverDetail);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<DriverDetailEntity> getAllDetail() {
    final String _sql = "SELECT * FROM DriverDetail";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfDriverAge = _cursor.getColumnIndexOrThrow("driverAge");
      final int _cursorIndexOfDriverTeam = _cursor.getColumnIndexOrThrow("driverTeam");
      final int _cursorIndexOfDriverImage = _cursor.getColumnIndexOrThrow("driverImage");
      final List<DriverDetailEntity> _result = new ArrayList<DriverDetailEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final DriverDetailEntity _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final Integer _tmpDriverAge;
        if (_cursor.isNull(_cursorIndexOfDriverAge)) {
          _tmpDriverAge = null;
        } else {
          _tmpDriverAge = _cursor.getInt(_cursorIndexOfDriverAge);
        }
        final String _tmpDriverTeam;
        _tmpDriverTeam = _cursor.getString(_cursorIndexOfDriverTeam);
        final String _tmpDriverImage;
        _tmpDriverImage = _cursor.getString(_cursorIndexOfDriverImage);
        _item = new DriverDetailEntity(_tmpId,_tmpDriverAge,_tmpDriverTeam,_tmpDriverImage);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public DriverDetailEntity getDriverId(int driverId) {
    final String _sql = "SELECT * FROM DriverDetail WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, driverId);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfDriverAge = _cursor.getColumnIndexOrThrow("driverAge");
      final int _cursorIndexOfDriverTeam = _cursor.getColumnIndexOrThrow("driverTeam");
      final int _cursorIndexOfDriverImage = _cursor.getColumnIndexOrThrow("driverImage");
      final DriverDetailEntity _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final Integer _tmpDriverAge;
        if (_cursor.isNull(_cursorIndexOfDriverAge)) {
          _tmpDriverAge = null;
        } else {
          _tmpDriverAge = _cursor.getInt(_cursorIndexOfDriverAge);
        }
        final String _tmpDriverTeam;
        _tmpDriverTeam = _cursor.getString(_cursorIndexOfDriverTeam);
        final String _tmpDriverImage;
        _tmpDriverImage = _cursor.getString(_cursorIndexOfDriverImage);
        _result = new DriverDetailEntity(_tmpId,_tmpDriverAge,_tmpDriverTeam,_tmpDriverImage);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
