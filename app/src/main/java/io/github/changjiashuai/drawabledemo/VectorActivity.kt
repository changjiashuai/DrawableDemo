package io.github.changjiashuai.drawabledemo

import android.graphics.drawable.Animatable
import android.os.Bundle
import android.support.graphics.drawable.AnimatedVectorDrawableCompat
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class VectorActivity : AppCompatActivity() {

    private var imageView: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vector)
        imageView = findViewById(R.id.iv_animated_vector) as ImageView?
        val animtedVectorDrawableCompat = AnimatedVectorDrawableCompat.create(this, R.drawable.animated_vector)
        imageView?.setImageDrawable(animtedVectorDrawableCompat)
        (imageView?.drawable as Animatable).start()
    }
}
