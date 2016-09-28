package io.github.changjiashuai.drawabledemo

import android.graphics.drawable.TransitionDrawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class TransitionActivity : AppCompatActivity() {

    private var imageView: ImageView? = null
    private var transitionDrawable: TransitionDrawable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition)
        imageView = findViewById(R.id.image) as ImageView?
        transitionDrawable = imageView?.background as TransitionDrawable?
        transitionDrawable?.startTransition(400)
    }
}
