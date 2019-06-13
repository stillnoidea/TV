package com.example.tv


import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wall_image.setOnClickListener{
            big_pic.setImageResource(R.drawable.mur)
            title_text.text=getString(R.string.wall_title)
        }

        flower_image.setOnClickListener{
            big_pic.setImageResource(R.drawable.kwiat)
            title_text.text=getString(R.string.flower_title)
        }

        winter_image.setOnClickListener{
            big_pic.setImageResource(R.drawable.z)
            title_text.text=getString(R.string.winter_title)
        }
    }
}