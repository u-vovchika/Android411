package com.example.gamequiz;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.Objects;
import java.util.Random;

public class Level3 extends AppCompatActivity {
    Dialog dialog;
    Dialog dialogEnd;
    public int numLeft;  // переменная для левой картинки + текст
    public int numRight;  // переменная для правой картинки + текст
    Array array = new Array();  // создаем пустой массив
    Random random = new Random(); //для генерация случайных чисел
    public int count = 0; //счетчик правильных ответов


    @SuppressLint({"ClickableViewAccessibility", "ResourceAsColor"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);

        // установка номера уровня
        TextView textLevels = findViewById(R.id.textView);
        textLevels.setText(R.string.level_3);

        //поменяли цвет надписей
        textLevels.setTextColor(R.color.black_middle);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final ImageView imgLeft = findViewById(R.id.imag_left);
        final ImageView imgRight = findViewById(R.id.imag_right);
        // скругление углов
        imgLeft.setClipToOutline(true);
        imgRight.setClipToOutline(true);

        final TextView textLeft = findViewById(R.id.text_left);
        textLeft.setTextColor(R.color.black_middle);
        final TextView textRight = findViewById(R.id.text_right);
        textRight.setTextColor(R.color.black_middle);

        // установили новый фоновый рисунок
        ConstraintLayout background = findViewById(R.id.main);
        background.setBackgroundResource(R.drawable.level_3);


        //вызов диалогового окна в начале игры
        dialog = new Dialog(this);  //создаем новое диалоговое окно
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE); //скрываем заголовок
        dialog.setContentView(R.layout.preview_dialog);
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); // прозрачный фон диалогового окна
        dialog.setCancelable(false); // окно нельзя закрыть кликом за пределами диалогового окна

        // устанавливаем картинку диалогового окна ввиде коментария
        ImageView previewImg = dialog.findViewById(R.id.preview_img);
        previewImg.setImageResource(R.drawable.preview_img_3);

        // установка фона диалогового окна
        LinearLayout dialogFon = dialog.findViewById(R.id.dialog_fon);
        dialogFon.setBackgroundResource(R.drawable.preview_background_3);







        // устанавливаем опсание задания
        TextView textDescription = dialog.findViewById(R.id.text_description);
        textDescription.setText(R.string.level_three);

        // устанавливаем описание задания
        TextView textDexcription = dialog.findViewById(R.id.text_description);
        textDexcription.setText(R.string.level_three);

        //кнопка назад
        TextView btnClose = dialog.findViewById(R.id.button_close);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, GameLevels.class);
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

