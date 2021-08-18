package com.example.mdrecyclerviewsectionproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<User> users;
    private Context context;

    public RecyclerAdapter(List<User> users, Context context) {
        this.users = users;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        User sampleUser = users.get(position);
        holder.setNameTextViewTextValue(sampleUser.getUsername());
        holder.setDescTextViewTextValue(sampleUser.getUserDescription());
        holder.setRecyclerImageViewImageResource(context, sampleUser.getUserImage());
        holder.setOnClickListenerForLinearLayout(context, position);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
