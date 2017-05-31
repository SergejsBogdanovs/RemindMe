package lv.st.sbogdano.remindme.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import lv.st.sbogdano.remindme.fragments.ExampleFragment;


public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] mTabs;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        mTabs = new String[]{
                "Tab 1",
                "Напоминание",
                "Tab 2"
        };
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ExampleFragment.getInstance();
            case 1:
                return ExampleFragment.getInstance();
            case 2:
                return ExampleFragment.getInstance();
        }

        return null;
    }

    @Override
    public int getCount() {
        return mTabs.length;
    }
}
