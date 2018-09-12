package com.example.android.touroffortworth;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.touroffortworth.MuseumFragment;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    private String [] tabTitle = new String[] { "Museums", "Water Parks", "Attractions", "Restaurants" };

    @Override
    public Fragment getItem(int position) {
        return new MuseumFragment();
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return super.getItemPosition(object);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitle[position];
    }
}
