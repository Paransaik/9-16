package com.example.a9_16;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity5 extends AppCompatActivity implements View.OnClickListener {
    ImageView imgV1;
    ImageView imgV2;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        imgV1 = (ImageView) findViewById(R.id.imageView1);

        imgV2 = (ImageView) findViewById(R.id.imageView2);
        imgV2.setOnClickListener(this);


        View vw = (ImageView) findViewById(R.id.imageView3);//new View(this);
        vw.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:{
                        Toast.makeText(MainActivity5.this, "TouchEventRecieved", Toast.LENGTH_LONG).show();
                        return false;
                    }
                    default: return false;
                }
            }
        });
    }
    public void myClicked(View view){
        Toast.makeText(this, "Onclick", LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Interface", LENGTH_LONG).show();
    }
}