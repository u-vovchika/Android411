package com.example.iprog_pro_bt;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.annotation.Annotation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ///  проявление картинки //////////////
        ImageView main_background = findViewById(R.id.main_background);
        Animation out = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_alpha);
        main_background.startAnimation(out);

        // строка состояния убирается
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        Button buttonStart = findViewById(R.id.buttonStart);
//        buttonStart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, MainMenu.class);
//                startActivity(intent);
//            }
//        });

        // Задержка перед переходом на основную активность
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, MainMenu.class);
                startActivity(intent);
                finish(); // Закрываем SplashActivity
            }
        }, 5000); // Задержка в 3 секунды


    }
}