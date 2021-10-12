package com.example.cuybeatz_control;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class ControlActivity extends AppCompatActivity {

    private Button rightBtn,leftBtn,upBtn,downBtn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        rightBtn = findViewById(R.id.rightBtn);
        leftBtn = findViewById(R.id.leftBtn);
        upBtn = findViewById(R.id.upBtn);
        downBtn = findViewById(R.id.downBtn);


        rightBtn.setOnClickListener(
                (v) ->{
                    Toast.makeText(this, "Derecha", Toast.LENGTH_SHORT).show();
                });

        leftBtn.setOnClickListener(
                (v) ->{
                    Toast.makeText(this, "Izquierda", Toast.LENGTH_SHORT).show();
                });

        upBtn.setOnClickListener(
                (v) ->{
                    Toast.makeText(this, "Arriba", Toast.LENGTH_SHORT).show();
                });

        downBtn.setOnClickListener(
                (v) ->{
                    Toast.makeText(this, "Abajo", Toast.LENGTH_SHORT).show();
                });
    }
}