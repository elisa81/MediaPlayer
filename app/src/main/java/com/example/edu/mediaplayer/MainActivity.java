package com.example.edu.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button play, pause, back, forward;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = (Button) findViewById(R.id.buttonPlay);
        pause = (Button) findViewById(R.id.buttonPause);
        back = (Button) findViewById(R.id.buttonBack);
        forward = (Button) findViewById(R.id.buttonForward);

        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        back.setOnClickListener(this);
        forward.setOnClickListener(this);

        mediaPlayer = MediaPlayer.create(this, R.raw.thunder_rain);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.buttonPlay:
                mediaPlayer.start();
                play.setEnabled(false);
                pause.setEnabled(true);
                break;

            case R.id.buttonPause:
                mediaPlayer.pause();
                pause.setEnabled(false);
                play.setEnabled(true);
                break;

            case R.id.buttonBack:
                mediaPlayer.stop();
                pause.setEnabled(false);
                play.setEnabled(true);
                break;

            case R.id.buttonForward:
                mediaPlayer.stop();
                pause.setEnabled(false);
                play.setEnabled(true);
                break;
        }
    }
}