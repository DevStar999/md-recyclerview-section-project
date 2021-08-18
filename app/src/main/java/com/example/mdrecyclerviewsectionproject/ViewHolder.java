package com.example.mdrecyclerviewsectionproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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

    public void setNameTextViewTextValue(String textValue) {
        nameTextView.setText(textValue);
    }

    public void setDescTextViewTextValue(String textValue) {
        descTextView.setText(textValue);
    }

    public void setRecyclerImageViewImageResource(int imageResource) {
        recyclerImageView.setImageResource(imageResource);
    }
}
