package com.example.filemanagerprojectaplication.fragments;

import android.Manifest;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
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
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.filemanagerprojectaplication.FileAdapter;
import com.example.filemanagerprojectaplication.FileOpener;
import com.example.filemanagerprojectaplication.OnFileSelectedListener;
import com.example.filemanagerprojectaplication.R;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CardFragment extends Fragment implements OnFileSelectedListener {

    private FileAdapter fileAdapter;
    private RecyclerView recyclerViewCard;
    private List<File> fileListCard;
    private ImageView imgBackCard;
    private TextView tvPathHolderCard;

    String dataCard;
    File storageCard;
    File[] storageCard2;
    String pathSpl = "";
    View view;
    String[] items = {"Details", "Rename", "Delete"};

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
        if (storageCard2.length > 1 && storageCard2[1] != null) {
            String storageCardElement = storageCard2[1].getPath(); /// Получаем путь ко второй директории хранения (SD-карте)
            /// Разделяем путь на части, чтобы извлечь соответствующую информацию
            String[] pathCard = storageCardElement.split("/");

            /// Проверяем, содержит ли разделенный путь как минимум 3 элемента
            if (pathCard.length >= 3) {
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
        if (getArguments() != null) {
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
        if (file.isDirectory()) {
//            Bundle bundle = new Bundle();
//            bundle.putString("path", file.getAbsolutePath());
//            CardFragment cardFragment = new CardFragment();
//            cardFragment.setArguments(bundle);
//
//            requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, cardFragment).addToBackStack(null).commit();


            Bundle bundle = new Bundle();
            bundle.putString("path", file.getAbsolutePath());
            InternalFragment internalFragment = new InternalFragment();
            internalFragment.setArguments(bundle);

            requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, internalFragment).addToBackStack(null).commit();



        } else {
            FileOpener.openFile(getContext(), file);
        }
    }

    @Override
    public void onFileLongClicked(File file) {
        final Dialog optionDialogCard = new Dialog(getContext());
        optionDialogCard.setContentView(R.layout.option_dialog);
        optionDialogCard.setTitle("Select Options");
        ListView optionCard = optionDialogCard.findViewById(R.id.list);

        CustomAdapterCard customAdapterCard = new CustomAdapterCard();
        optionCard.setAdapter(customAdapterCard);
        optionDialogCard.show();

        optionCard.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItemCard = parent.getItemAtPosition(position).toString();
                switch (selectedItemCard) {
                    case "Details":
                        AlertDialog.Builder detailDialog = new AlertDialog.Builder(getContext());
                        detailDialog.setTitle("Details:");
                        final TextView details = new TextView(getContext());
                        detailDialog.setView(details);
                        Date lastModified = new Date(file.lastModified());
                        SimpleDateFormat formatted = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        String formattedDate = formatted.format(lastModified);

//                        details.setText(String.format(
//                                "File Name: " + file.getName() + "\n" +
//                                        "Size: " + Formatter.formatShortFileSize(getContext(), file.length()) + "\n" +
//                                        "Path: " + file.getAbsolutePath() + "\n" +
//                                        "Last Modified: " + formattedDate));

                        details.setText(String.format("File Name: %s\nSize: %s\nPath: %s\nLast Modified: %s",
                                file.getName(), Formatter.formatShortFileSize(getContext(),
                                        file.length()), file.getAbsolutePath(), formattedDate));


                        details.setPadding(70, 10, 10, 10);
                        detailDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //optionDialog.cancel();
                                optionDialogCard.closeOptionsMenu();
                            }
                        });

                        AlertDialog alertDialogDetails = detailDialog.create();
                        alertDialogDetails.show();
                        break;
                }
            }
        });



    }

    class CustomAdapterCard extends BaseAdapter{

        @Override
        public int getCount() {
            return items.length;
        }

        @Override
        public Object getItem(int position) {
            return items[position];
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View myViewCard = getLayoutInflater().inflate(R.layout.option_layout, null);
            TextView txtOptionsCard = myViewCard.findViewById(R.id.txt_option);
            ImageView imgOptionsCard = myViewCard.findViewById(R.id.img_option);

            txtOptionsCard.setText(items[position]);
            if (items[position].equals("Details")) {
                imgOptionsCard.setImageResource(R.drawable.baseline_info_outline_24);
            } else if (items[position].equals("Rename")) {
                imgOptionsCard.setImageResource(R.drawable.baseline_drive_file_rename_outline_24);
            } else if (items[position].equals("Delete")) {
                imgOptionsCard.setImageResource(R.drawable.baseline_delete_forever_24);
            }

            return myViewCard;
        }
    }

}

