package com.example.fileapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private final static String FILE_NAME = "content.txt";
    Button save_text, open_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        save_text = findViewById(R.id.save_text);
        open_text = findViewById(R.id.open_text);

        save_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FileOutputStream fos = null;

                EditText textBox = findViewById(R.id.editor);
                String text = textBox.getText().toString(); // Из вводимового текстового поля editor в переменную text
                try {
                    fos = openFileOutput(FILE_NAME, MODE_PRIVATE);  // MODE_APPEND - можем дописать к существующим данным значения
                    fos.write(text.getBytes());
                    Toast.makeText(MainActivity.this, "Файл сохранен", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                } finally {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        open_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FileInputStream fis = null;
                TextView textView = findViewById(R.id.text);

                try {
                    fis = openFileInput(FILE_NAME); // поток для чтения данных из файла
                    byte[] bytes = new byte[fis.available()]; // создаем новый массив байт и available - доступный какой-то элемент
                    fis.read(bytes); // считываем данные из файла
                    String text = new String(bytes); //данные из массива байт передаем в строковые сообщения
                    textView.setText(text); // и устанавливаем в поле TextView
                } catch (IOException e) {
                    Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                } finally {
                    try {
                        if (fis != null) {
                            fis.close();
                        }
                    } catch (IOException e) {
                        Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            }

        });


    }
}