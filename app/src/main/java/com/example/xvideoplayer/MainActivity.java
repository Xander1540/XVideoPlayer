package com.example.xvideoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView vView = findViewById(R.id.videoView);

        String vPath = "android.resource://"+getPackageName()+"/raw/xan";

        Uri videoURI = Uri.parse(vPath);


        vView.setVideoPath(vPath);
        vView.start();

        MediaController mediaController = new MediaController(this);
        vView.setMediaController(mediaController);
        mediaController.setAnchorView(vView);
    }
}