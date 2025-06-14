package com.example.filemanagerprojectaplication;

import android.content.Context;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;

import java.util.List;

public class FileAdapter extends RecyclerView.Adapter<FileViewHolder> {

    private Context context;
    private List<File> file;
    private OnFileSelectedListener listener;

    public FileAdapter(Context context, List<File> file, OnFileSelectedListener listener) {
        this.context = context;
        this.file = file;
        this.listener = listener;
    }

    @NonNull
    @Override
    public FileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FileViewHolder(LayoutInflater.from(context).inflate(R.layout.file_container, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FileViewHolder holder, int position) {
        holder.tvName.setText(file.get(position).getName());
        holder.tvName.setSelected(true);
        int items = 0;
        if (file.get(position).isDirectory()) {
            File[] files = file.get(position).listFiles();
            for (File singleFile : files) {
                if (!singleFile.isHidden()) {
                    items++;
                }
            }
            holder.tvSize.setText(items + " Files");
        } else {
            holder.tvSize.setText(Formatter.formatShortFileSize(context, file.get(position).length()));
        }

        if (file.get(position).getName().toLowerCase().endsWith(".jpeg")) {
            holder.imgFile.setImageResource(R.drawable.outline_broken_image_24);
        } else if (file.get(position).getName().toLowerCase().endsWith(".jpg")) {
            holder.imgFile.setImageResource(R.drawable.outline_broken_image_24);
        } else if (file.get(position).getName().toLowerCase().endsWith(".jpg")) {
            holder.imgFile.setImageResource(R.drawable.outline_broken_image_24);
        } else if (file.get(position).getName().toLowerCase().endsWith(".pdf")) {
            holder.imgFile.setImageResource(R.drawable.outline_picture_as_pdf_24);
        } else if (file.get(position).getName().toLowerCase().endsWith(".doc")) {
            holder.imgFile.setImageResource(R.drawable.outline_edit_document_24);
        } else if (file.get(position).getName().toLowerCase().endsWith(".mp3")) {
            holder.imgFile.setImageResource(R.drawable.outline_library_music_24);
        } else if (file.get(position).getName().toLowerCase().endsWith(".wav")) {
            holder.imgFile.setImageResource(R.drawable.outline_library_music_24);
        } else if (file.get(position).getName().toLowerCase().endsWith(".mp4")) {
            holder.imgFile.setImageResource(R.drawable.outline_video_settings_24);
        } else if (file.get(position).getName().toLowerCase().endsWith(".apk")) {
            holder.imgFile.setImageResource(R.drawable.outline_android_24);
        } else {
            holder.imgFile.setImageResource(R.drawable.outline_folder_24);
        }

        /// обычный клик мышкой
        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onFileClicked(file.get(position));
            }
        });

        /// длительный кли мышкой
        holder.container.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                listener.onFileLongClicked(file.get(position));
                return true;
            }
        });
    }


    @Override
    public int getItemCount() {
        return file.size();
    }
}
