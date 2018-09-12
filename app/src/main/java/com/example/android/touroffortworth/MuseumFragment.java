package com.example.android.touroffortworth;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_museum, container, false);


        final ArrayList<Attraction> museums = new ArrayList<Attraction>();
        museums.add(new Attraction("Kimbell Art Museum", "3333 Camp Bowie Blvd"));
        museums.add(new Attraction("Fort Worth Museum of Science and History", "1600 Gendy Street"));
        museums.add(new Attraction("Amon Carter Museum of American Art", "3501 Camp Bowie Blvd"));
        museums.add(new Attraction("American Airlines CR Smith Museum", "4601 Highway 360"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), museums);

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
