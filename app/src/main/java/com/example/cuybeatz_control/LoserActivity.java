package com.example.cuybeatz_control;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LoserActivity extends AppCompatActivity {

    private TextView scoreLoser;
    private Button backBtnLoser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loser);

        scoreLoser = findViewById(R.id.scoreLoser);
        backBtnLoser = findViewById(R.id.backBtnLoser);
    }
}