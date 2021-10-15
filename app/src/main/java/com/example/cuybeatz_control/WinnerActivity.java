package com.example.cuybeatz_control;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class WinnerActivity extends AppCompatActivity  implements OnMessage{

    private TextView scoreWinner;
    private Button backBtnWinner;
    private TCPSingleton tcp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);

        scoreWinner = findViewById(R.id.scoreWinner);
        backBtnWinner = findViewById(R.id.backBtnWinner);

        tcp = TCPSingleton.getInstance();
        tcp.setObserver(this);

        //De Wiiner a Main
        backBtnWinner.setOnClickListener(
                (v) ->{
                    Intent i = new Intent(this,MainActivity.class);
                    startActivity(i);
                });
    }

    @Override
    public void onMessage(String msg) {

    }
}