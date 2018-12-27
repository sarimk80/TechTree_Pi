package com.example.abbott.navigation_demo.home_fragment;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.abbott.navigation_demo.R;
import com.example.abbott.navigation_demo.databinding.FragmentHomeBinding;
import com.example.abbott.navigation_demo.home_fragment.presenter.Presenter;

import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    private FragmentHomeBinding homeBinding;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        homeBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, null, false);

        View view=homeBinding.getRoot();


        return view;
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        homeBinding.setEvent(new Presenter() {
            @Override
            public void RaspberryPi_Event() {
                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_raspberryPi);
            }

            @Override
            public void Shield_Event() {
                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_shield);

            }
        });


    }
}
