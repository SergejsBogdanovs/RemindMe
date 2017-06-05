package lv.st.sbogdano.remindme.fragments;

import android.content.Context;
import android.support.v4.app.Fragment;

public class AbstractTabFragment extends Fragment{

    private Context mContext;
    private String mTitle;

    public void setContext(Context context) {
        mContext = context;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getTitle() {
        return mTitle;
    }
}
