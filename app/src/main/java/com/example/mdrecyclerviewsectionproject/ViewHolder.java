package com.example.mdrecyclerviewsectionproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ViewHolder extends RecyclerView.ViewHolder {
    private ImageView recyclerImageView;
    private TextView nameTextView;
    private TextView descTextView;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        recyclerImageView = itemView.findViewById(R.id.recycler_image_view);
        nameTextView = itemView.findViewById(R.id.name_text_view);
        descTextView = itemView.findViewById(R.id.desc_text_view);
    }
}
