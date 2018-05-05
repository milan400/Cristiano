package com.example.kiran.cr7;

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
import android.widget.LinearLayout;

/**
 * Created by kiran on 1/18/2017.
 */
public class TabFragment extends Fragment {

    public static TabLayout tabLayout;
    public static ViewPager viewPager;
    public static int int_items = 2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //Inflate tab_layout and setup Views
        View x = inflater.inflate(R.layout.tab_layout,null);
        tabLayout = (TabLayout) x.findViewById(R.id.tabs);
        viewPager = (ViewPager) x.findViewById(R.id.viewpager);

        //set an adapter for the view pager
        viewPager.setAdapter(new MyAdapter(getChildFragmentManager()));

        /**
         * Now,this is a workaround
         * The setupWithViewPager dosen.t works without the runnable.
         * Maybe a Support Library Bug.
         */
        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
            }
        });
        return x;
    }

    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        //return  fragment with respect to position

        @Override
        public Fragment getItem(int position) {

            switch (position){
                case 0 : return new GalleryFragment();
                case 1 :return new VideoFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return int_items;
        }

        /**
         * This method returns the title of the tab according to the position
         */

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0:
                    return "Gallery";
                case 1:
                    return "Video";
            }
            return null;
        }
    }
}
