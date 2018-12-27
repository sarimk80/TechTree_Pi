package com.example.abbott.navigation_demo.project.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.databinding.ObservableInt;
import android.view.View;
import android.widget.ImageView;

import com.example.abbott.navigation_demo.R;
import com.example.abbott.navigation_demo.project.model.ModelProject;
import com.example.abbott.navigation_demo.project.remote.ProjectRepo;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ProjectViewModel extends ViewModel {

    public String name;

    public String Decs;

    public String Code;

    public String Things;

    public String Build;

    public String Functionality;

    public String Image;

    public String youtube;

    public String CardImage;


    private ArrayList<ProjectViewModel> arrayList;
    private ProjectRepo projectRepo;
    private MutableLiveData<ArrayList<ProjectViewModel>> arrayListMutableLiveData;


    public ProjectViewModel() {
        projectRepo = new ProjectRepo();
        arrayListMutableLiveData = projectRepo.getArrayListMutableLiveData();


    }

    public ProjectViewModel(ModelProject modelProject) {
        this.name = modelProject.name;
        this.Decs = modelProject.Decs;
        this.Build = modelProject.Build;
        this.CardImage = modelProject.CardImage;
        this.Code = modelProject.Code;
        this.Functionality = modelProject.Functionality;
        this.Image = modelProject.Image;
        this.youtube = modelProject.youtube;
        this.CardImage = modelProject.CardImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecs() {
        return Decs;
    }

    public void setDecs(String decs) {
        Decs = decs;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getThings() {
        return Things;
    }

    public void setThings(String things) {
        Things = things;
    }

    public String getBuild() {
        return Build;
    }

    public void setBuild(String build) {
        Build = build;
    }

    public String getFunctionality() {
        return Functionality;
    }

    public void setFunctionality(String functionality) {
        Functionality = functionality;
    }

    public String getImageCard() {
        return Image;
    }

    @BindingAdapter({"bind:ImageCard"})
    public static void LoadImage(ImageView imageView,String ImageCard) {
        Picasso.with(imageView.getContext()).load(ImageCard).placeholder(R.drawable.ic_launcher_background).into(imageView);
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }

    public String getImageUrl() {
        return CardImage;
    }

    @BindingAdapter({"bind:ImageUrl"})
    public static void loadImage(ImageView imageView, String ImageUrl) {
        Picasso.with(imageView.getContext()).load(ImageUrl).placeholder(R.drawable.ic_launcher_background).into(imageView);
    }


    public MutableLiveData<ArrayList<ProjectViewModel>> getArrayListMutableLiveData() {

        return arrayListMutableLiveData;
    }
}
