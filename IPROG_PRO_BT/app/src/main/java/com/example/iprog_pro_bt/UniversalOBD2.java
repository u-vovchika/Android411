package com.example.iprog_pro_bt;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class UniversalOBD2 extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    private static final String SHARED_PREV_MODEL = "mypref";
    private static final String KEY_OBD = "OBDII";

    TextView textViewModelEcu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_universal_obd2);


        // строка состояния убирается
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // возрат назад  ///////////////////////////////////////////////////////
        Button buttonBack = findViewById(R.id.button_back_univ);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear(); // стираем данные textViewModel
                editor.apply(); // записываем данные после очистки textViewModel
                finish();// завершения процесса
                Intent intent = new Intent(UniversalOBD2.this, MainMenu.class);
                startActivity(intent);
            }
        });
        /// /////////////////////////////////////////////////////////////////////
        textViewModelEcu = findViewById(R.id.textViewModelEcu);
        /////// Выводим модель ///////////////////////////////////////
        sharedPreferences = getSharedPreferences(SHARED_PREV_MODEL, MODE_PRIVATE);
        String name = sharedPreferences.getString(KEY_OBD, null);
        if(name != null){
            textViewModelEcu.setText(name);
        }

    }
}