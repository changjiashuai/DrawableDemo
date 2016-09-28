package io.github.changjiashuai.drawabledemo

import android.graphics.Canvas
import android.graphics.ColorFilter
import android.graphics.drawable.Drawable

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 16/9/27 16:22.
 */
class TDrawable: Drawable() {
    override fun draw(canvas: Canvas?) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setAlpha(alpha: Int) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getOpacity(): Int {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

open class User private constructor(name:String){
    init {

    }
    internal constructor(name:String, age:Int) : this(name)
    protected constructor(name: String, age: Int, email: String) : this(name,age)
}

class Student(name: String):User(name, age = 1, email = ""){

}

class S: User(name = "", age = 0) {

}

class T{
    init {
        var user = User("", 10)
    }

    constructor(name: String)

    override fun toString(): String {
        return super.toString()
    }
}

object Res{
    val name = "Name"
}