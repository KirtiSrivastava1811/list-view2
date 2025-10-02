package com.example.listviewproject

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        val name=intent.getStringExtra("name")
        val phone=intent.getStringExtra("phone")
        val imageId=intent.getIntExtra("imageId",R.drawable.kirti)

        val tvname=findViewById<TextView>(R.id.tvname)
        val tvphone=findViewById<TextView>(R.id.tvphone)
        val profileImage=findViewById<CircleImageView>(R.id.profile_image)

        tvname.text=name
        tvphone.text=phone
        profileImage.setImageResource(imageId)

        }
    }
