package com.example.android.quakereport;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/*
 * {@link earthquakeAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Earthquake} objects.
 * */
public class earthquakeAdapter extends ArrayAdapter<earthquake> {


    /*
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     */
    public earthquakeAdapter(Context context, List<earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }
        earthquake currentEarthquake = getItem(position);

        TextView mag= (TextView) listItemView.findViewById(R.id.magnitude);
            mag.setText(currentEarthquake.getMagnitude());
        TextView loc= (TextView) listItemView.findViewById(R.id.location);
            loc.setText(currentEarthquake.getLocation());

        Date dateObject = new Date(currentEarthquake.getDate());

        SimpleDateFormat dateFormatter = new SimpleDateFormat("MMM DD, yyyy");
        TextView date= (TextView) listItemView.findViewById(R.id.date);
            String formattedDate = formatDate(dateObject);
            date.setText(formattedDate);

        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
            String formattedTime = formatTime(dateObject);
            timeView.setText(formattedTime);


        return listItemView;
    }
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
}


