package com.example.abbott.navigation_demo.project;


import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abbott.navigation_demo.R;
import com.example.abbott.navigation_demo.project.adapter.CustomAdpater;
import com.example.abbott.navigation_demo.project.viewmodel.ProjectViewModel;

import java.util.ArrayList;
import java.util.Observable;


/**
 * A simple {@link Fragment} subclass.
 */
public class projects extends Fragment {

    private RecyclerView recyclerView;
    private ProjectViewModel projectViewModel;
    private CustomAdpater customAdapter;



    public projects() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_projects, container, false);
        
        recyclerView = view.findViewById(R.id.recyclerView);

        projectViewModel = ViewModelProviders.of(getActivity()).get(ProjectViewModel.class);

        projectViewModel.getArrayListMutableLiveData().observe(this, new Observer<ArrayList<ProjectViewModel>>() {
            @Override
            public void onChanged(@Nullable ArrayList<ProjectViewModel> projectViewModelArrayList) {
                customAdapter = new CustomAdpater(projectViewModelArrayList,getContext());
                recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                recyclerView.setAdapter(customAdapter);
                recyclerView.hasFixedSize();
            }
        });
        return view;
    }

}
