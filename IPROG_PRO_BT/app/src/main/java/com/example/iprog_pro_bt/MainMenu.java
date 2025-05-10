package com.example.iprog_pro_bt;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {

    TextView textAcura, textAudi, textBmw,
            textCadillac, textChevrolet, textChina,
            textFiat, textFord, textHonda,
            textJaguar,textKiaHyundai,textLada,
            textLandRover,textMazda,textMercedes,
            textMitsubishi,textNissan,textPsa,
            textRenault,textSubaru,textSuzuki,
            textToyota,textUaz,textVag,
            textVolvo;
    SharedPreferences sharedPreferences;
    private static final String SHARED_PREV_MODEL = "mypref";
    private static final String KEY_MODEL = "model";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        // строка состояния убирается
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // кнопка НАЗАД ///////////////////////////////////////////////////////
        Button buttonBack = findViewById(R.id.button_back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, MainActivity.class);
                startActivity(intent);
            }
        });
        //////////////////////////////////////////////////////////////////////
        textAcura = findViewById(R.id.textAcura);
        textAudi = findViewById(R.id.textAudi);
        textBmw = findViewById(R.id.textBmw);
        textCadillac = findViewById(R.id.textCadillac);
        textChevrolet = findViewById(R.id.textChevrolet);
        textChina = findViewById(R.id.textChina);
        textFiat = findViewById(R.id.textFiat);
        textFord = findViewById(R.id.textFord);
        textHonda = findViewById(R.id.textHonda);
        textJaguar = findViewById(R.id.textJaguar);
        textKiaHyundai = findViewById(R.id.textKiaHyundai);
        textLada = findViewById(R.id.textLada);
        textLandRover = findViewById(R.id.textLandRover);
        textMazda = findViewById(R.id.textMazda);
        textMercedes = findViewById(R.id.textMercedes);
        textMitsubishi = findViewById(R.id.textMitsubishi);
        textNissan = findViewById(R.id.textNissan);
        textPsa = findViewById(R.id.textPsa);
        textRenault = findViewById(R.id.textRenault);
        textSubaru = findViewById(R.id.textSubaru);
        textSuzuki = findViewById(R.id.textSuzuki);
        textToyota = findViewById(R.id.textToyota);
        textUaz = findViewById(R.id.textUaz);
        textVag = findViewById(R.id.textVag);
        textVolvo = findViewById(R.id.textVolvo);


        //////////////////////////////////////////////////////////////////////
        sharedPreferences = getSharedPreferences(SHARED_PREV_MODEL, MODE_PRIVATE);
        String name = sharedPreferences.getString(KEY_MODEL, null);
        if (name != null) {
            Intent intent = new Intent(MainMenu.this, UniversalSet.class);
            startActivity(intent);
        }


        textAcura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textAcura.getText().toString());
                editor.apply();
                finish();// завершения процесса
                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model Acura success", Toast.LENGTH_SHORT).show();
            }
        });

        textAudi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textAudi.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model AUDI success", Toast.LENGTH_SHORT).show();
            }
        });

        textBmw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textBmw.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model BMW success", Toast.LENGTH_SHORT).show();
            }
        });

        textCadillac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textCadillac.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model Cadillac success", Toast.LENGTH_SHORT).show();
            }
        });

        textChevrolet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textChevrolet.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model Chevrolet success", Toast.LENGTH_SHORT).show();
            }
        });

        textChina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textChina.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model CHINA success", Toast.LENGTH_SHORT).show();
            }
        });

        textFiat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textFiat.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model Fiat success", Toast.LENGTH_SHORT).show();
            }
        });

        textFord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textFord.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model Ford success", Toast.LENGTH_SHORT).show();
            }
        });

        textLada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textLada.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model Lada success", Toast.LENGTH_SHORT).show();
            }
        });

        textJaguar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textJaguar.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model Jaguar success", Toast.LENGTH_SHORT).show();
            }
        });

        textKiaHyundai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textKiaHyundai.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model Kia-Hyundai success", Toast.LENGTH_SHORT).show();
            }
        });

        textHonda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textHonda.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model Honda success", Toast.LENGTH_SHORT).show();
            }
        });

        textLandRover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textLandRover.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model Land Rover success", Toast.LENGTH_SHORT).show();
            }
        });

        textMazda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textMazda.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model Mazda success", Toast.LENGTH_SHORT).show();
            }
        });

        textMercedes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textMercedes.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model Mercedes success", Toast.LENGTH_SHORT).show();
            }
        });

        textMitsubishi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textMitsubishi.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model Mitsubishi success", Toast.LENGTH_SHORT).show();
            }
        });

        textNissan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textNissan.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model Nissan success", Toast.LENGTH_SHORT).show();
            }
        });

        textPsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textPsa.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model PSA success", Toast.LENGTH_SHORT).show();
            }
        });

        textRenault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textRenault.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model Renault success", Toast.LENGTH_SHORT).show();
            }
        });

        textSubaru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textSubaru.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model Subaru success", Toast.LENGTH_SHORT).show();
            }
        });

        textSuzuki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textSuzuki.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model Suzuki success", Toast.LENGTH_SHORT).show();
            }
        });

        textToyota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textToyota.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model Toyota success", Toast.LENGTH_SHORT).show();
            }
        });

        textUaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textUaz.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model UAZ success", Toast.LENGTH_SHORT).show();
            }
        });

        textVag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textVag.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model VAG success", Toast.LENGTH_SHORT).show();
            }
        });

        textVolvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_MODEL, textVolvo.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainMenu.this, UniversalSet.class);
                startActivity(intent);
                Toast.makeText(MainMenu.this, "Model Volvo success", Toast.LENGTH_SHORT).show();
            }
        });
    }
}