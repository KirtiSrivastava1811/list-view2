package com.example.listviewproject

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import android.widget.ListView
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var userArrayList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name=arrayOf("kirti","anamika","shreya","puchu","nitish")
        var lastmsg= arrayOf("hii","anamika","verma", "i love","youuu")
        var lastmsgtime=arrayOf("7:45","4:12","5:13","4:00","3:20")
        var phoneNo=arrayOf("873488745","873488745","873488745","873488745","873488745")
        var imageId=intArrayOf(R.drawable.kirti,R.drawable.anamika,R.drawable.shreya,R.drawable.puchu,R.drawable.nitish)
        userArrayList=ArrayList()
for (eachIndex in name.indices){
    val user=User(name[eachIndex],lastmsg[eachIndex],lastmsgtime[eachIndex],phoneNo[eachIndex],imageId[eachIndex])
    userArrayList.add(user)

}
val listView= findViewById<ListView>(R.id.listView)
        listView.isClickable=true
        listView.adapter=MyAdapter(this,userArrayList)
        listView.setOnItemClickListener { parent, view, position, id ->
            val userName=name[position]
            val phone=phoneNo[position]
            val imageId=imageId[position]
            val i= Intent(this,UserActivity::class.java)
            i.putExtra("name",userName)
            i.putExtra("phone",phone)
            i.putExtra("imageId",imageId)
            startActivity(i)


        }
    }
}