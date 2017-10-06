package com.example.root.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by root on 10/5/17.
 */

public class DatabaseHandler extends SQLiteOpenHelper {

    static final String database="students.db";
    final String table="admin";


    public DatabaseHandler(Context context) {
        super(context, database, null, 1);

      //  SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+table+ " (ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,SURNAME TEXT,MARKS INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+table);
        onCreate(db);
    }

    public boolean insertData(String name,String surname,String mark)
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();

        ContentValues contentValues=new ContentValues();
        contentValues.put("NAME",name);
        contentValues.put("SURNAME",surname);
        contentValues.put("MARKS",mark);

       long insertVale= sqLiteDatabase.insert(table,null,contentValues);
        if(insertVale == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public Cursor showAllData(){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        return sqLiteDatabase.rawQuery("select * from "+table,null);
        //return
    }
}
