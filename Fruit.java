package com.example.study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnApple = (Button)findViewById(R.id.apple);
        btnApple.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                TextView textFruit = (TextView)findViewById(R.id.fruit);
                textFruit.setText("Apple");
            }
        });

        Button btnOrange = (Button)findViewById(R.id.orange);
        btnOrange.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                TextView textFruit = (TextView)findViewById(R.id.fruit);
                textFruit.setText("Orange");
            }
        });
    }
}