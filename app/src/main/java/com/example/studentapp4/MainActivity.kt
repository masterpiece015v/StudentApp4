package com.example.studentapp4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView1 = findViewById<RecyclerView>(R.id.recyclerView1)
        val list = mutableListOf<String>()
        //データベースからカーソルを作成
        val helper =SimpleDatabaseHelper(this)
        helper.readableDatabase.use{
            it.query(
                true, "student",
                arrayOf("kurasu"), "", arrayOf(),
                null, null,
                null, null
            ).use{ cs ->
                while( cs.moveToNext() ){
                    list.add( cs.getString(0) )
                }
            }
        }
        //アダプター
        val adapter = ListAdapter1( list )
        recyclerView1.adapter = adapter
        recyclerView1.layoutManager = LinearLayoutManager(this).apply{
            orientation = LinearLayoutManager.VERTICAL
        }
    }
}