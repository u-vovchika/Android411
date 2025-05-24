package com.example.fragmentmenuapplication;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class FirstPage extends Fragment {

    RatingBar ratingBar;
    Button ratingButton;
    Spinner spinnerColors;
    Button buttonFindDescription;
    TextView textViewDescription;
    SeekBar seekBar;
    TextView textView;

    SeekBar seekBarDiscrete;
    TextView textSize;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first_page, container, false);

        ratingBar = view.findViewById(R.id.ratingBar);
        ratingButton = view.findViewById(R.id.rating_btn);

        ratingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float value = ratingBar.getRating();
                Toast.makeText(getContext(), "Rating: " + value, Toast.LENGTH_SHORT).show();
            }
        });

        spinnerColors = view.findViewById(R.id.spinner_list);
        buttonFindDescription = view.findViewById(R.id.button_find_description);
        textViewDescription = view.findViewById(R.id.text_view_description);

        buttonFindDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = spinnerColors.getSelectedItemPosition();
                String description = getDescriptionPosition(position);
                textViewDescription.setText(description);

                String colors = getColors(position);
                buttonFindDescription.setBackgroundColor(Color.parseColor(colors));

            }
        });


        seekBar = view.findViewById(R.id.seekBar);
        textView = view.findViewById(R.id.textView);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setText(progress + "/100");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                textView.setTextColor(Color.parseColor("red"));
                Toast.makeText(getContext(), "Min", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                textView.setTextColor(Color.parseColor("green"));
                Toast.makeText(getContext(), "Max", Toast.LENGTH_SHORT).show();
            }
        });

        seekBarDiscrete = view.findViewById(R.id.seekBar2);
        textSize = view.findViewById(R.id.textSize);

        seekBarDiscrete.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textSize.setTextSize(progress * 3);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });




        return view;
    }

    private String getDescriptionPosition(int position){
        String[] description = getResources().getStringArray(R.array.description_of_temp);
        return description[position];
    }

    private String getColors(int position){
        String[] description = getResources().getStringArray(R.array.colors_button);
        return description[position];
    }

}