package com.example.listviewproject

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.ArrayAdapter
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter (val context: Activity, val arrayList: ArrayList<User>) :
    ArrayAdapter<User>(context,R.layout.eachitem,arrayList){
        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            val inflater = LayoutInflater.from(context)
            val view = inflater.inflate(R.layout.eachitem, null)

            var image = view.findViewById<CircleImageView>(R.id.profile_image)
            var name = view.findViewById<TextView>(R.id.textView)
            var lastMsg = view.findViewById<TextView>(R.id.textView2)
            var lastMsgTime = view.findViewById<TextView>(R.id.tVLastMsgTime)

            name.text = arrayList[position].name
            lastMsg.text = arrayList[position].lastmsg
            lastMsgTime.text = arrayList[position].lastmsgtime
            image.setImageResource(arrayList[position].imageId)


            return view
        }
}