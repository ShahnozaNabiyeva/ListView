package com.shahnoza.listview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.shahnoza.listview.R

class UserAdapter( context: Context,val list:List<String>):ArrayAdapter<String>(context, R.layout.item_listview,list) {


    // convertView - har bitta itemni  konvertlab birma-bir olishi
    // getView - har bitta itemni yaratib beradigan funksiya
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val itemView:View
        if (convertView==null){
            itemView = LayoutInflater.from(parent?.context).inflate(R.layout.item_listview,parent,false)
        }else{
            itemView = convertView
        }
       itemView.findViewById<TextView>(R.id.item_txt).text=list[position]
        return itemView

    }


}