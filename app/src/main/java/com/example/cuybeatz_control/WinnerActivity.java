package com.example.cuybeatz_control;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class WinnerActivity extends AppCompatActivity {

    private TextView scoreWinner;
    private Button backBtnWinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);

        scoreWinner = findViewById(R.id.scoreWinner);
        backBtnWinner = findViewById(R.id.backBtnWinner);
    }
}