package com.pp.coordinatorlayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.pp.coordinatorlayout.adapter.BasePagerAdapter;
import com.pp.coordinatorlayout.ui.Fragment1;
import com.pp.coordinatorlayout.ui.Fragment2;
import com.pp.coordinatorlayout.ui.Fragment3;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager main_viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initData() {

    }

    private void initView() {
        main_viewpager = findViewById(R.id.main_viewpager);
        Fragment1 fragment1 = new Fragment1();
        Fragment2 fragment2 = new Fragment2();
        Fragment3 fragment3 = new Fragment3();

        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(fragment1);
        fragmentList.add(fragment2);
        fragmentList.add(fragment3);
        main_viewpager.setAdapter(new BasePagerAdapter(getSupportFragmentManager(), fragmentList));
    }
}
