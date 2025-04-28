package com.example.bt_gree;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    private BluetoothAdapter bluetoothAdapter;
    private BluetoothSocket bluetoothSocket;
    InputStream inputStream;
    OutputStream outputStream;
    TextView textViewData;
    private final String DEVICE_ADDRESS = "00:11:22:33:44:55"; // заменить на адрес моего устройства
    private final UUID MY_UUID = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB"); // стандартныйUUID для SPP

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        textViewData = findViewById(R.id.textViewData);
        Button buttonSend = findViewById(R.id.buttonSend);
        Button buttonReceive = findViewById(R.id.buttonReceive);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendByte((byte) 123);  /// отправления байта
            }
        });

        buttonReceive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                receiveByte();
            }
        });
        connectBluetooth();
    }
    private void connectBluetooth(){
        BluetoothDevice device = bluetoothAdapter.getRemoteDevice(DEVICE_ADDRESS);
        try {
            if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.BLUETOOTH_CONNECT) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }
            bluetoothSocket = device.createRfcommSocketToServiceRecord(MY_UUID);
            bluetoothSocket.connect();
            inputStream = bluetoothSocket.getInputStream();
            outputStream = bluetoothSocket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendByte(byte data){
        if(outputStream != null){
            try {
                outputStream.write(data);
            } catch (IOException e){
                e.printStackTrace();
            }
        }

    }
    private void receiveByte(){
        if(inputStream != null){
            try {
                int byteData = inputStream.read();
                textViewData.setText("Полученный байт: " + byteData);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        if(bluetoothSocket != null){
            try {
                bluetoothSocket.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }



}