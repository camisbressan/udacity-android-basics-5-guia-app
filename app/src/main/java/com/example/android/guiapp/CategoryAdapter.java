package com.example.android.guiapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    /** Contexto do aplicativo */
    private Context mContext;

    /**
     * Crie um novo {@link CategoryAdapter} objeto.
     *
     * @param context é o contitulo do aplicativo
     * @param fm é o fragment manager que manterá cada estado do fragmento no adapter ao longo de swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HoteisFragment();
        } else if (position == 1) {
            return new ParquesFragment();
        } else if (position == 2) {
            return new PadariasFragment();
        } else {
            return new BaresFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_hoteis);
        } else if (position == 1) {
            return mContext.getString(R.string.category_parques);
        } else if (position == 2) {
            return mContext.getString(R.string.category_padarias);
        } else {
            return mContext.getString(R.string.category_bares);
        }
    }
}