package com.example.fragmentmenuapplicationdz;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;


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
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_xmm_page, container, false);

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
        return view;
    }
    private String getDescriptionPosition (int position){
        String[] cityNames = getResources().getStringArray(R.array.cities_photo);
        return cityNames[position];
    }



}