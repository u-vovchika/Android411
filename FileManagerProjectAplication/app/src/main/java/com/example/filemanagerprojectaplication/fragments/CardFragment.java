package com.example.filemanagerprojectaplication.fragments;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Environment;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.filemanagerprojectaplication.FileAdapter;
import com.example.filemanagerprojectaplication.OnFileSelectedListener;
import com.example.filemanagerprojectaplication.R;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class CardFragment extends Fragment implements OnFileSelectedListener{

    private FileAdapter fileAdapter;
    private RecyclerView recyclerViewCard;
    private List<File> fileListCard;
    private ImageView imgBackCard;
    private TextView tvPathHolderCard;

    String dataCard;
    File storageCard; /// pathSd
    File[] storageCard2;  /// mmm
    String pathSpl = ""; /// pathToSD
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_card, container, false);
        /// доступ к переменным
        imgBackCard = view.findViewById(R.id.img_back_card);
        tvPathHolderCard = view.findViewById(R.id.tv_path_holder_card);

        /// Получаем доступ к внешним директориям хранения, доступным на устройстве /////
        storageCard2 = ContextCompat.getExternalFilesDirs(requireContext(), null);
        /// Проверяем, есть ли несколько директорий хранения (как минимум 2)
        if(storageCard2.length > 1 && storageCard2[1] != null){
            String storageCardElement = storageCard2[1].getPath(); /// Получаем путь ко второй директории хранения (SD-карте)
            /// Разделяем путь на части, чтобы извлечь соответствующую информацию
            String[] pathCard = storageCardElement.split("/");

            /// Проверяем, содержит ли разделенный путь как минимум 3 элемента
            if(pathCard.length >= 3) {
                /// Формируем строку пути, используя первые три части пути
                pathSpl = pathCard[0] + "/" + pathCard[1] + "/" + pathCard[2];
                /// Отображаем сформированный путь в TextView
                tvPathHolderCard.setText("Path SD: " + pathSpl);
                /// Создаем объект File для сформированного пути
                storageCard = new File(pathSpl);
                runtimePermission(); /// вызов метода запроса разрешений
            } else {
                /// Если путь не содержит достаточного количества элементов, отображаем сообщение об ошибке
                tvPathHolderCard.setText("Path SD: " + "SD card извлечена.");
            }
        } else {
            /// Если нет второй директории хранения, отображаем сообщение об ошибке
            tvPathHolderCard.setText("Path(1) SD: " + "SD card извлечена.");
        }
        /// ////////////////////////////////////////////////////
        if(getArguments() != null){
            dataCard = getArguments().getString("path");
            storageCard = new File(dataCard);
        }

        return view;
    }

    private void runtimePermission() {
        //разрешение до Android 10 (API 29)
        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.Q) {
            if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission
                    .READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission
                        .READ_EXTERNAL_STORAGE}, 100);
            }
            if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission
                    .READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                displayFiles();
            }
        }
        //разрешение для андроид 11 ( API 30) и выше
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            if (!Environment.isExternalStorageManager()) {
                try {
                    Uri uri = Uri.fromParts("package", getActivity().getPackageName(), null);
                    Intent intent = new Intent(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION);
                    intent.setData(uri);
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.setData(Uri.parse(String.format("package:%s", getActivity().getPackageName())));
                    getActivity().startActivityIfNeeded(intent, 101);
                } catch (Exception e) {
                    Intent intent = new Intent();
                    intent.setAction(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION);
                    getActivity().startActivityIfNeeded(intent, 101);
                }
            }
            if (Environment.isExternalStorageManager()) {
                displayFiles();
            }
        }
    }

    public ArrayList<File> findFiles(File file) {
        ArrayList<File> arrayList = new ArrayList<>();
        File[] files = file.listFiles();

        for (File singleFile : files) {
            if (singleFile.isDirectory() && !singleFile.isHidden()) {
                arrayList.add(singleFile);
            }
        }

        for (File singleFile : files) {
            if (singleFile.getName().toLowerCase().endsWith(".jpeg") ||
                    singleFile.getName().toLowerCase().endsWith(".jpg") ||
                    singleFile.getName().toLowerCase().endsWith(".png") ||
                    singleFile.getName().toLowerCase().endsWith(".mp3") ||
                    singleFile.getName().toLowerCase().endsWith(".wav") ||
                    singleFile.getName().toLowerCase().endsWith(".mp4") ||
                    singleFile.getName().toLowerCase().endsWith(".pdf") ||
                    singleFile.getName().toLowerCase().endsWith(".doc") ||
                    singleFile.getName().toLowerCase().endsWith(".apk")) {
                arrayList.add(singleFile);
            }
        }
        return arrayList;
    }

    private void displayFiles() {
        recyclerViewCard = view.findViewById(R.id.recycler_internal_card);
        recyclerViewCard.setHasFixedSize(true);
        recyclerViewCard.setLayoutManager(new GridLayoutManager(getContext(), 2));
        fileListCard = new ArrayList<>();
        fileListCard.addAll(findFiles(storageCard));
//        System.out.println("&&&&&&&" + fileListCard);
        fileAdapter = new FileAdapter(getContext(), fileListCard, this);
        recyclerViewCard.setAdapter(fileAdapter);
    }

    @Override
    public void onFileClicked(File file) {
        if(file.isDirectory()){
            Bundle bundle = new Bundle();
            bundle.putString("path", file.getAbsolutePath());
            InternalFragment internalFragment = new InternalFragment();
            internalFragment.setArguments(bundle);

            requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, internalFragment).addToBackStack(null).commit();
        }
    }

    @Override
    public void onFileLongClicked(File file) {

    }

}

