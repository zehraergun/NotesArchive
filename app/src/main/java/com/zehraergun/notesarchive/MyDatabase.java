package com.zehraergun.notesarchive;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyDatabase extends SQLiteOpenHelper {

    private Context context;
    private static final String DATABASE_NAME = "Notes Library.db";
    private static final int DATABASE_VERSION =1;

    private static final String TABLE_NAME = "notes";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_TITLE = "notes_name";
    private static final String COLUMN_COMPOSER= "notes_composer";

    public MyDatabase(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory = null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME +
                " (" + COLUMN_ID  + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_TITLE + " TEXT," +
                COLUMN_COMPOSER + "TEXT);";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }
    void addnote(String title, String composer) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_TITLE, title);
        cv.put(COLUMN_COMPOSER, composer);
        long result = db.insert(TABLE_NAME, null, cv);

    }
}
