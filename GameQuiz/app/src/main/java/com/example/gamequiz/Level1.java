package com.example.gamequiz;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Gainmap;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Objects;
import java.util.Random;

public class Level1 extends AppCompatActivity {
    Dialog dialog;
    Dialog dialogEnd;

    public int numLeft;  // переменная для левой картинки + текст
    public int numRight;  // переменная для правой картинки + текст
    Array array = new Array();  // создаем пустой массив
    Random random = new Random(); //для генерация случайных чисел
    public int count = 0; //счетчик правильных ответов
    private MediaPlayer sound_no, sound_yes, sound_end, sound_info;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);

        // звуковые эфекты
        sound_no = MediaPlayer.create(this, R.raw.no);
        sound_yes = MediaPlayer.create(this, R.raw.yes3);
        sound_end = MediaPlayer.create(this, R.raw.game_over);
        sound_info = MediaPlayer.create(this, R.raw.info1);
        // установка номера уровня
        TextView textLevels = findViewById(R.id.textView);
        textLevels.setText(R.string.level_1);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final ImageView imgLeft = findViewById(R.id.imag_left);
        final ImageView imgRight = findViewById(R.id.imag_right);
        // скругление углов
        imgLeft.setClipToOutline(true);
        imgRight.setClipToOutline(true);

        final TextView textLeft = findViewById(R.id.text_left);
        final TextView textRight = findViewById(R.id.text_right);

        //вызов диалогового окна в начале игры
        dialog = new Dialog(this);  //создаем новое диалоговое окно
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE); //скрываем заголовок
        dialog.setContentView(R.layout.preview_dialog);
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); // прозрачный фон диалогового окна
        dialog.setCancelable(false); // окно нельзя закрыть кликом за пределами диалогового окна

        //кнопка назад
        TextView btnClose = dialog.findViewById(R.id.button_close);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level1.this, GameLevels.class);
                startActivity(intent);
                dialog.dismiss();  //закрытие диалогового окна
            }
        });

        // кнопка ПРОДОЛЖИТЬ
        Button btnContinue = dialog.findViewById(R.id.button_continue);
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();  //закрытие диалогового окна
            }
        });

        dialog.show(); //показать диалоговое окно

        // -------------------------------------------------------------------------
        // Вызов диалогового окна в конце игры
        dialogEnd = new Dialog(this);
        dialogEnd.requestWindowFeature(Window.FEATURE_NO_TITLE); //скрываем заголовок
        dialogEnd.setContentView(R.layout.dialog_end); //путь к диалоговому окну
        dialogEnd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); //фон прозрачный
        dialogEnd.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT); // диалоговое окно раширяется на величину экрана
        dialogEnd.setCancelable(false); //нельзя закрывать за пределами окна

        TextView btnClose2 = dialogEnd.findViewById(R.id.button_close);
        btnClose2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // вернемся назад к выбору уровня
                Intent intent = new Intent(Level1.this, GameLevels.class);
                startActivity(intent);
                dialogEnd.dismiss();
            }
        });
        // переход на следующий уровень
        Button button_continue2 = dialogEnd.findViewById(R.id.button_continue);
        button_continue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level1.this, Level2.class);
                startActivity(intent);
                dialogEnd.dismiss();
            }
        });

        // -------------------------------------------------------------------------

        // кнопка назад из окна с уровнем
        Button btnBack = findViewById(R.id.button_back_level1);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level1.this, GameLevels.class);
                startActivity(intent);
            }
        });


        final Animation animation = AnimationUtils.loadAnimation(Level1.this, R.anim.alpha);


        // генерировали значение для левой картики
        numLeft = random.nextInt(10);
        imgLeft.setImageResource(array.image1[numLeft]);
        textLeft.setText(array.text1[numLeft]); //достаем из массива текст

        // генерировали значение для правой картики
        numRight = random.nextInt(10);
        while (numLeft == numRight) {
            numRight = random.nextInt(10);
        }
        imgRight.setImageResource(array.image1[numRight]);
        textRight.setText(array.text1[numRight]); //достаем из массива текст

        // массив для прогресса игры
        final int[] progress = {R.id.point1, R.id.point2, R.id.point3, R.id.point4, R.id.point5,
                R.id.point6, R.id.point7, R.id.point8, R.id.point9, R.id.point10,
                R.id.point11, R.id.point12, R.id.point13, R.id.point14, R.id.point15,
                R.id.point16, R.id.point17, R.id.point18, R.id.point19, R.id.point20,
        };
