package com.talky.chattingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.talky.chattingapp.Adapter.LoginAdapter;
import com.talky.chattingapp.Fragments.LoginTabFragment;
import com.talky.chattingapp.Fragments.RegisterTabFragment;
import com.talky.chattingapp.R;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.rengwuxian.materialedittext.MaterialEditText;

public class LoginActivity extends AppCompatActivity {

    MaterialEditText email, password;
    Button btn_login;

    FirebaseAuth auth;
    TextView forgot_password;

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);

        tabLayout.addTab(tabLayout.newTab().setText("Login"));
        tabLayout.addTab(tabLayout.newTab().setText("Register"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);

        final LoginAdapter adapter = new LoginAdapter(getSupportFragmentManager(), this,tabLayout.getTabCount());


        LoginAdapter.addFragment(new LoginTabFragment(), "Login");
        LoginAdapter.addFragment(new RegisterTabFragment(), "Register");


        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setTranslationY(300);
        tabLayout.setAlpha(0);

        tabLayout.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}