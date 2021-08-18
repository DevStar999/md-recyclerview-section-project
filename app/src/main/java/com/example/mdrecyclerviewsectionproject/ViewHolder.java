package com.example.mdrecyclerviewsectionproject;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class ViewHolder extends RecyclerView.ViewHolder {
    private ImageView recyclerImageView;
    private TextView nameTextView;
    private TextView descTextView;
    private LinearLayout linearLayout;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        recyclerImageView = itemView.findViewById(R.id.recycler_image_view);
        nameTextView = itemView.findViewById(R.id.name_text_view);
        descTextView = itemView.findViewById(R.id.desc_text_view);
        linearLayout = itemView.findViewById(R.id.recycler_item_layout);

    }

    public void setNameTextViewTextValue(String textValue) {
        nameTextView.setText(textValue);
    }

    public void setDescTextViewTextValue(String textValue) {
        descTextView.setText(textValue);
    }

    public void setRecyclerImageViewImageResource(Context context, int imageResource) {
        Glide.with(context).load(imageResource).into(recyclerImageView);
    }

    public void setOnClickListenerForLinearLayout(Context context, int position) {
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "User " + (position+1) +
                        " was selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
