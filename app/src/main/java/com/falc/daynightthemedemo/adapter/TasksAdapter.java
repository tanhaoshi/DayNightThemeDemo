package com.falc.daynightthemedemo.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.RecyclerView;

public class TasksAdapter extends RecyclerView.Adapter<TasksAdapter.TasksViewHolder> {

    private AsyncListDiffer<String> mDiffer;

    public TasksAdapter(){
        mDiffer = new AsyncListDiffer<String>(this,new DiffUtilImpl());
    }

    @NonNull
    @Override
    public TasksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull TasksViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    static class TasksViewHolder extends RecyclerView
            .ViewHolder{

        public TasksViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
