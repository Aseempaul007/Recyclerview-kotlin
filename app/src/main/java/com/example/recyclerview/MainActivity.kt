package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val mainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)

        val list = mutableListOf<MyData>()

        for (i in 1..100){
            list.add(MyData("Title : $i","Description $i"))
        }

        mainBinding.recyclerView.adapter= MyAdapter(this,list)
        mainBinding.recyclerView.layoutManager= LinearLayoutManager(this)

    }
}