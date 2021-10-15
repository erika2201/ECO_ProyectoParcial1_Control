package com.example.cuybeatz_control;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LoserActivity extends AppCompatActivity  implements OnMessage{

    private TextView scoreLoser;
    private Button backBtnLoser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loser);

        scoreLoser = findViewById(R.id.scoreLoser);
        backBtnLoser = findViewById(R.id.backBtnLoser);


        //De Loser a Main
        backBtnLoser.setOnClickListener(
                (v) ->{
                    Intent i = new Intent(this,MainActivity.class);
                    startActivity(i);
                });
    }

    @Override
    public void onMessage(String msg) {

    }
}