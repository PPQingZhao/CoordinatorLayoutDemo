package com.pp.coordinatorlayout.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;


public class BasePagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> framentList;

    public BasePagerAdapter(FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        this.framentList = fragmentList;
    }

    @Override
    public int getCount() {
        return null == framentList? 0:framentList.size();
    }

    @Override
    public Fragment getItem(int position) {
        return null == framentList ? null : framentList.get(position);
    }
}
