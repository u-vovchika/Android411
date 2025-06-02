package com.example.fileapplication;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    TextView showPermissions;
    Button takePermission;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        showPermissions = findViewById(R.id.showPermissions);

        permissionShow();

        takePermission = findViewById(R.id.btnPermission);

        takePermission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // разрешение до Андроид 10 (API 29)
                if(Build.VERSION.SDK_INT <= Build.VERSION_CODES.Q){
                    if(ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) { // проверка, предоставлено определенное разрешение
                        ActivityCompat.requestPermissions(MainActivity3.this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, 100);
                    }
                }
                // Разрешение для Андроид 11 (API 30) и выше
                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                    if(!Environment.isExternalStorageManager()) {
                        try {
                            Intent intent = new Intent(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION);
                            intent.addCategory("android.intent.category.DEFAULT");
                            intent.setData(Uri.parse(String.format("package:%s",getApplicationContext().getPackageName())));
                            startActivityIfNeeded(intent, 101);
                        } catch (Exception e) {
                            Intent intent = new Intent();
                            intent.setAction(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION);
                            startActivityIfNeeded(intent, 101);
                        }
                    }
                }
            }
        });



    }

    public void permissionShow(){
        // разрешение до Андроид 10 (API 29)
        if(Build.VERSION.SDK_INT <= Build.VERSION_CODES.Q){
            if(ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) { // проверка, предоставлено определенное разрешение
                showPermissions.setText("Доступ закрыт к файлам закрыт\nразрешение Android 10 (API 28)\n\nНажмите кнопку\n >Запросить разрешение<");
            }
        }
        // Разрешение для Андроид 11 (API 30) и выше
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            if(!Environment.isExternalStorageManager()) {
                showPermissions.setText("Доступ закрыт к файлам закрыт\nразрешение Android 11 (API 30)\n\nНажмите кнопку\n >Запросить разрешение<");
            }
        }
    }
}