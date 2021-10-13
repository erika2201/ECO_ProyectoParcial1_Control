package com.example.cuybeatz_control;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

public class ConnectActivity extends AppCompatActivity {

    private TCPSingleton tcp;
    private ConstraintLayout bg;
    private int je;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);

        tcp = TCPSingleton.getInstance();


    }
}