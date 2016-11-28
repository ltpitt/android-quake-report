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
    private String mQuakeMagnitude;

    // Name of the city hit by the quake (e.g. Tokyo, London, Los Angeles)
    private String mCityName;

    // Date in which the quake happened
    private String mQuakeDate;

    /*
    * Create a new Earthquake.
    *
    * @param vMagnitude is the quake's magnitude (e.g. 7.2, 6.1)
    * @param vCity is the name of the city hit by the quake (Tokyo, London, Los Angeles)
    * @param vDate is the date in which the quake happened
    * */
    public Earthquake(String vMagnitude, String vCity, String vDate)
    {
        mQuakeMagnitude = vMagnitude;
        mCityName = vCity;
        mQuakeDate = vDate;
    }

    // Get the magnitude
    public String getQuakeMagnitude() {
        return mQuakeMagnitude;
    }

    // Get the city name
    public String getCityName() {
        return mCityName;
    }

    // Get the quake date
    public String getQuakeDate() {
        return mQuakeDate;
    }
}
