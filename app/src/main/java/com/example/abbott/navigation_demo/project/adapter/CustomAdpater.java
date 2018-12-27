package com.example.abbott.navigation_demo.project.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.abbott.navigation_demo.R;
import com.example.abbott.navigation_demo.databinding.ProjectBinding;
import com.example.abbott.navigation_demo.project.presenter.CardEvent;
import com.example.abbott.navigation_demo.project.viewmodel.ProjectViewModel;
import java.util.ArrayList;

import androidx.navigation.Navigation;


public class CustomAdpater extends RecyclerView.Adapter<CustomAdpater.CustomView> {

    private ArrayList<ProjectViewModel> projectViewModelArrayList;
    private Context context;

    private LayoutInflater layoutInflater;

    public CustomAdpater(ArrayList<ProjectViewModel> projectViewModelArrayList, Context context) {
        this.projectViewModelArrayList = projectViewModelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomView onCreateViewHolder(@NonNull final ViewGroup viewGroup, int i) {

        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
        }

        final ProjectBinding projectBinding = DataBindingUtil.inflate(layoutInflater, R.layout.card_view, viewGroup, false);

        projectBinding.setEvent(new CardEvent() {
            @Override
            public void OnClick() {
                final Bundle bundle=new Bundle();
                bundle.putString("Name",projectBinding.getViewProject().getName());
                bundle.putString("Des",projectBinding.getViewProject().getDecs());
                bundle.putString("Things",projectBinding.getViewProject().getThings());
                bundle.putString("Build",projectBinding.getViewProject().getBuild());
                bundle.putString("Fun",projectBinding.getViewProject().getFunctionality());
                bundle.putString("Code",projectBinding.getViewProject().getCode());
                Navigation.findNavController(viewGroup).navigate(R.id.action_projects_to_pro_Detail,bundle);
            }
        });

        return new CustomView(projectBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomView customView, int i) {
        ProjectViewModel projectViewModel = projectViewModelArrayList.get(i);

        customView.bind(projectViewModel);
    }

    @Override
    public int getItemCount() {
        return projectViewModelArrayList.size();
    }

    class CustomView extends RecyclerView.ViewHolder {

        private ProjectBinding projectBinding;

        public CustomView(ProjectBinding projectBinding) {
            super(projectBinding.getRoot());
            this.projectBinding = projectBinding;
        }

        public void bind(ProjectViewModel projectViewModel1) {

            this.projectBinding.setViewProject(projectViewModel1);
            projectBinding.executePendingBindings();
        }

        public ProjectBinding getProjectBinding() {
            return projectBinding;
        }
    }
}
