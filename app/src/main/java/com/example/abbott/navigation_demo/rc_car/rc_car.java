package com.example.abbott.navigation_demo.rc_car;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abbott.navigation_demo.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class rc_car extends Fragment {


    public rc_car() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rc_car, container, false);
    }

}
