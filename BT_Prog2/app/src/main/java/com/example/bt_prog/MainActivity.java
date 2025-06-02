package com.example.bt_prog;

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

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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
    //private static final String DEVICE_ADDRESS = "98:DA:50:01:B4:7C"; // MAC-адрес вашего устройства
     //private static final String DEVICE_ADDRESS = "00:1D:A5:05:EE:47"; // MAC-адрес вашего устройства
    private static final String DEVICE_ADDRESS = "66:1E:11:8D:ED:7D"; // MAC-адрес вашего устройства КРАСНОГО АДАПТЕРА

    private TextView receivedDataTextView, receivedDataTextView2;
    private ImageView imageAir;
    Button btnConnect;


    // AT Z [reset all]  команда сброса сканера, всех его настроек до завода
    // AT E0 отключение эхо
    // AT E1 включение эхо
    // AT RV напряжение питания на адаптере


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConnect = findViewById(R.id.btnConnect);
        btnConnect.setBackgroundColor(Color.parseColor("#FF00007F"));
        Button btnSend = findViewById(R.id.btnSend);
        Button btnSendIdent = findViewById(R.id.btnSendIdent);
        Button btnSendVin = findViewById(R.id.btnSendVin);
        receivedDataTextView = findViewById(R.id.receivedDataTextView);
        receivedDataTextView2 = findViewById(R.id.receivedDataTextView2);
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

        // Проверка поддержки Bluetooth
        if (bluetoothAdapter == null) {
            Toast.makeText(this, "Bluetooth не поддерживается", Toast.LENGTH_SHORT).show();
            finish();
        }

        ////////////////////////////////////////
        /// Проверяем, есть ли у приложения
        /// разрешение на использование Bluetooth и
        /// доступ к геолокации
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.BLUETOOTH) != PackageManager.PERMISSION_GRANTED ||
                ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // Если одно из разрешений не предоставлено, запрашиваем необходимые разрешения у пользователя
            ActivityCompat.requestPermissions(this, new String[]{
                    Manifest.permission.BLUETOOTH,// Разрешение на использование Bluetooth
                    Manifest.permission.ACCESS_FINE_LOCATION// Разрешение на доступ к геолокации
            }, REQUEST_PERMISSIONS);// REQUEST_PERMISSIONS - код запроса разрешений
        } else {
            // Если все необходимые разрешения уже предоставлены, выполняем подключение к устройству
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
        //btnSendOnn.setOnClickListener(v -> sendData("BT01"));

        btnSend.setOnClickListener(v -> sendDataApi("ATRV\r"));
        btnSendIdent.setOnClickListener(v -> sendDataApi("ST1\r"));
//       btnSendVin.setOnClickListener(v -> sendDataApi("0100\r"));

//        //btnSend.setOnClickListener(v -> sendData((byte) 0x41,(byte) 0x54,0x5A,0x0D,0x41,0x54,0x45,0x30,0x0D,0x0D,0x0D,0x0D,0x0D,0x0D,0x0D,0x0D,0x0D,0x0D,0x0D));
//        // В методе onCreate добавьте обработчик для btnSend
//        btnSend.setOnClickListener(v -> {
//            // Создайте массив байтов для передачи
//            byte[] dataToSend = new byte[]{
//                    (byte) 0x41, // 0x725 - это 0x72 и 0x05 в двух байтах
//                    (byte) 0x54,
//                    (byte) 0x5A,
//                    (byte) 0x0D,
//                    (byte) 0x41,
//                    (byte) 0x54,
//                    (byte) 0x45,
//                    (byte) 0x30,
//                    (byte) 0x0D
//            };
//
//            sendData(dataToSend); // Отправка данных
//        });


        btnSendVin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // receiveData();



                sendDataApi("ST1\r");
                sendDataApi("VT1\r");
                sendDataApi("ATD\r");
                sendDataApi("ATD0\r");
                sendDataApi("ATE0\r");
                sendDataApi("ATH1\r");
                sendDataApi("ATSP0\r");
                sendDataApi("ATE0\r");
                sendDataApi("ATH1\r");
                sendDataApi("ATM0\r");
                sendDataApi("ATS0\r");
                sendDataApi("ATAT1\r");
                sendDataApi("ATAL\r");
                sendDataApi("ATST64\r");
                sendDataApi("0100\r");
            }
        });

    }

    private void connectToDevice() {
        BluetoothDevice device = bluetoothAdapter.getRemoteDevice(DEVICE_ADDRESS);

        try {
            bluetoothSocket = device.createRfcommSocketToServiceRecord(MY_UUID);
            bluetoothSocket.connect();
            outputStream = bluetoothSocket.getOutputStream();
            inputStream = bluetoothSocket.getInputStream();

            btnConnect.setBackgroundColor(Color.parseColor("#FF007F00"));
            receivedDataTextView.setText("Блютуз подключен");
            receivedDataTextView.setTextColor(Color.parseColor("#FF00FF00"));
            Toast.makeText(this, "Подключено", Toast.LENGTH_SHORT).show();

            sendDataApi("ATZ\rATE0\r");


            // Запуск потока для приема данных
            new Thread(this::receiveData).start();
            // Запуск потока для приема данных
            // new Thread(this::receiveDataHex).start();
        } catch (Exception e) {
            btnConnect.setBackgroundColor(Color.BLACK);
            receivedDataTextView.setText("Блютуз отключен");
            receivedDataTextView.setTextColor(Color.parseColor("#FF00007F"));
            Log.e("Bluetooth", "Ошибка подключения", e);
            Toast.makeText(this, "Ошибка подключения", Toast.LENGTH_SHORT).show();
        }
    }

    // Добавьте метод для отправки данных
    private void sendData(byte[] data) {
        if (outputStream != null) {
            try {
                outputStream.write(data);
                outputStream.flush();
                Toast.makeText(this, "Данные отправлены", Toast.LENGTH_SHORT).show();
            } catch (Exception e) {
                Log.e("Bluetooth", "Ошибка при отправке данных", e);
                Toast.makeText(this, "Ошибка при отправке данных", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Вы не подключены к устройству", Toast.LENGTH_SHORT).show();
        }
    }


    private void sendDataApi(String data) {
        if (outputStream != null) {
            try {
                outputStream.write(data.getBytes());
//                if (data.equals("ELM2")) {
//                    receivedDataTextView.setText("Включено");
//                    receivedDataTextView.setTextColor(Color.parseColor("#FFFF0000"));
//                    imageAir.setImageResource(R.drawable.cim_on);
//                    Toast.makeText(this, "Включено", Toast.LENGTH_SHORT).show();
//                }
//                if (data.equals("ATI")) {
//                    receivedDataTextView.setText("Выключено");
//                    receivedDataTextView.setTextColor(Color.parseColor("#FF0000FF"));
//                    imageAir.setImageResource(R.drawable.cim_off);
//                    Toast.makeText(this, "Выключено", Toast.LENGTH_SHORT).show();
//                }
                Toast.makeText(this, "Данные отправлены", Toast.LENGTH_SHORT).show();
                //receiveData();

            } catch (Exception e) {
                Log.e("Bluetooth", "Ошибка отправки данных", e);
                Toast.makeText(this, "Ошибка отправки данных", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void receiveData() {
        byte[] buffer = new byte[2048]; // Буфер для хранения данных
        int bytes; // Количество прочитанных байтов

        while (true) {
            try {
                bytes = inputStream.read(buffer); // Чтение данных
                String receivedMessage = new String(buffer, 0, bytes); // Преобразование байтов в строку
                runOnUiThread(() -> receivedDataTextView.setText(receivedMessage)); // Обновление UI
                /// ////////////////////////////////////////////////////////////////////////////////





                if (bytes == -1) {
                    // Если bytes равен -1, это означает конец потока
                    Log.e("Bluetooth", "Конец потока данных");
                    break;
                }


//                ///   /////////////////////////////////////////////////////////////////////////////
//                // Создаем строку с шестнадцатеричным представлением полученных байтов
//                StringBuilder hexString = new StringBuilder();
//                for (int i = 0; i < bytes; i++) {
//                    hexString.append(String.format("%02X ", buffer[i])); // Форматируем байты в шестнадцатеричном виде
//                }
//                // Обновляем UI с полученными данными в байтах
//                runOnUiThread(() -> receivedDataTextView2.setText(hexString.toString()));
//                /// ////////////////////////////////////////////////////////////////////////////////

            } catch (Exception e) {
                Log.e("Bluetooth", "Ошибка приема данных", e);
                break;
            }
        }
    }

    ///  ///////////////////////////////////////////////////////////////

    private void receiveDataHex() {
        byte[] buffer = new byte[2048]; // Буфер для хранения данных
        int bytes; // Количество прочитанных байтов

        while (true) {
            try {
                bytes = inputStream.read(buffer); // Чтение данных

                if (bytes == -1) {
                    // Если bytes равен -1, это означает конец потока
                    Log.e("Bluetooth", "Конец потока данных");
                    break;
                }

                // Создаем строку с шестнадцатеричным представлением полученных байтов
                StringBuilder hexString = new StringBuilder();
                for (int i = 0; i < bytes; i++) {
                    hexString.append(String.format("%02X ", buffer[i])); // Форматируем байты в шестнадцатеричном виде
                }

                // Обновляем UI с полученными данными в байтах
                runOnUiThread(() -> receivedDataTextView2.setText(hexString.toString()));

            } catch (Exception e) {
                Log.e("Bluetooth", "Ошибка приема данных", e);
                break;
            }
        }
    }


    /// ////////////////////////////////////////////////////////////


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
                Toast.makeText(this, "Разрешения не предоставлены", Toast.LENGTH_SHORT).show();
            }
        }
    }


}