//        ImageView preview_Img = findViewById(R.id.preview_img);
//        preview_Img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
////                final int level = save.getInt("Level", 3);
////                if(level <= 3){
//                    SharedPreferences.Editor editor = save.edit(); // Даем отредактировать элемент
//                    editor.putInt("Level", 4);  // ложим значение уровня 2
//                    editor.apply(); // сохранить данные
// //               }
////                Intent intent = new Intent(Level3.this, Level4.class);
////                startActivity(intent);
////                dialogEnd.dismiss();
//            }
//        });



        // -------------------------------------------------------------------------
        // Вызов диалогового окна в конце игры
        dialogEnd = new Dialog(this);
        dialogEnd.requestWindowFeature(Window.FEATURE_NO_TITLE); //скрываем заголовок
        dialogEnd.setContentView(R.layout.dialog_end); //путь к диалоговому окну
        dialogEnd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); //фон прозрачный
        dialogEnd.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT); // диалоговое окно раширяется на величину экрана
        dialogEnd.setCancelable(false); //нельзя закрывать за пределами окна

        // интересный факт
        TextView textDescriptionEnd = dialogEnd.findViewById(R.id.text_description_end);
        textDescriptionEnd.setText(R.string.level_three_end);

        // установка фона диалогового окна в конце
        LinearLayout dialogFonEnd = dialogEnd.findViewById(R.id.dialog_fon);
        dialogFonEnd.setBackgroundResource(R.drawable.preview_background_3);

        TextView btnClose2 = dialogEnd.findViewById(R.id.button_close);
        btnClose2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // вернемся назад к выбору уровня
                Intent intent = new Intent(Level3.this, GameLevels.class);
                startActivity(intent);
                dialogEnd.dismiss();
            }
        });
        // переход на следующий уровень
        Button button_continue2 = dialogEnd.findViewById(R.id.button_continue);
        button_continue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, Level4.class);
                startActivity(intent);
                dialogEnd.dismiss();
            }
        });


        // -------------------------------------------------------------------------

        // кнопка назад из окна с уровнем
        Button btnBack = findViewById(R.id.button_back_level1);

        btnBack.setBackgroundResource(R.drawable.button_stroke_black_opacity_press_white);
        btnBack.setTextColor(R.color.black_middle);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level3.this, GameLevels.class);
                startActivity(intent);
            }
        });

        final Animation animation = AnimationUtils.loadAnimation(Level3.this, R.anim.alpha);

        // генерировали значение для левой картики
        numLeft = random.nextInt(21);
        imgLeft.setImageResource(array.image3[numLeft]);
        textLeft.setText(array.text3[numLeft]); //достаем из массива текст

        // генерировали значение для правой картики
        numRight = random.nextInt(21);
        while (numLeft == numRight) {
            numRight = random.nextInt(21);
        }
        imgRight.setImageResource(array.image3[numRight]);
        textRight.setText(array.text3[numRight]); //достаем из массива текст

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
                    } else {
                        imgLeft.setImageResource(R.drawable.img_false);
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
                    if (count == 20) { //выход из уровня  // 20
//                        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
//                        final int level = save.getInt("Level", 3);
//                        if(level <= 3){
//                            SharedPreferences.Editor editor = save.edit(); // Даем отредактировать элемент
//                            editor.putInt("Level", 4);  // ложим значение уровня 2
//                            editor.apply(); // сохранить данные
//                        }
                        dialogEnd.show();
                    } else {
                        numLeft = random.nextInt(21);  // 21
                        imgLeft.setImageResource(array.image3[numLeft]); //достаем из массива картьинку
                        imgLeft.startAnimation(animation); //запускаем анимацию для левой картики
                        textLeft.setText(array.text3[numLeft]); // достаем из массива текст

                        numRight = random.nextInt(21);  // 21
                        while (numLeft == numRight) {
                            numRight = random.nextInt(21);  // 21
                        }
                        imgRight.setImageResource(array.image3[numRight]); //достаем из массива картьинку
                        imgRight.startAnimation(animation); //запускаем анимацию для левой картики
                        textRight.setText(array.text3[numRight]); // достаем из массива текст
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
                    } else {
                        imgRight.setImageResource(R.drawable.img_false);
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
                    if (count == 20) { //выход из уровня  20
//                        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
//                        final int level = save.getInt("Level", 3);
//                        if(level <= 3){
//                            SharedPreferences.Editor editor = save.edit(); // Даем отредактировать элемент
//                            editor.putInt("Level", 4);  // ложим значение уровня 2
//                            editor.apply(); // сохранить данные
//                        }
                        dialogEnd.show();
                    } else {
                        numLeft = random.nextInt(21); // 21
                        imgLeft.setImageResource(array.image3[numLeft]); //достаем из массива картьинку
                        imgLeft.startAnimation(animation); //запускаем анимацию для левой картики
                        textLeft.setText(array.text3[numLeft]); // достаем из массива текст

                        numRight = random.nextInt(21);  // 21
                        while (numLeft == numRight) {
                            numRight = random.nextInt(21); // 21
                        }
                        imgRight.setImageResource(array.image3[numRight]); //достаем из массива картьинку
                        imgRight.startAnimation(animation); //запускаем анимацию для левой картики
                        textRight.setText(array.text3[numRight]); // достаем из массива текст
                        imgLeft.setEnabled(true); //включаем обратно правую картику
                    }

                }

                return true;
            }
        });
    }
}