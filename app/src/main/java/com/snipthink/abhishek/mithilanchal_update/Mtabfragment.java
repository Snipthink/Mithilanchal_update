package com.snipthink.abhishek.mithilanchal_update;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import layout.EventTab;
import layout.HistoryMainTab;
import layout.PopularTab;


/**
 * Created by snipthink on 24/8/17.
 */

public class Mtabfragment extends Fragment {

    TabLayout tabLayout;

    ViewPager viewPager;

    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view= inflater.inflate (R.layout.main_tab_layout,container,false);
        viewPager= view.findViewById(R.id.viewpager);

        viewPager.setAdapter (new sliderAdapter(getChildFragmentManager()));


        tabLayout= view.findViewById(R.id.sliding_tabs);
        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
            }
        });



        return  view;
    }

    private class sliderAdapter extends FragmentPagerAdapter {
       // final String tabs[] = {"Hello", "Bhai", "Chai"};

        public sliderAdapter(FragmentManager ChildFragment) {
            super(ChildFragment);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {


                case 0:
                    HistoryMainTab r = new HistoryMainTab();
                    return r;

                case 1:
                    EventTab e = new EventTab();
                    return e;

                case 2:
                    PopularTab p = new PopularTab();
                    return p;


                 default:
                     return null;
            }
        }

        @Override
        public int getCount() {
            return 3;


        }


        @Override
        public CharSequence getPageTitle(int position)
        {
            switch (position)
            {
                case 0: return "HISTORY";
                case 1: return  "EVENTS";
                case 2: return  "POPULAR";


            }
            return null;
        }
    }


}

