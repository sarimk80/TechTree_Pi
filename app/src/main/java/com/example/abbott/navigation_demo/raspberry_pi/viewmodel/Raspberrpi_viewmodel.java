package com.example.abbott.navigation_demo.raspberry_pi.viewmodel;

import com.example.abbott.navigation_demo.raspberry_pi.model.Raspberrpi_model;

public class Raspberrpi_viewmodel {

    private String Title;
    private String Desc;

    public Raspberrpi_viewmodel(Raspberrpi_model raspberrpi_model) {

        this.Title=raspberrpi_model.Title;
        this.Desc=raspberrpi_model.Desc;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
}
