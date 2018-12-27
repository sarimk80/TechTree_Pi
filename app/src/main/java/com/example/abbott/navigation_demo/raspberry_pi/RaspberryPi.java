package com.example.abbott.navigation_demo.raspberry_pi;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abbott.navigation_demo.R;
import com.example.abbott.navigation_demo.databinding.FragmentRaspberryPiBinding;
import com.example.abbott.navigation_demo.raspberry_pi.model.Raspberrpi_model;
import com.example.abbott.navigation_demo.raspberry_pi.presenter.Raspberrypi_Event;
import com.example.abbott.navigation_demo.raspberry_pi.viewmodel.Raspberrpi_viewmodel;


/**
 * A simple {@link Fragment} subclass.
 */
public class RaspberryPi extends Fragment {

    private FragmentRaspberryPiBinding raspberryPiBinding;
    private Raspberrpi_viewmodel raspberrpi_viewmodel;


    public RaspberryPi() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        raspberryPiBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_raspberry_pi, null, false);

        View view = raspberryPiBinding.getRoot();


        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        raspberryPiBinding.setEvent(new Raspberrypi_Event() {
            @Override
            public void Usb1_Event() {
                raspberrpi_viewmodel = new Raspberrpi_viewmodel(new Raspberrpi_model(getString(R.string.USB_Title), getString(R.string.USB_Dec)));
                raspberryPiBinding.setRaspberrypiViewmodel(raspberrpi_viewmodel);
            }

            @Override
            public void Usb2_Event() {
                raspberrpi_viewmodel = new Raspberrpi_viewmodel(new Raspberrpi_model(getString(R.string.USB_Title), getString(R.string.USB_Dec)));
                raspberryPiBinding.setRaspberrypiViewmodel(raspberrpi_viewmodel);
            }

            @Override
            public void Ethernet_Event() {
                raspberrpi_viewmodel = new Raspberrpi_viewmodel(new Raspberrpi_model(getString(R.string.Ethernet_Title), getString(R.string.Ethernet_Dec)));
                raspberryPiBinding.setRaspberrypiViewmodel(raspberrpi_viewmodel);
            }

            @Override
            public void Gpio_Event() {
                raspberrpi_viewmodel = new Raspberrpi_viewmodel(new Raspberrpi_model(getString(R.string.Gpio_Title), getString(R.string.Gpio_Dec)));
                raspberryPiBinding.setRaspberrypiViewmodel(raspberrpi_viewmodel);
            }

            @Override
            public void Chip_Event() {
                raspberrpi_viewmodel = new Raspberrpi_viewmodel(new Raspberrpi_model(getString(R.string.Processor_Title), getString(R.string.Processor_Dec)));
                raspberryPiBinding.setRaspberrypiViewmodel(raspberrpi_viewmodel);
            }

            @Override
            public void Wifi_Event() {
                raspberrpi_viewmodel = new Raspberrpi_viewmodel(new Raspberrpi_model(getString(R.string.USB_Title), getString(R.string.USB_Dec)));
                raspberryPiBinding.setRaspberrypiViewmodel(raspberrpi_viewmodel);
            }

            @Override
            public void Camera_Event() {
                raspberrpi_viewmodel = new Raspberrpi_viewmodel(new Raspberrpi_model(getString(R.string.Camera_Title), getString(R.string.Camera_Dec)));
                raspberryPiBinding.setRaspberrypiViewmodel(raspberrpi_viewmodel);
            }

            @Override
            public void Screen_Event() {
                raspberrpi_viewmodel = new Raspberrpi_viewmodel(new Raspberrpi_model(getString(R.string.Screen_Title), getString(R.string.Screen_Dec)));
                raspberryPiBinding.setRaspberrypiViewmodel(raspberrpi_viewmodel);
            }

            @Override
            public void Hdmi_Event() {
                raspberrpi_viewmodel = new Raspberrpi_viewmodel(new Raspberrpi_model(getString(R.string.HDMI_Title), getString(R.string.HDMI_Dec)));
                raspberryPiBinding.setRaspberrypiViewmodel(raspberrpi_viewmodel);
            }

            @Override
            public void Power_Event() {
                raspberrpi_viewmodel = new Raspberrpi_viewmodel(new Raspberrpi_model(getString(R.string.Usb_Title), getString(R.string.Usb_Dec)));
                raspberryPiBinding.setRaspberrypiViewmodel(raspberrpi_viewmodel);
            }

            @Override
            public void Jack_Event() {
                raspberrpi_viewmodel = new Raspberrpi_viewmodel(new Raspberrpi_model(getString(R.string.Audio_Title), getString(R.string.Audio_Dec)));
                raspberryPiBinding.setRaspberrypiViewmodel(raspberrpi_viewmodel);
            }
        });
    }
}
