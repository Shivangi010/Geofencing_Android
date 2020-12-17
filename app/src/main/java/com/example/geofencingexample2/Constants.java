package com.example.geofencingexample2;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

public class Constants {
    private Constants() {
    }

    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS =
            1 * 60 * 60 * 1000;
    public static final int LOITERING_DELAY = 10000;
    public static final float GEOFENCE_RADIUS_IN_METERS = 100;
    public static final String GEOFENCE_ID = "CN";
    public static final int FINE_LOCATION_ACCESS_REQUEST_CODE = 10001;
    public static final int BACKGROUND_LOCATION_ACCESS_REQUEST_CODE = 10002;

    public static final HashMap<String, LatLng> TO_LANDMARKS = new HashMap<String, LatLng>();
    static
    {
        // CN Tower
        TO_LANDMARKS.put("CNTower", new LatLng(43.642567, -79.387054));
        TO_LANDMARKS.put("ScotiaBankArena", new LatLng(43.639330776, 43.639330776 -79.37416517));


    }

}
