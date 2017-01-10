package com.example.cse.tabbedswipe;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Switch;

/**
 * Created by CSE on 1/10/2017.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter{
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0:
                return new TabOne();
            case 1:
                return new TabTwo();
            case 2:
                return new TabThree();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}
