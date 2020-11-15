package com.example.a9_16;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btn1 = (Button)findViewById(R.id.button12);

        btn2 = (Button)findViewById(R.id.button23);
        btn2.setOnClickListener(this);

        btn3 = (Button)findViewById(R.id.button34);
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                btn3.setText("NoNameClass");
                btn3.setBackgroundColor(Color.BLUE);
            }
        });
    }
    @Override
    public void onClick(View v) {
        btn2.setText("Interface");
        btn2.setBackgroundColor(Color.GRAY);
    }

    public void myClicked(View view){
        btn1.setText("OnClick");
        btn1.setBackgroundColor(Color.RED);
    }
}
