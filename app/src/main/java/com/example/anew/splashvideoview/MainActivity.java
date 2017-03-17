package com.example.anew.splashvideoview;

import android.app.Activity;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {
    private MediaController media_control;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView video_view = (VideoView) findViewById(R.id.VideoView);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" +R.raw.splash);

        media_control = new MediaController(this);
        video_view.setMediaController(media_control);

        video_view.setVideoURI(uri);
        video_view.start();
    }
}