package com.example.liz.chargertesting.screen;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.liz.chargertesting.R;

public class FragmentResult extends Fragment {

    public FragmentResult(){

    }

    public static FragmentResult getInstance(){
        FragmentResult fragment = new FragmentResult();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result,container,false);
        return view;
    }
}
