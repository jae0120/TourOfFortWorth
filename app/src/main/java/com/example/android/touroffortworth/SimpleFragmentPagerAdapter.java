package com.example.android.touroffortworth;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.touroffortworth.MuseumFragment;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;
    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new MuseumFragment();
            case 1: return new HistoricalFragment();
            case 2: return new RestaurantFragment();
            case 3: return new ParksFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return super.getItemPosition(object);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return mContext.getString(R.string.category_museums);
            case 1: return mContext.getString(R.string.category_historical);
            case 2: return mContext.getString(R.string.category_restaurant);
            case 3: return mContext.getString(R.string.category_parks);
            default: return null;
        }
    }
}
