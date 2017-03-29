package com.users;

/**
 * Created by MOHD IMTIAZ on 24-Mar-17.
 */

public class MyLatLng {
    double Latitude,Longitude;

    public MyLatLng() {
    }

    public MyLatLng(double latitude, double longitude) {
        Latitude = latitude;
        Longitude = longitude;
    }

    public double getLatitude() {
        return Latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public void setLongitude(double longitude) {
        Longitude = longitude;
    }
}
