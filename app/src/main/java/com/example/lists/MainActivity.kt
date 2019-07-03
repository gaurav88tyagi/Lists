package com.example.lists

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numList = ArrayList<Int>()

        for(i in 0..1000) {
            numList.add(i)
        }

        lv.adapter =  ArrayAdapter(this,  android.R.layout.simple_list_item_1, android.R.id.text1, numList)

        lv.setOnItemClickListener { parent, view, position, id ->

            toast("Clicked on $position :")
            //   ${ view.tv.text } -> when you create your own layout
            //   doesn't work when we use android layout

        }

    }
}
