package com.example.abbott.navigation_demo.project.remote;

import com.example.abbott.navigation_demo.project.model.ModelProject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ProjectList {

    @SerializedName("user")
    @Expose
    private ArrayList<ModelProject> modelProjectArrayList = new ArrayList<>();

    public ArrayList<ModelProject> getModelProjectArrayList() {
        return modelProjectArrayList;
    }
    public void setModelProjectArrayList(ArrayList<ModelProject> modelProjectArrayList){
        this.modelProjectArrayList=modelProjectArrayList;
    }
}
