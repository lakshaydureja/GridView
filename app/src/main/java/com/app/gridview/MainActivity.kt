package com.app.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var gridView: GridView
    var nameList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        gridView = findViewById(R.id.gridView)
        fillArrays()

    val adapter = AnimalsAdapter(this@MainActivity,nameList,imageList)

        gridView.adapter = adapter


        //for onClickListner
        gridView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(applicationContext,"You Clicked ${nameList[position ]}",Toast.LENGTH_SHORT).show()
        }



    }
    fun fillArrays(){
        nameList.add("bird")
        nameList.add("cat")
        nameList.add("chicken")
        nameList.add("dog")
        nameList.add("fish")
        nameList.add("monkey")
        nameList.add("rabbit")
        nameList.add("sheep")
        nameList.add("loin")


        imageList.add(R.drawable.bird)
        imageList.add(R.drawable.cat)
        imageList.add(R.drawable.chicken)
        imageList.add(R.drawable.dog)
        imageList.add(R.drawable.fish)
        imageList.add(R.drawable.monkey)
        imageList.add(R.drawable.rabbit)
        imageList.add(R.drawable.sheep)
        imageList.add(R.drawable.cat)



        //extra repeats to make list scrollable.
        nameList.add("bird")
        nameList.add("cat")
        nameList.add("chicken")
        nameList.add("dog")
        nameList.add("fish")
        nameList.add("monkey")
        nameList.add("rabbit")
        nameList.add("sheep")
        nameList.add("loin")
        imageList.add(R.drawable.bird)
        imageList.add(R.drawable.cat)
        imageList.add(R.drawable.chicken)
        imageList.add(R.drawable.dog)
        imageList.add(R.drawable.fish)
        imageList.add(R.drawable.monkey)
        imageList.add(R.drawable.rabbit)
        imageList.add(R.drawable.sheep)
        imageList.add(R.drawable.cat)
        nameList.add("bird")
        nameList.add("cat")
        nameList.add("chicken")
        nameList.add("dog")
        nameList.add("fish")
        nameList.add("monkey")
        nameList.add("rabbit")
        nameList.add("sheep")
        nameList.add("loin")
        imageList.add(R.drawable.bird)
        imageList.add(R.drawable.cat)
        imageList.add(R.drawable.chicken)
        imageList.add(R.drawable.dog)
        imageList.add(R.drawable.fish)
        imageList.add(R.drawable.monkey)
        imageList.add(R.drawable.rabbit)
        imageList.add(R.drawable.sheep)
        imageList.add(R.drawable.cat)


    }


}