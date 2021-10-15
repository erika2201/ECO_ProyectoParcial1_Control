package com.example.cuybeatz_control;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;

import model.Message;

public class ConnectActivity extends AppCompatActivity implements OnMessage  {

    private TCPSingleton tcp;
    private ConstraintLayout bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);

        bg = findViewById(R.id.bg);
        tcp = TCPSingleton.getInstance();
        tcp.setObserver(this);

    }


    //Patron observer
    @Override
    public void onMessage(String msg){
        runOnUiThread(
                ()->{
                    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
                }
        );
    }

}