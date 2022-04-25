package com.gmail.nikosalamini.trackit;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class TrackingService extends Service {
    private MediaPlayer player;

    public int onStartCommand(Intent intent, int flags, int startId) {
        System.out.println("running");
        return START_NOT_STICKY;
    }

    public void onDestroy() {
        System.out.println("not running");
        super.onDestroy();
    }

    @Override

    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}