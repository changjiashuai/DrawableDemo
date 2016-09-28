package io.github.changjiashuai.drawabledemo

import android.graphics.drawable.ClipDrawable
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import java.util.*

class ClipActivity : AppCompatActivity() {

    companion object{
        val IS_CONTUNUE = 0x22
    }

    private var drawable:ClipDrawable? = null
    private var imageView:ImageView? = null
    private val timer = Timer()

    val handler = object : Handler() {
        override fun handleMessage(msg: Message?) {
            if (msg?.what == IS_CONTUNUE){
                drawable?.level = drawable?.level!! + 200
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clip)
        imageView = findViewById(R.id.image) as ImageView?
        drawable = imageView?.drawable as ClipDrawable?

        val timerTask = object : TimerTask() {
            override fun run() {
                val message = handler.obtainMessage()
                message.what = IS_CONTUNUE
                handler.sendMessage(message)
                if (drawable?.level!! >= 10000){
                    timer.cancel()
                }
            }
        }

        timer.schedule(timerTask, 0, 200)
    }
}
