package com.example.abbott.navigation_demo.project_card.fragment_card;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.abbott.navigation_demo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Project_detail_card extends Fragment {


    public Project_detail_card() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.fragment_project_detail_card, container, false);
    }

}
