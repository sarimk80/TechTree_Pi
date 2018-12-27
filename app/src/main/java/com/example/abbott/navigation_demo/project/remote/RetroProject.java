package com.example.abbott.navigation_demo.project.remote;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroProject {

    private static final String BASE_URL="https://script.googleusercontent.com";

    private static Retrofit getRetroInstance(){

        Gson gson=new GsonBuilder().setLenient().create();
        return new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create(gson)).build();
    }

    public static ApiCall getApiService(){
        return getRetroInstance().create(ApiCall.class);
    }
}

