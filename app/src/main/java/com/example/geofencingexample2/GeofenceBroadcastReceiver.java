package com.example.geofencingexample2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.location.GeofencingEvent;

import java.util.List;

// class that receives and handles broadcast intent
// handle geofence transitions here
public class GeofenceBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "GeofenceReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        GeofencingEvent geofencingEvent = GeofencingEvent.fromIntent(intent);
        if (geofencingEvent.hasError()) {
            int errorCode = geofencingEvent.getErrorCode();
            String errorMessage =
                    GeofenceStatusCodes.getStatusCodeString(errorCode);
            Log.e(TAG, errorMessage);
        } else {
            Log.d(TAG, "Receiving broadcast..");
        // Get the transition type of the geofence transition alert.
        int geofenceTransition = geofencingEvent.getGeofenceTransition();
        Log.d("Transition type: ", String.valueOf(geofenceTransition));
        // A single event can trigger multiple geofences.
        // Get the geofences that were triggered.
        List<Geofence> triggeringGeofences =
                geofencingEvent.getTriggeringGeofences();
        // TODO React to the Geofence(s) transition(s).
            Log.d(TAG,triggeringGeofences.toString());

        }
    }
}