/// /////////////////////////////////////////////////////////////////////////////////////
        // обрабатываем нажатие на левую картинку
        imgLeft.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // условие касания картинки
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    imgRight.setEnabled(false); // блокируем правую картинку
                    if (numLeft > numRight) {
                        imgLeft.setImageResource(R.drawable.img_true);
                        sound_yes.start();
                    } else {
                        imgLeft.setImageResource(R.drawable.img_false);
                        sound_no.start();
                    }
                } else if (event.getAction() == MotionEvent.ACTION_UP) {  // если отпустили палец
                    if (numLeft > numRight) {
                        if (count < 20) {
                            count++;
                        }

                        // програмно закрашиваем прогесс серым цветом
                        for (int j : progress) {
                            TextView tv = findViewById(j);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        // определяем правильные ответы и закрашиваем зеленым
                        for (int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }


                    } else { // если левая картинка меньше
                        if (count > 0) {
                            if (count == 1) {
                                count = 0;
                            } else {
                                count -= 2;
                            }
                            // закрашиваем прогесс серым цветом
                            for (int i = 0; i < progress.length - 1; i++) {
                                TextView tv = findViewById(progress[i]);
                                tv.setBackgroundResource(R.drawable.style_points);
                            }
                            // определяем правильные ответы и закрашиваем зеленым цветом
                            for (int i = 0; i < count; i++) {
                                TextView tv = findViewById(progress[i]);
                                tv.setBackgroundResource(R.drawable.style_points_green);
                            }
                        }
                    }
                    if (count == 20) {   // выход из уровня
//                        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
//                        final int level = save.getInt("Level", 1);
//                        if (level <= 1) {
//                            SharedPreferences.Editor editor = save.edit(); // Даем отредактировать элемент
//                            editor.putInt("Level", 2);  // ложим значение уровня 2
//                            editor.apply(); // сохранить данные
//                        }
                        sound_end.start();
                        sound_info.start();
                        dialogEnd.show();  //  показать завершающее диалоговое окно
                    } else {
                        numLeft = random.nextInt(10);
                        imgLeft.setImageResource(array.image1[numLeft]); //достаем из массива картьинку
                        imgLeft.startAnimation(animation); //запускаем анимацию для левой картики
                        textLeft.setText(array.text1[numLeft]); // достаем из массива текст

                        numRight = random.nextInt(10);
                        while (numLeft == numRight) {
                            numRight = random.nextInt(10);
                        }
                        imgRight.setImageResource(array.image1[numRight]); //достаем из массива картьинку
                        imgRight.startAnimation(animation); //запускаем анимацию для левой картики
                        textRight.setText(array.text1[numRight]); // достаем из массива текст
                        imgRight.setEnabled(true); //включаем обратно правую картику
                    }

                }

                return true;
            }
        });
///////////////////////////////////////////////////////////////////////////////////////////
        // обрабатываем нажатие на правую картинку
        imgRight.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // условие касания картинки
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    imgLeft.setEnabled(false); // блокируем левую картинку
                    if (numLeft < numRight) {
                        imgRight.setImageResource(R.drawable.img_true);
                        sound_yes.start();
                    } else {
                        imgRight.setImageResource(R.drawable.img_false);
                        sound_no.start();
                    }
                } else if (event.getAction() == MotionEvent.ACTION_UP) {  // если отпустили палец
                    if (numLeft < numRight) {
                        if (count < 20) {
                            count++;
                        }

                        // програмно закрашиваем прогесс серым цветом
                        for (int j : progress) {
                            TextView tv = findViewById(j);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        // определяем правильные ответы и закрашиваем зеленым
                        for (int i = 0; i < count; i++) {
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }


                    } else { // если левая картинка меньше
                        if (count > 0) {
                            if (count == 1) {
                                count = 0;
                            } else {
                                count -= 2;
                            }
                            // закрашиваем прогесс серым цветом
                            for (int i = 0; i < progress.length - 1; i++) {
                                TextView tv = findViewById(progress[i]);
                                tv.setBackgroundResource(R.drawable.style_points);
                            }
                            // определяем правильные ответы и закрашиваем зеленым цветом
                            for (int i = 0; i < count; i++) {
                                TextView tv = findViewById(progress[i]);
                                tv.setBackgroundResource(R.drawable.style_points_green);
                            }
                        }
                    }
                    if (count == 20) {   // выход из уровня
//                        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
//                        final int level = save.getInt("Level", 1);
//                        if (level <= 1) {
//                            SharedPreferences.Editor editor = save.edit(); // Даем отредактировать элемент
//                            editor.putInt("Level", 2);  // ложим значение уровня 2
//                            editor.apply(); // сохранить данные
//                        }
                        sound_end.start();
                        sound_info.start();
                        dialogEnd.show();   //  показать завершающее диалоговое окно
                    } else {
                        numLeft = random.nextInt(10);
                        imgLeft.setImageResource(array.image1[numLeft]); //достаем из массива картьинку
                        imgLeft.startAnimation(animation); //запускаем анимацию для левой картики
                        textLeft.setText(array.text1[numLeft]); // достаем из массива текст

                        numRight = random.nextInt(10);
                        while (numLeft == numRight) {
                            numRight = random.nextInt(10);
                        }
                        imgRight.setImageResource(array.image1[numRight]); //достаем из массива картьинку
                        imgRight.startAnimation(animation); //запускаем анимацию для левой картики
                        textRight.setText(array.text1[numRight]); // достаем из массива текст
                        imgLeft.setEnabled(true); //включаем обратно правую картику
                    }

                }

                return true;
            }
        });
    }
}