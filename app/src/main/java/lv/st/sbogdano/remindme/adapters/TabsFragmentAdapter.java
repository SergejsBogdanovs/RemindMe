package lv.st.sbogdano.remindme.adapters;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.HashMap;
import java.util.Map;

import lv.st.sbogdano.remindme.R;
import lv.st.sbogdano.remindme.fragments.AbstractTabFragment;
import lv.st.sbogdano.remindme.fragments.BirthdaysFragment;
import lv.st.sbogdano.remindme.fragments.HistoryFragment;
import lv.st.sbogdano.remindme.fragments.IdeasFragment;
import lv.st.sbogdano.remindme.fragments.TodoFragment;


public class TabsFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer, AbstractTabFragment> mTabs;
    private Context mContext;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.mContext = context;
        initTabsMap();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return mTabs.get(position);
    }

    @Override
    public int getCount() {
        return mTabs.size();
    }

    private void initTabsMap() {
        mTabs = new HashMap<>();
        mTabs.put(0, HistoryFragment.getInstance(mContext));
        mTabs.put(1, IdeasFragment.getInstance(mContext));
        mTabs.put(2, TodoFragment.getInstance(mContext));
        mTabs.put(3, BirthdaysFragment.getInstance(mContext));
    }
}
