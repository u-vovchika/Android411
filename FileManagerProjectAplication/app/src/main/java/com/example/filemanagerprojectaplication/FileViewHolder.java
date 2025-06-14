package com.example.filemanagerprojectaplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.tabs.TabLayout;

import java.text.BreakIterator;

public class FileViewHolder extends RecyclerView.ViewHolder {

    public TextView tvName, tvSize;
    public CardView container;
    public ImageView imgFile;


    public FileViewHolder(@NonNull View itemView) {
        super(itemView);

        tvName = itemView.findViewById(R.id.tv_file_name);
        tvSize = itemView.findViewById(R.id.tv_file_size);
        container = itemView.findViewById(R.id.container);
        imgFile = itemView.findViewById(R.id.img_file_type);

    }
}
