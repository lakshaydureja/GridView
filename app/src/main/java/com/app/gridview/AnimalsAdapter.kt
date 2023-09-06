package com.app.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AnimalsAdapter(
    var context: Context,
    var nameList: ArrayList<String>,
    var imageList: ArrayList<Int>
) : BaseAdapter() {

    override fun getCount(): Int {
        //this will give us number of items to be displayed in grid view
return nameList.size
    }

    override fun getItem(position: Int): Any? {
        // in this we get data associated with a specified position.\

return null   }

    override fun getItemId(position: Int): Long {
        //we can get the row id of a specific item in the grid
return 0    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        //in this we will define this design of our grid view.
    val view : View = LayoutInflater.from(parent?.context).inflate(R.layout.grid_layout,parent,false)

        var animalName:TextView = view.findViewById(R.id.textView)
        var imageName : ImageView = view.findViewById(R.id.imageView)

        animalName.text = nameList.get(position)
        imageName.setImageResource(imageList.get(position))

        return  view

    }
}