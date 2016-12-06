/**
 * Created by Davide Nastri on 11/28/16.
 */
package com.example.android.quakereport;

/**
 * {@link Earthquake} represents a single quake.
 * Each object has 3 properties: magnitude, city and date.
 */
public class Earthquake {

    // Earthquake's magnitude (e.g. 7.2, 6.1)
    private String mMagnitude;

    // Name of the city hit by the quake (e.g. Tokyo, London, Los Angeles)
    private String mLocation;

    // Date in which the quake happened
    private String mDate;

    /*
    * Create a new Earthquake.
    *
    * @param vMagnitude is the quake's magnitude (e.g. 7.2, 6.1)
    * @param vCity is the name of the city hit by the quake (Tokyo, London, Los Angeles)
    * @param vDate is the date in which the quake happened
    * */
    public Earthquake(String magnitude, String location, String date)
    {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    // Get the magnitude
    public String getQuakeMagnitude() {
        return mMagnitude;
    }

    // Get the city name
    public String getCityName() {
        return mLocation;
    }

    // Get the quake date
    public String getQuakeDate() {
        return mDate;
    }
}
