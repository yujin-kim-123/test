package com.example.study;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity {
    Beeper DingDong;
    Beeper Ddock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DingDong = new Beeper(this, R.raw.dingdong);
        Ddock = new Beeper(this, R.raw.ddok);

        findViewById(R.id.btn1).setOnClickListener(mClickListener);
        findViewById(R.id.btn2).setOnClickListener(mClickListener);
        findViewById(R.id.btn3).setOnClickListener(mClickListener);
        findViewById(R.id.btn4).setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new Button.OnClickListener() {
        public void onClick(View v) {
            MediaPlayer player;
            switch (v.getId()) {
                case R.id.btn1:
                    player = MediaPlayer.create(MainActivity.this, R.raw.dingdong);
                    player.start();
                    break;

                case R.id.btn2:
                    player = MediaPlayer.create(MainActivity.this, R.raw.ddok);
                    player.start();
                    break;

                case R.id.btn3:
                    DingDong.play();
                    break;

                case R.id.btn4:
                    Ddock.play();
                    break;
            }
        }
    };
}

class Beeper {
    MediaPlayer player;
    Beeper (Context context, int id) {
        player = MediaPlayer.create(context, id);
    }

    void play() {
        player.seekTo(0);
        player.start();
    }
}
