package com.example.game_dz;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.util.SparseIntArrayKt;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView questionTextView;
    private ImageView imageFon;
    private Button answerButton1, answerButton2, answerButton3, answerButton4;

    private String[] questions = {
            "Какой цвет у неба?",
            "Что растёт в огороде?",
            "Как называют микроавтобусы, совершающие поездки по определённым маршрутам?",
            "О чём писал Грибоедов, отмечая, что он «нам сладок и приятен» ? ",
            "Какого персонажа нет в известной считалке «На золотом крыльце сидели» ?",
            "Какоой специалист занимается изучением неопознанных летающих объектов? ",
            "Как называется разновидность воды, в которой атом водорода замещён его изотопом дейтерием?",
            "Что такое десница? ",
            "В какое море впадает река Урал? ",
            "Сколько будет 2 + 2?"
    };

    private String[][] answers = {
            {"Синий", "Зеленый", "Красный", "Желтый"},
            {"Лук", "Пистолет ", "Пулемёт ", "Ракета СС-20"},
            {"Рейсовка ", "Путёвка  ", "Курсовка  ", "Маршрутка "},
            {"Дым Отечества ", "Дух купечества  ", "Дар пророчества  ", "Пыл девичества "},
            {"Сапожника    ", "Кузнеца   ", "Короля   ", "Портного  "},
            {"Кинолог     ", "Уфолог    ", "Сексопатолог    ", "Психиатр   "},
            {"Лёгкая      ", "Средняя     ", "Тяжёлая     ", "Невесомая    "},
            {"Бровь       ", "Глаз      ", "Шея      ", "Рука     "},
            {"Азовское        ", "Чёрное       ", "Средиземное       ", "Каспийское      "},
            {"3", "4", "5", "6"}
    };

    private int[] correctAnswers = {0, 0, 3, 0, 1, 1, 2, 3, 3, 1}; // Индексы правильных ответов

    private int currentQuestionIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionTextView = findViewById(R.id.questionTextView);
        answerButton1 = findViewById(R.id.answerButton1);
        answerButton2 = findViewById(R.id.answerButton2);
        answerButton3 = findViewById(R.id.answerButton3);
        answerButton4 = findViewById(R.id.answerButton4);
        imageFon = findViewById(R.id.imageFon);

        loadQuestion();

        answerButton1.setOnClickListener(v -> checkAnswer(0));
        answerButton2.setOnClickListener(v -> checkAnswer(1));
        answerButton3.setOnClickListener(v -> checkAnswer(2));
        answerButton4.setOnClickListener(v -> checkAnswer(3));
    }

    private void loadQuestion() {
        questionTextView.setText(questions[currentQuestionIndex]);
        answerButton1.setText(answers[currentQuestionIndex][0]);
        answerButton2.setText(answers[currentQuestionIndex][1]);
        answerButton3.setText(answers[currentQuestionIndex][2]);
        answerButton4.setText(answers[currentQuestionIndex][3]);
    }

    private void checkAnswer(int selectedAnswer) {
        if (selectedAnswer == correctAnswers[currentQuestionIndex]) {
            // Правильный ответ
            currentQuestionIndex++;
            if (currentQuestionIndex < questions.length) {
                loadQuestion();
            } else {
                // Конец игры
                questionTextView.setText("Поздравляем! \nВы выиграли!\n1000000 рублей!");
                questionTextView.setTextColor(ContextCompat.getColor(this, R.color.pink));
                questionTextView.setBackgroundResource(R.color.black);
                answerButton1.setVisibility(View.GONE);
                answerButton2.setVisibility(View.GONE);
                answerButton3.setVisibility(View.GONE);
                answerButton4.setVisibility(View.GONE);
               // imageFon.setBackgroundResource(R.drawable.priz);
                imageFon.setImageResource(R.drawable.priz);



            }
        } else {
            // Неправильный ответ
            questionTextView.setText("Неправильный ответ. Попробуйте снова!");
        }
    }
}