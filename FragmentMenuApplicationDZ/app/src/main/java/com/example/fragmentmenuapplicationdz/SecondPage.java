package com.example.fragmentmenuapplicationdz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;


public class SecondPage extends Fragment {

    EditText editText;
    Button add;
    RecyclerView recycleView;

    List<String> dataList = new ArrayList<>();
    DataAdapter adapter;


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second_page, container, false);

        editText = view.findViewById(R.id.editText);
        add = view.findViewById(R.id.add);
        recycleView = view.findViewById(R.id.recycleView);







        recycleView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        adapter = new DataAdapter(dataList);
        recycleView.setAdapter(adapter);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = editText.getText().toString();
                dataList.add(data);
                editText.setText("");
                adapter.notifyDataSetChanged();
            }
        });


        return view;
    }
}