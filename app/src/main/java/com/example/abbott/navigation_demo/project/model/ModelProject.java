package com.example.abbott.navigation_demo.project.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelProject {

    @SerializedName("name")
    @Expose
    public String name;

    @SerializedName("description")
    @Expose
    public String Decs;

    @SerializedName("code")
    @Expose
    public String Code;

    @SerializedName("things")
    @Expose
    public String Things;

    @SerializedName("build")
    @Expose
    public String Build;

    @SerializedName("funtionality")
    @Expose
    public String Functionality;

    @SerializedName("image")
    @Expose
    public String Image;

    @SerializedName("youtube")
    @Expose
    public String youtube;

    @SerializedName("cardImage")
    @Expose
    public String CardImage;

    public ModelProject(String name, String decs, String code, String things, String build, String functionality, String image, String youtube, String cardImage) {
        this.name = name;
        this.Decs = decs;
        this.Code = code;
        this.Things = things;
        this.Build = build;
        this.Functionality = functionality;
        this.Image = image;
        this.youtube = youtube;
        this.CardImage = cardImage;
    }
}
