package com.example.fragmentapplicationdz;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    Button firstFragmentBtn, secondFragmentBtn, thirdFragmentBtn;
    Fragment1 firstFragment = new Fragment1();
    Fragment2 secondFragment = new Fragment2();
    Fragment3 thirdFragment = new Fragment3();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstFragmentBtn = findViewById(R.id.fragment1Btn);
        secondFragmentBtn = findViewById(R.id.fragment2Btn);
        thirdFragmentBtn = findViewById(R.id.fragment3Btn);

        firstFragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(firstFragment);
                firstFragmentBtn.setTextColor(Color.parseColor("#33FF00"));
                secondFragmentBtn.setTextColor(Color.parseColor("#FFFFFF"));
                thirdFragmentBtn.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });

        secondFragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(secondFragment);
                firstFragmentBtn.setTextColor(Color.parseColor("#FFFFFF"));
                secondFragmentBtn.setTextColor(Color.parseColor("#FFFF00"));
                thirdFragmentBtn.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });

        thirdFragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(thirdFragment);
                firstFragmentBtn.setTextColor(Color.parseColor("#FFFFFF"));
                secondFragmentBtn.setTextColor(Color.parseColor("#FFFFFF"));
                thirdFragmentBtn.setTextColor(Color.parseColor("#005500"));
            }
        });
    }

    private void replaceFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.farmeLaout, fragment);
        fragmentTransaction.commit();
    }
}