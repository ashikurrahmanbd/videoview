package com.example.videoview;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = (VideoView) findViewById(R.id.videoViewId);

        Uri uri = Uri.parse("android.resource://"+ getPackageName()+"/"+R.raw.video);

        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(MainActivity.this);

        videoView.setMediaController(mediaController);

        videoView.start();

    }
}
