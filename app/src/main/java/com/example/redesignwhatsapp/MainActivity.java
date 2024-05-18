package com.example.redesignwhatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView btnStatus, btnKomunitas, btnCall, btnChat;
    ImageButton btnTmbhchat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStatus = findViewById(R.id.btnstatus);
        btnKomunitas = findViewById(R.id.btnkomunitas);
        btnCall = findViewById(R.id.btncall);
        btnTmbhchat = findViewById(R.id.btntmbhchat);
        btnChat = findViewById(R.id.btnchat);

        setupClickListeners();
    }

    private void setupClickListeners() {
        btnStatus.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, status.class);
            startActivity(intent);
        });

        btnKomunitas.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, komunitas.class);
            startActivity(intent);
        });

        btnCall.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, panggilan.class);
            startActivity(intent);
        });

        btnTmbhchat.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, tambahchat.class);
            startActivity(intent);
        });
        btnChat.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
