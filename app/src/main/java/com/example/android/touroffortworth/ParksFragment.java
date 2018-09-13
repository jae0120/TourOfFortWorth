package com.example.android.touroffortworth;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);


        final ArrayList<Attraction> parks = new ArrayList<Attraction>();
        parks.add(new Attraction(getString(R.string.parks_one_name), getString(R.string.parks_one_addy)));
        parks.add(new Attraction(getString(R.string.parks_two_name), getString(R.string.parks_two_addy)));
        parks.add(new Attraction(getString(R.string.parks_three_name), getString(R.string.parks_three_addy)));
        parks.add(new Attraction(getString(R.string.parks_four_name), getString(R.string.parks_four_addy)));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), parks, R.color.museumCategory, 0);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        return rootView;
    }

}
