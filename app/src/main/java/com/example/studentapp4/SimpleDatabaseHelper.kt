package com.example.studentapp4

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class SimpleDatabaseHelper(context: Context?): SQLiteOpenHelper(context,DBNAME,null,VERSION){

    companion object{
        private  const val DBNAME = "sample.sqlite"
        private const val VERSION = 1
    }

    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.let{
            it.execSQL("CREATE TABLE student (" +
                    "gakuban TEXT PRIMARY KEY, namae TEXT,kurasu TEXT)")
            it.execSQL("INSERT INTO student VALUES('3210001','大西','2-1')")
            it.execSQL("INSERT INTO student VALUES('3210002','花田','2-1')")
            it.execSQL("INSERT INTO student VALUES('3210003','石岡','2-2')")
            it.execSQL("INSERT INTO student VALUES('3210004','高屋','2-2')")
            it.execSQL("INSERT INTO student VALUES('3210005','多久和','2-2')")
            it.execSQL("INSERT INTO student VALUES('3210006','夏井','2-3')")
            it.execSQL("INSERT INTO student VALUES('3210007','渡部','2-3')")
        }
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        p0?.let{
            it.execSQL("DROP TABLE IF EXISTS student")
            onCreate(it)
        }
    }

    override fun onOpen(db:SQLiteDatabase?){
        super.onOpen( db )
    }
}