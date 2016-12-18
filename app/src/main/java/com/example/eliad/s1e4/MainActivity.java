package com.example.eliad.s1e4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    final int num = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickUp(View view){
        ImageView image= (ImageView)findViewById(R.id.imageView);
        image.setY(image.getY() - num);
    }

    public void clickDown(View view){
        ImageView image= (ImageView)findViewById(R.id.imageView);
        image.setY(image.getY() + num);
    }

    public void clickLeft(View view){
        ImageView image= (ImageView)findViewById(R.id.imageView);
        image.setX(image.getX() - num);
    }

    public void clickRight(View view){
        ImageView image= (ImageView)findViewById(R.id.imageView);
        image.setX(image.getX() + num);
    }


}
