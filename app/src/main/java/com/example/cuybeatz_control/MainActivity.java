package com.example.cuybeatz_control;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.controls.Control;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button connectBtn;
    private TCPSingleton tcp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectBtn = findViewById(R.id.connectBtn);


        //De Main a Control
        connectBtn.setOnClickListener(
                (v) ->{
                    Intent i = new Intent(this, ControlActivity.class);
                    startActivity(i);
                });
    }
}