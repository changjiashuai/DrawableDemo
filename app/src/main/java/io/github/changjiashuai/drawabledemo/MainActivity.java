package io.github.changjiashuai.drawabledemo;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.iv_test);
        Drawable unselected = new ColorDrawable(Color.RED);
        Drawable selected = new ColorDrawable(Color.GREEN);
        imageView.setBackground(new RevealDrawable(unselected, selected, RevealDrawable.HORIZONTAL));
    }

    public void clickClipDrawable(View view){
        Intent intent = new Intent(this, ClipActivity.class);
        startActivity(intent);
    }

    public void clickTransitionDrawable(View view){
        Intent intent = new Intent(this, TransitionActivity.class);
        startActivity(intent);
    }

    public void clickShapeDrawable(View view){
        Intent intent = new Intent(this, ShapeActivity.class);
        startActivity(intent);
    }

    public void clickVectorDrawable(View view){
        Intent intent = new Intent(this, VectorActivity.class);
        startActivity(intent);
    }
}
