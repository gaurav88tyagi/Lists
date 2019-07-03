package com.example.lists

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numList = ArrayList<Int>()

        for(i in 0..1000) {
            numList.add(i)
        }

        lv.adapter =  ArrayAdapter(this,  android.R.layout.simple_list_item_1, android.R.id.text1, numList)

    }
}
