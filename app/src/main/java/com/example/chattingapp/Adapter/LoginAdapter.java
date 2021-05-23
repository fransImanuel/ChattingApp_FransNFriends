package com.example.chattingapp.Adapter;

import android.content.Context;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chattingapp.Fragments.LoginTabFragment;
import com.example.chattingapp.Fragments.RegisterTabFragment;

import java.util.ArrayList;

public class LoginAdapter extends FragmentPagerAdapter {
    private Context context;
    int totalTabs;
    private static ArrayList<Fragment> fragments;
    private static ArrayList<String> titles;


    public LoginAdapter(FragmentManager fm, Context context,int totalTabs){
        super(fm);
        this.context = context;
        this.totalTabs = totalTabs;
        this.fragments = new ArrayList<>();
        this.titles = new ArrayList<>();
    }

    public static void addFragment(Fragment fragment, String title){
        fragments.add(fragment);
        titles.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
    
    @Override
    public int getCount() {
         return totalTabs;
    }

    public Fragment getItem(int position){
        switch (position){
            case 0:
                LoginTabFragment loginTabFragment = new LoginTabFragment();
                return loginTabFragment;
            case 1:
                RegisterTabFragment registerTabFragment = new RegisterTabFragment();
                return registerTabFragment;
            default:
                return null;
        }
    }
}
