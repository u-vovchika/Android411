package com.example.bt_v2;

import android.Manifest;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

//import com.example.bt_v2.R;
//import com.example.bt_v2.R;
import com.google.android.material.switchmaterial.SwitchMaterial;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_ENABLE_BT = 1;
    private static final int REQUEST_PERMISSIONS = 2; // Код для запроса разрешений
    private BluetoothAdapter bluetoothAdapter;
    private BluetoothSocket bluetoothSocket;
    private OutputStream outputStream;
    private InputStream inputStream;

    // UUID для SPP (Serial Port Profile)
    private static final UUID MY_UUID = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
    private static final String DEVICE_ADDRESS = "98:DA:50:01:B4:7C"; // MAC-адрес вашего устройства

    private TextView receivedDataTextView,receivedDataTextView2;
    private ImageView imageAir, btView;
    Button btnConnect,btnSend, btnSendOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout relativeLayout = findViewById(R.id.main);

//        imageAir = findViewById(R.id.imageAir);
//        imageAir.setImageResource(R.drawable.cim_off);

        btView = findViewById(R.id.btView);
        btView.setImageResource(R.drawable.outline_bluetooth_disabled_24);

        btnConnect = findViewById(R.id.btnConnect);
        //btnConnect.setBackgroundColor(Color.parseColor("#FF00007F"));

        btnSend = findViewById(R.id.btnSend);
        btnSendOff = findViewById(R.id.btnSendOff);
        //Button btnReceive = findViewById(R.id.btnReceive);
        receivedDataTextView = findViewById(R.id.receivedDataTextView);
        receivedDataTextView2 = findViewById(R.id.receivedDataTextView2);
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

        // Проверка поддержки Bluetooth
        if (bluetoothAdapter == null) {
            Toast.makeText(this, "Bluetooth не поддерживается", Toast.LENGTH_SHORT).show();
            finish();
        }

        ////////////////////////////////////////
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.BLUETOOTH) != PackageManager.PERMISSION_GRANTED ||
                ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // Запрос разрешений
            ActivityCompat.requestPermissions(this, new String[]{
                    Manifest.permission.BLUETOOTH,
                    Manifest.permission.ACCESS_FINE_LOCATION
            }, REQUEST_PERMISSIONS);
        } else {
            connectToDevice(); // Подключение к устройству
        }
        /////////////////////////////////////////////
        btnConnect.setOnClickListener(v -> {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.BLUETOOTH) != PackageManager.PERMISSION_GRANTED ||
                    ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // Запрос разрешений
                ActivityCompat.requestPermissions(this, new String[]{
                        Manifest.permission.BLUETOOTH,
                        Manifest.permission.ACCESS_FINE_LOCATION
                }, REQUEST_PERMISSIONS);
            } else {
                connectToDevice(); // Подключение к устройству
            }
        });

        // Отправка данных
        btnSend.setOnClickListener(v -> sendData("BT01"));
        btnSendOff.setOnClickListener(v -> sendData("BT00"));
//        btnReceive.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                receiveData();
//            }
//        });


    }

    private void connectToDevice() {
        BluetoothDevice device = bluetoothAdapter.getRemoteDevice(DEVICE_ADDRESS);

        try {
            bluetoothSocket = device.createRfcommSocketToServiceRecord(MY_UUID);
            bluetoothSocket.connect();
            outputStream = bluetoothSocket.getOutputStream();
            inputStream = bluetoothSocket.getInputStream();

            //btnConnect.setBackgroundColor(Color.parseColor("#FF0000FF"));
            btnConnect.setText("Bluetooth подключен");
            receivedDataTextView.setText("Bluetooth подключен");
            receivedDataTextView.setTextColor(Color.parseColor("#FF00FF00"));
            btView.setImageResource(R.drawable.outline_bluetooth_searching_24);
            Toast.makeText(this, "Подключено", Toast.LENGTH_SHORT).show();

            // Запуск потока для приема данных
            new Thread(this::receiveData).start();

        } catch (Exception e) {
            btnConnect.setBackgroundColor(Color.BLACK);
            receivedDataTextView.setText("Bluetooth отключен");
            receivedDataTextView.setTextColor(Color.parseColor("#FF00007F"));
            btView.setImageResource(R.drawable.outline_bluetooth_disabled_24);
            Log.e("Bluetooth", "Ошибка подключения", e);
            Toast.makeText(this, "Ошибка подключения", Toast.LENGTH_SHORT).show();
        }
    }

    private void sendData(String data) {
        if (outputStream != null) {
            try {
                outputStream.write(data.getBytes());
                if (data.equals("BT01")) {
                    receivedDataTextView.setText("Включено");
                    btnSend.setTextColor(Color.parseColor("#55000000"));
                    btnSendOff.setTextColor(Color.parseColor("#FFFFFFFF"));
                    imageAir.setImageResource(R.drawable.cim_on);
                    Toast.makeText(this, "Включено", Toast.LENGTH_SHORT).show();
                }
                if (data.equals("BT00")) {
                    receivedDataTextView.setText("Выключено");
                    btnSend.setTextColor(Color.parseColor("#FFFFFFFF"));
                    btnSendOff.setTextColor(Color.parseColor("#55000000"));
                    //receivedDataTextView.setTextColor(Color.parseColor("#FF0000FF"));
                    imageAir.setImageResource(R.drawable.cim_off);
                    Toast.makeText(this, "Выключено", Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(this, "Данные отправлены", Toast.LENGTH_SHORT).show();
            } catch (Exception e) {
                Log.e("Bluetooth", "Ошибка отправки данных", e);
                Toast.makeText(this, "Ошибка отправки данных", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void receiveData() {
        byte[] buffer = new byte[1024]; // Буфер для хранения данных
        int bytes; // Количество прочитанных байтов

        while (true) {
            try {
                bytes = inputStream.read(buffer); // Чтение данных
                String receivedMessage = new String(buffer, 0, bytes); // Преобразование байтов в строку
                runOnUiThread(() -> receivedDataTextView.setText(receivedMessage)); // Обновление UI
                if(receivedMessage.equals("Device is ON")){
                    runOnUiThread(() -> receivedDataTextView2.setText(receivedMessage)); // Обновление UI
                    receivedDataTextView2.setTextColor(Color.parseColor("#FFFF0000"));
                }
                if(receivedMessage.equals("Device is OFF")){
                    runOnUiThread(() -> receivedDataTextView2.setText(receivedMessage)); // Обновление UI
                    receivedDataTextView2.setTextColor(Color.parseColor("#FF0000FF"));
                }
            } catch (Exception e) {
                Log.e("Bluetooth", "Ошибка приема данных", e);
                break;
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        try {
            if (bluetoothSocket != null) {
                bluetoothSocket.close();
            }
        } catch (Exception e) {
            Log.e("Bluetooth", "Ошибка закрытия сокета", e);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_PERMISSIONS) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                connectToDevice(); // Повторное подключение после получения разрешений
            } else {
                btView.setImageResource(R.drawable.outline_bluetooth_disabled_24);
                Toast.makeText(this, "Разрешения не предоставлены", Toast.LENGTH_SHORT).show();
            }
        }
    }
}