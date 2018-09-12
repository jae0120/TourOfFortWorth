package com.example.android.touroffortworth;

public class Attraction {
    private String mLocationName;
    private String mLocationAddress;

    // define the object
    public Attraction(String locationName, String locationAddress){
        mLocationName = locationName;
        mLocationAddress = locationAddress;
    }

    public String getLocationName(){
        return mLocationName;
    }

    public String getLocationAddress() {
        return mLocationAddress;
    }
}
