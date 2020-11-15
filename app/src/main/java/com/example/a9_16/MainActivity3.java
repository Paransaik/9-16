package com.example.a9_16;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btn = (Button)findViewById(R.id.button23);
        btn.setOnClickListener(this);

        tv1 = (TextView)findViewById(R.id.textView1);
        tv2 = (TextView)findViewById(R.id.textView2);
    }

    @Override
    public void onClick(View v) {
        tv1.setText("반갑습니다.");
        tv2.setText("Button");
    }
}