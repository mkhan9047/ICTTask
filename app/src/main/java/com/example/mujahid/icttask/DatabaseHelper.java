package com.example.mujahid.icttask;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Mujahid on 4/21/2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final int database_version = 1;
    private static final String database_name = "StudentInfo";

    public DatabaseHelper(Context context) {
        super(context, database_name, null, database_version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String locationTable = "CREATE TABLE student (\n" +
                "name TEXT,\n" +
                "institute TEXT, \n" +
                "phone TEXT,\n" +
                "email TEXT,\n" +
                "gender TEXT\n" +
                ");";
        sqLiteDatabase.execSQL(locationTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
