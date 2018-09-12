package com.example.android.touroffortworth;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {
    public AttractionAdapter(Activity context, ArrayList<Attraction> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragment_museum, parent, false);
        }

        // Find the List item xml layout
        LinearLayout textContainer = (LinearLayout) listItemView.findViewById(R.id.text_container);

        // Get the {@link AndroidFlavor} object located at this position in the list
        Attraction currentAttraction = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_word
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_word);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokTextView.setText(currentAttraction.getLocationName());

        // Find the TextView in the list_item.xml layout with the ID english_word
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.english_word);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultTextView.setText(currentAttraction.getLocationAddress());

        // Find the ImageView in the list_item.xml layout with the ID picture
        /**       ImageView pictureImageView = (ImageView) listItemView.findViewById(R.id.picture);
         if(!currentWord.hasImage()){
         pictureImageView.setVisibility(View.GONE);
         } else {
         // Get the image resource from the current Word object and set this image on the ImageView
         pictureImageView.setImageResource(currentWord.getImageResource());
         pictureImageView.setVisibility(View.VISIBLE);
         } **/
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
