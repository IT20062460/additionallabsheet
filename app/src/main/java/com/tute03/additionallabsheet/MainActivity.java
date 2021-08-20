package com.tute03.additionallabsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer player = MediaPlayer.create(this, Settings.System.DEFAULT_NOTIFICATION_URI);
        player.setLooping(true);
        player.start();
        Button btnstart = (Button) findViewById(R.id.btnStart);
        btnstart.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startService(new Intent(MainActivity.this,MyServices.class));
            }
        });

        Button btnstop = (Button)findViewById(R.id.btnStop);
        btnstop.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                stopService(new Intent(MainActivity.this, MyServices.class));
            }
        });


    }



}