package com.example.abbott.navigation_demo.project_card;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.abbott.navigation_demo.R;
import com.example.abbott.navigation_demo.project_card.fragment_card.Project_detail_card;
import com.example.abbott.navigation_demo.project_card.fragment_youtube.Fragment_Youtube;
import com.example.abbott.navigation_demo.project_card.model.ProjectModel;
import com.example.abbott.navigation_demo.project_card.tab_adapter.TabAdapter;
import com.example.abbott.navigation_demo.project_card.viewmodel.ProjectCardViewModel;

import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class Project_cards extends Fragment {

    public TabAdapter adapter;
    public TabLayout tabLayout;
    public ViewPager viewPager;



    public Project_cards() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        String name = getArguments().getString("Name");




        View view = inflater.inflate(R.layout.fragment_pro__detail, container, false);

        viewPager = view.findViewById(R.id.viewPager);
        tabLayout = view.findViewById(R.id.tabLayout);

        adapter = new TabAdapter(getFragmentManager());
        adapter.addFragment(new Project_detail_card(), "Content");
        adapter.addFragment(new Fragment_Youtube(), "Tutorial");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);




    }
}
