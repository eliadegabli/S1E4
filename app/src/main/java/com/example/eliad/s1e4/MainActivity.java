package com.example.eliad.s1e4;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    final int num = 5;
    private ImageView image= null;
    private int deltaY=-5;
    private int deltaX=0;

    public void setDelta(int x,int y) {
        this.deltaY = y;
        this.deltaX=x;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image= (ImageView)findViewById(R.id.imageView);
        startTimer();
    }

    public void clickUp(View view){
       setDelta(0, -5);

    }

    public void clickDown(View view){
        setDelta(0,5);
    }

    public void clickLeft(View view){
        setDelta(-5, 0);
    }

    public void clickRight(View view){
        setDelta(5, 0);
    }


    protected void startTimer() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
// signal UI thread to move ball
                mHandler.obtainMessage(1).sendToTarget();
            }
        }, 500, 10);
    }
    public Handler mHandler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            image.setY(image.getY() + deltaY);
            image.setX(image.getX() + deltaX);
            return true;
        }
    });


}
