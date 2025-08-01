package com.example.filemanagerprojectaplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import androidx.core.content.FileProvider;

import java.io.File;

public class FileOpener {
    public static void openFile(Context context, File file){
        File selectedFile = file;
        Uri uri = FileProvider.getUriForFile(context, context.getApplicationContext().
                getPackageName() + ".provider", file);

        Intent intent = new Intent(Intent.ACTION_VIEW);
        if(uri.toString().contains(".doc")){
            intent.setDataAndType(uri, "application/msword");
        } else if(uri.toString().contains(".pdf")){
            intent.setDataAndType(uri, "application/pdf");
        } else if(uri.toString().contains(".mp3") || uri.toString().contains(".wav")){
            intent.setDataAndType(uri, "audio/x-wav");
        } else if(uri.toString().contains(".jpeg") || uri.toString().contains(".jpg")  || uri.toString().contains(".png")){
            intent.setDataAndType(uri, "image/jpeg");
        } else if(uri.toString().contains(".mp4")){
            intent.setDataAndType(uri, "video/*");
        } else {
            intent.setDataAndType(uri, "*/*");
        }

        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        context.startActivity(intent);

    }
}
