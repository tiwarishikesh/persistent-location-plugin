package com.kanris.persistentlocation.plugin;

import static com.getcapacitor.Logger.info;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.location.LocationRequest;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.getcapacitor.Logger;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationSettingsRequest;
import com.kanris.persistentlocation.plugin.R;


public class RunningService extends Service {
    //region data
    private final long UPDATE_INTERVAL_IN_MILLISECONDS = 3000;
    private FusedLocationProviderClient mFusedLocationClient;
    private LocationRequest locationRequest;
    private LocationSettingsRequest locationSettingsRequest;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (intent != null && intent.getAction() != null) {
            switch (intent.getAction()) {
                case "START":
                    start();
                    break;
                case "STOP":
                    stopSelf();
                    break;
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    private void start() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "running_channel")
                .setContentTitle("Location Tracking Activated")
                .setContentText("Maverik HCM is tracking your location");
        Notification notification = builder.build();
        startForeground(1, notification);
    }
}