package com.example.study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity {
    int count;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.shortmsg).setOnClickListener(mClickListener);
        findViewById(R.id.longmsg).setOnClickListener(mClickListener);
        findViewById(R.id.count1).setOnClickListener(mClickListener);
        findViewById(R.id.count2).setOnClickListener(mClickListener);
        findViewById(R.id.customview).setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new Button.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.shortmsg:
                    Toast.makeText(MainActivity.this, "잠시 나타나는 메세지", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.longmsg:
                    Toast.makeText(MainActivity.this, "조금 길게 나타나는 메세지", Toast.LENGTH_LONG).show();
                    break;

                case R.id.count1:
                    str = "현재 카운트 = " + count++;
                    Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();

                    break;

                case R.id.count2:
                    str = "현재 카운트 = " + count++;
                    Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
                    break;

                case R.id.customview:
                    LinearLayout linear = (LinearLayout)View.inflate(MainActivity.this, R.layout.activity_main, null);
                    Toast t2 = new Toast(MainActivity.this);
                    t2.setView(linear);
                    t2.show();
                    break;
            }
        }
    };
}
