package com.example.fragmentmenuapplicationdz;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class XmmPage extends Fragment {

    int[] citiesPhoto = {
            R.drawable.moscva,
            R.drawable.brest,
            R.drawable.stalin,
            R.drawable.kiev,
            R.drawable.tula,
    };
    Spinner spinnerCities;
    Button buttonFindDescription;
    TextView textViewDescription;
    ImageView imageView;
    FloatingActionButton fab;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_xmm_page, container, false);


        fab = view.findViewById(R.id.fab);  // доступ к кн"+" FloatingActionButton

        spinnerCities = view.findViewById(R.id.spinner_list);
        buttonFindDescription = view.findViewById(R.id.button_find_description);
        textViewDescription = view.findViewById(R.id.text_view_description);
        imageView = view.findViewById(R.id.imageView);

        buttonFindDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = spinnerCities.getSelectedItemPosition();
                String description  = getDescriptionPosition(position);
                textViewDescription.setText(description);
                imageView.setImageResource(citiesPhoto[position]);
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomDialog();
            }
        });


        return view;
    }

    private void showBottomDialog() {
        final Dialog dialog = new Dialog(getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.botton_sheet_layout);

        TextView second = dialog.findViewById(R.id.second);
        TextView third = dialog.findViewById(R.id.third);
        TextView fourth = dialog.findViewById(R.id.fourth);

        /// выбираем пункты из выплывающего окна
        second.setOnClickListener(new View.OnClickListener() {   // второй
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                replaceFragment(new SecondPage());
            }
        });
        third.setOnClickListener(new View.OnClickListener() {   // третий
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                replaceFragment(new ThirdPage());
            }
        });
        fourth.setOnClickListener(new View.OnClickListener() {   // четвертый
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                replaceFragment(new FourthPage());
            }
        });


        /// всплывает диалоговое окно
        dialog.show();
        /// настройка диалогового окна
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        /// подключаем анимацию
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        /// опускаем вниз
        dialog.getWindow().setGravity(Gravity.BOTTOM);

    }

    ///  сама функция выбора пунктов из выплывающего окна
    private void replaceFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }


    private String getDescriptionPosition (int position){
        String[] cityNames = getResources().getStringArray(R.array.cities_photo);
        return cityNames[position];
    }



}