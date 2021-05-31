package com.talky.chattingapp.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.talky.chattingapp.LoginActivity;
import com.talky.chattingapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class OnBoardingFragment3 extends Fragment {

    FloatingActionButton fab;
    TextView skip;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_3, container, false);

        fab = root.findViewById(R.id.fab);
        skip = root.findViewById(R.id.skip);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LoginActivity.class);

                startActivity(intent);
            }
        });

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LoginActivity.class);

                startActivity(intent);
            }
        });

        return root;
    }
}
