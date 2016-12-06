/**
 * Created by Davide Nastri on 11/28/16.
 */
package com.example.android.quakereport;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/*
* {@link EarthquakeAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link Earthquake} objects.
* */
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private static final String LOG_TAG=EarthquakeAdapter.class.getSimpleName();

    /**
     * This is a custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data used
     * to populate the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param earthquakes A List of AndroidFlavor objects to display in a list
     */
    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for three TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, earthquakes);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView in the earthquake_list_iteme_list_item.xml layout with the ID quake_magnitude
        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.quake_magnitude);
        // Get the magnitude from the current Earthquake object and
        // set this text on the magnitudeTextView
        magnitudeTextView.setText(currentEarthquake.getQuakeMagnitude());

        // Find the TextView in the earthquake_list_iteme_list_item.xml layout with the ID city_name
        TextView cityTextView = (TextView) listItemView.findViewById(R.id.city_name);
        // Get the version number from the current Earthquake object and
        // set this text on the number TextView
        cityTextView.setText(currentEarthquake.getCityName());

        // Find the TextView in the earthquake_list_item.xmlst_item.xml layout with the ID quake_date
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.quake_date);
        // Get the version number from the current Earthquake object and
        // set this text on the number TextView
        dateTextView.setText(currentEarthquake.getQuakeDate());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }



}
