package com.example.abbott.navigation_demo.shield;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abbott.navigation_demo.R;
import com.example.abbott.navigation_demo.databinding.FragmentShieldBinding;
import com.example.abbott.navigation_demo.raspberry_pi.model.Raspberrpi_model;
import com.example.abbott.navigation_demo.raspberry_pi.viewmodel.Raspberrpi_viewmodel;
import com.example.abbott.navigation_demo.shield.presenter.Shield_Event;


/**
 * A simple {@link Fragment} subclass.
 */
public class Shield extends Fragment {

    private FragmentShieldBinding shieldBinding;
    private Raspberrpi_viewmodel raspberrpi_viewmodel;


    public Shield() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        shieldBinding= DataBindingUtil.inflate(inflater,R.layout.fragment_shield,null,false);

        View view=shieldBinding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        shieldBinding.setEvent(new Shield_Event() {
            @Override
            public void Sonar() {
                raspberrpi_viewmodel=new Raspberrpi_viewmodel(new Raspberrpi_model(getString(R.string.Sonar_Title),getString(R.string.Sonar_Desc)));
                shieldBinding.setShieldView(raspberrpi_viewmodel);
            }

            @Override
            public void dc_motor() {
                raspberrpi_viewmodel=new Raspberrpi_viewmodel(new Raspberrpi_model(getString(R.string.DCmotor_Title),getString(R.string.DCmotor_Desc)));
                shieldBinding.setShieldView(raspberrpi_viewmodel);

            }

            @Override
            public void Servo_motor() {
                raspberrpi_viewmodel=new Raspberrpi_viewmodel(new Raspberrpi_model(getString(R.string.Servo_motor_Title),getString(R.string.Servo_Motor_Desc)));
                shieldBinding.setShieldView(raspberrpi_viewmodel);

            }

            @Override
            public void Raspi() {
                raspberrpi_viewmodel=new Raspberrpi_viewmodel(new Raspberrpi_model(getString(R.string.Raspi_Title),getString(R.string.Raspi_Desc)));
                shieldBinding.setShieldView(raspberrpi_viewmodel);

            }
        });
    }
}
