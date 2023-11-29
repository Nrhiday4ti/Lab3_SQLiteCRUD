package com.example.lab3_sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.core.database.sqlite.SQLiteDatabaseKt;

public class DataHelper extends SQLiteOpenHelper {

    //Database Name
    private static final String DATABASE_NAME = "personalbiodata.db";
    //Database version
    private static final int DATABASE_VERSION = 1;
    //Create constructor for data helper
    public DataHelper(Context context) {
        super(context, DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    //Create table
    public void onCreate(SQLiteDatabase db){
        String sql = "create table biodata(no integer primary key, name text null, dob text null, gender text null, address text null);";
        Log.d ("Data", "onCreate: " +sql);
        db.execSQL(sql);
    }

    //Create method to upgrade database version if database exist
    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
    }

}

