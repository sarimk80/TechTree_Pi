package com.example.abbott.navigation_demo.project.remote;

import android.arch.lifecycle.MutableLiveData;


import com.example.abbott.navigation_demo.project.model.ModelProject;
import com.example.abbott.navigation_demo.project.viewmodel.ProjectViewModel;

import java.util.ArrayList;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProjectRepo {


    public MutableLiveData<ArrayList<ProjectViewModel>> arrayListMutableLiveData = new MutableLiveData<>();
    private ArrayList<ProjectViewModel> albumViewModelArrayList;
    private ArrayList<ModelProject> albumModels;


    public ProjectRepo() {

    }

    public MutableLiveData<ArrayList<ProjectViewModel>> getArrayListMutableLiveData() {
        ApiCall apiService = RetroProject.getApiService();
        Call<ProjectList> albumListCall = apiService.getProjectList();

        albumViewModelArrayList = new ArrayList<>();

        albumListCall.enqueue(new Callback<ProjectList>() {
            @Override
            public void onResponse(Call<ProjectList> call, Response<ProjectList> response) {
                albumModels = response.body().getModelProjectArrayList();
                ModelProject albumModel;
                ProjectViewModel albumViewModel;

                for (int i = 0; i < albumModels.size(); i++) {
                    albumModel = new ModelProject(albumModels.get(i).name, albumModels.get(i).Decs, albumModels.get(i).Code, albumModels.get(i).Things, albumModels.get(i).Build, albumModels.get(i).Functionality, albumModels.get(i).Image, albumModels.get(i).youtube, albumModels.get(i).CardImage);

                    albumViewModel = new ProjectViewModel(albumModel);
                    albumViewModelArrayList.add(albumViewModel);
                }

                arrayListMutableLiveData.setValue(albumViewModelArrayList);
            }

            @Override
            public void onFailure(Call<ProjectList> call, Throwable t) {


            }
        });

        return arrayListMutableLiveData;
    }
}
