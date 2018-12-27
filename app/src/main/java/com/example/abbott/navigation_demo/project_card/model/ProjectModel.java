package com.example.abbott.navigation_demo.project_card.model;

public class ProjectModel {

    public String Name;

    public String Decs;

    public String Code;

    public String Things;

    public String Build;

    public String Functionality;

    public String Image;

    public String youtube;

    public String CardImage;

    public ProjectModel(String name, String decs, String code, String things, String build, String functionality, String image, String youtube, String cardImage) {
        Name = name;
        Decs = decs;
        Code = code;
        Things = things;
        Build = build;
        Functionality = functionality;
        Image = image;
        this.youtube = youtube;
        CardImage = cardImage;
    }
}
