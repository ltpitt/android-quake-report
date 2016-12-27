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
    private Double mMagnitude;

    // Name of the city hit by the quake (e.g. Tokyo, London, Los Angeles)
    private String mLocation;

    // Time of the earthquake in milliseconds
    private long mTimeInMilliseconds;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */
    public Earthquake(Double magnitude, String location, long timeInMilliseconds)
    {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    // Returns the magnitude
    public Double getMagnitude() {
        return mMagnitude;
    }

    // Returns the city name
    public String getLocation() {
        return mLocation;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
