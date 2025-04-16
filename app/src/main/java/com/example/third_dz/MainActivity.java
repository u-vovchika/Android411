package com.example.third_dz;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    private int currentProgress = 0;
    private ProgressBar progressBar;

    private Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = findViewById(R.id.boy_image);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //((AnimationDrawable)image.getDrawable()).start();
                ((AnimationDrawable) image.getDrawable()).stop();
            }
        });


        ConstraintLayout constraintLayout = findViewById(R.id.main);
        RadioButton chooseColorRed = findViewById(R.id.radioButtonRed);
        RadioButton chooseColorYellow = findViewById(R.id.radioButtonYellow);
        RadioButton chooseColorGreen = findViewById(R.id.radioButtonGreen);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        chooseColorRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkedButtonIndex = radioGroup.getCheckedRadioButtonId();
                ImageView imageViewRed = findViewById(R.id.imageRed);
                ImageView imageViewYellow = findViewById(R.id.imageYellow);
                ImageView imageViewGreen = findViewById(R.id.imageGreen);
                if (checkedButtonIndex == R.id.radioButtonRed) {
                    imageViewRed.setImageResource(R.drawable.red_image);
                    imageViewYellow.setImageResource(R.drawable.white_image);
                    imageViewGreen.setImageResource(R.drawable.white_image);
                    ((AnimationDrawable) image.getDrawable()).stop();
                    constraintLayout.setBackgroundResource(R.color.red_r);
                    currentProgress = 0;
                    progressBar.setMax(currentProgress);
                    updateProgress();
                }
            }
        });

        chooseColorYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkedButtonIndex = radioGroup.getCheckedRadioButtonId();
                ImageView imageViewRed = findViewById(R.id.imageRed);
                ImageView imageViewYellow = findViewById(R.id.imageYellow);
                ImageView imageViewGreen = findViewById(R.id.imageGreen);
                if (checkedButtonIndex == R.id.radioButtonYellow) {
                    imageViewRed.setImageResource(R.drawable.white_image);
                    imageViewYellow.setImageResource(R.drawable.yellow_image);
                    imageViewGreen.setImageResource(R.drawable.white_image);
                    ((AnimationDrawable) image.getDrawable()).stop();
                    constraintLayout.setBackgroundResource(R.color.yelow_y);
                    currentProgress = 0;
                    progressBar.setMax(currentProgress);
                    updateProgress();
                }

            }
        });

        chooseColorGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkedButtonIndex = radioGroup.getCheckedRadioButtonId();
                ImageView imageViewRed = findViewById(R.id.imageRed);
                ImageView imageViewYellow = findViewById(R.id.imageYellow);
                ImageView imageViewGreen = findViewById(R.id.imageGreen);
                if (checkedButtonIndex == R.id.radioButtonGreen) {
                    imageViewRed.setImageResource(R.drawable.white_image);
                    imageViewYellow.setImageResource(R.drawable.white_image);
                    imageViewGreen.setImageResource(R.drawable.green_image);
                    ((AnimationDrawable) image.getDrawable()).start();
                    constraintLayout.setBackgroundResource(R.color.green_g);
                    currentProgress = 0;
                    progressBar.setMax(100);
                    updateProgress();
                }
            }
        });


        progressBar = findViewById(R.id.progressBarHorizontal);
//        Button startProgress = findViewById(R.id.startProgress);
//
//        //private Handler handler = new Handler();
//        startProgress.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ((AnimationDrawable) image.getDrawable()).start();
//                currentProgress = 0;
//                progressBar.setMax(100);
//                updateProgress();
//
//                // ((AnimationDrawable) image.getDrawable()).stop();
//
//
//            }
//        });

    }

    private void updateProgress() {
        currentProgress++;
        if (currentProgress < 100) {
            currentProgress++;
            progressBar.setProgress(currentProgress);

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    updateProgress();

                }
            }, 100);

        }
    }
}