package com.example.roomscape

import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var listener = View.OnTouchListener { view, motionEvent ->

            if (motionEvent.action == MotionEvent.ACTION_MOVE) {

                view.y = motionEvent.rawY - view.height
                view.x = motionEvent.rawX - view.width
            }

            true

        }

        findViewById<ImageView>(R.id.imageView3).setOnTouchListener(listener)
        findViewById<ImageView>(R.id.imageView4).setOnTouchListener(listener)
        findViewById<ImageView>(R.id.imageView6).setOnTouchListener(listener)
        findViewById<ImageView>(R.id.imageView7).setOnTouchListener(listener)
        findViewById<ImageView>(R.id.imageView8).setOnTouchListener(listener)


    }


   // val rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate)
    //    findViewById<ImageView>(R.id.imageView3).startAnimation(rotateAnimation)
    //    findViewById<ImageView>(R.id.imageView4).startAnimation(rotateAnimation)
     //   findViewById<ImageView>(R.id.imageView6).startAnimation(rotateAnimation)
    //    findViewById<ImageView>(R.id.imageView7).startAnimation(rotateAnimation)
     //   findViewById<ImageView>(R.id.imageView8).startAnimation(rotateAnimation)
    }
//}