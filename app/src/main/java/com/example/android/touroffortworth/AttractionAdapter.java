package com.example.android.touroffortworth;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class AttractionAdapter extends ArrayAdapter<Attraction> {
    private int mColorResource;
    private int mImageResource;
    public AttractionAdapter(Activity context, ArrayList<Attraction> words, int colorResource, int imageResource) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResource = colorResource;
        mImageResource = imageResource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Find the List item xml layout
        LinearLayout textContainer = (LinearLayout) listItemView.findViewById(R.id.text_container);

        //get color data
        int color = ContextCompat.getColor(getContext(), mColorResource);

        //Programmatically set the background color of the list items
        textContainer.setBackgroundColor(color);

        // Get the {@link AndroidFlavor} object located at this position in the list
        Attraction currentAttraction = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID attraction_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.attraction_name);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokTextView.setText(currentAttraction.getLocationName());

        // Find the TextView in the list_item.xml layout with the ID attraction_image
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.attraction_address);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultTextView.setText(currentAttraction.getLocationAddress());

        // Find the ImageView in the list_item.xml layout with the ID picture
         ImageView pictureImageView = (ImageView) listItemView.findViewById(R.id.attraction_image);
         if(mImageResource == 0){
         pictureImageView.setVisibility(View.GONE);
         } else {
             // Get the image resource from the current Word object and set this image on the ImageView
             pictureImageView.setImageResource(mImageResource);
             pictureImageView.setVisibility(View.VISIBLE);
         }

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
