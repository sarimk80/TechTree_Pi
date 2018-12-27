package com.example.abbott.navigation_demo.project_card.viewmodel;

import com.example.abbott.navigation_demo.project_card.model.ProjectModel;

public class ProjectCardViewModel {

    private String Name;

    private String Decs;

    private String Code;

    private String Things;

    private String Build;

    private String Functionality;

    private String Image;

    private String youtube;

    private String CardImage;

    public ProjectCardViewModel(ProjectModel projectModel) {

        this.Name=projectModel.Name;
        this.Decs=projectModel.Decs;
        this.Code=projectModel.Code;
        this.Things=projectModel.Things;
        this.Build=projectModel.Build;
        this.Functionality=projectModel.Functionality;
        this.Image=projectModel.Image;
        this.youtube=projectModel.youtube;
        this.CardImage=projectModel.CardImage;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }

    public String getCardImage() {
        return CardImage;
    }

    public void setCardImage(String cardImage) {
        CardImage = cardImage;
    }
}
