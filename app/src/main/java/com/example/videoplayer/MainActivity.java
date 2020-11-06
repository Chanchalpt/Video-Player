package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    //variable declarations
    VideoView videoView;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referring XML layout using Java objects
        videoView = (VideoView) findViewById(R.id.videoView);

        //creating media controller object for getting controls like play, seek, forward, rewind etc while playing video.
        mediaController = new MediaController(this);

        //setting path of video
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.amazon);

        //Set the view that acts as the anchor for the control view
        mediaController.setAnchorView(videoView);

        //setting media controller to the video view
        videoView.setMediaController(mediaController);

        //Starting video
        videoView.start();
    }
}
