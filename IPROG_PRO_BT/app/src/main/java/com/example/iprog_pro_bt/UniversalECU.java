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

public class UniversalECU extends AppCompatActivity {

    TextView textViewModelEcu;
    SharedPreferences sharedPreferences;
    private static final String SHARED_PREV_MODEL = "mypref";
    private static final String KEY_ECU = "ecu";
    private static final String KEY_SRS = "srs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_universal_ecu);
        // строка состояния убирается
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // возрат назад  ///////////////////////////////////////////////////////
        Button buttonBack = findViewById(R.id.button_back_univ);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                SharedPreferences.Editor editor = sharedPreferences.edit();
//                editor.clear(); // стираем данные textViewModel
//                editor.apply(); // записываем данные после очистки textViewModel
//                finish();// завершения процесса
                Intent intent = new Intent(UniversalECU.this, UniversalSet.class);
                startActivity(intent);
            }
        });
        /// /////////////////////////////////////////////////////////////////////
        textViewModelEcu = findViewById(R.id.textViewModelEcu);
        /////// Выводим модель ///////////////////////////////////////
        sharedPreferences = getSharedPreferences(SHARED_PREV_MODEL, MODE_PRIVATE);
        String name = sharedPreferences.getString(KEY_SRS, null);
        if(name != null){
            textViewModelEcu.setText(name);
        }
        /// Выбор подушек на рено ////////////////////////////////////////////////////
        /// ////  выбираем XC /////////////////////////////////////////////////////////
        TextView textRenaultXC = findViewById(R.id.textRenaultXC);
        textRenaultXC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_ECU, textRenaultXC.getText().toString());
                editor.apply();
                Intent intent = new Intent(UniversalECU.this, RenSrsSpc.class);
                startActivity(intent);
            }
        });
        /// ////  выбираем Megane 2 Scenic 2 /////////////////////////////////////////////////////////
        TextView textRenaultMeg2 = findViewById(R.id.textRenaultMeg2);
        textRenaultMeg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_ECU, textRenaultMeg2.getText().toString());
                editor.apply();
                Intent intent = new Intent(UniversalECU.this, RenSrsSpc.class);
                startActivity(intent);
            }
        });
        /// ////  выбираем Megane 3 Fluence 3 /////////////////////////////////////////////////////////
        TextView textRenaultMeg3 = findViewById(R.id.textRenaultMeg3);
        textRenaultMeg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_ECU, textRenaultMeg3.getText().toString());
                editor.apply();
                Intent intent = new Intent(UniversalECU.this, RenSrsSpc.class);
                startActivity(intent);
            }
        });
        /// ////  выбираем RH850 /////////////////////////////////////////////////////////
        TextView textRenaultRH850 = findViewById(R.id.textRenaultRH850);
        textRenaultRH850.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_ECU, textRenaultRH850.getText().toString());
                editor.apply();
                Intent intent = new Intent(UniversalECU.this, RenSrsSpc.class);
                startActivity(intent);
            }
        });
        /// ////  выбираем SPC /////////////////////////////////////////////////////////
        TextView textRenaultSPC = findViewById(R.id.textRenaultSPC);
        textRenaultSPC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_ECU, textRenaultSPC.getText().toString());
                editor.apply();
                Intent intent = new Intent(UniversalECU.this, RenSrsSpc.class);
                startActivity(intent);
            }
        });
        /// ////  выбираем TEMIC K-Line /////////////////////////////////////////////////////////
        TextView textRenaultTEMIC = findViewById(R.id.textRenaultTEMIC);
        textRenaultTEMIC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_ECU, textRenaultTEMIC.getText().toString());
                editor.apply();  //
                Intent intent = new Intent(UniversalECU.this, RenSrsSpc.class);
                startActivity(intent);
            }
        });

    }
}