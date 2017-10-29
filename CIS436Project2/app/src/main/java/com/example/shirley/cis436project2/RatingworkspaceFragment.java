package com.example.shirley.cis436project2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;


/**
 * Created by shirley on 7/5/17.
 */

public class RatingworkspaceFragment extends Fragment{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.magerating, container, false);

        return view;
    }

    //construtctr
    public RatingworkspaceFragment() {}

}