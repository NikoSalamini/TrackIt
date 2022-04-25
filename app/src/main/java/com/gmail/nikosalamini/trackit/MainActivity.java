package com.gmail.nikosalamini.trackit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button track_button;
    private boolean is_scanning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        is_scanning = false;

        track_button = findViewById( R.id.trackButton );
        track_button.setOnClickListener( this );
    }

    @Override
    public void onClick(View view) {
        if ( view == track_button ) {
            if ( is_scanning ) {
                stopService(new Intent( this, TrackingService.class ) );
                is_scanning = false;
                track_button.setText("Start Tracking");
            }
            else {
                startService(new Intent( this, TrackingService.class ) );
                is_scanning = true;
                track_button.setText("Stop Tracking");
            }
        }
    }
}