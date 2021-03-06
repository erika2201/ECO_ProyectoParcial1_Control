package com.example.cuybeatz_control;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import model.Message;

public class ControlActivity extends AppCompatActivity implements OnMessage {

    private Button rightBtn,leftBtn,upBtn,downBtn ;
    private TCPSingleton tcp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        rightBtn = findViewById(R.id.rightBtn);
        leftBtn = findViewById(R.id.leftBtn);
        upBtn = findViewById(R.id.upBtn);
        downBtn = findViewById(R.id.downBtn);

        tcp = TCPSingleton.getInstance();
        tcp.setObserver(this);


        rightBtn.setOnClickListener(
                (v) ->{
                    Gson gson = new Gson();
                    String key = "RIGHT";
                    Message obj = new Message(key);
                    String json = gson.toJson(obj);
                    tcp.sendMessage(json);

                    //Toast.makeText(this, "Derecha", Toast.LENGTH_SHORT).show();
                });

        leftBtn.setOnClickListener(
                (v) ->{
                    Gson gson = new Gson();
                    String key = "LEFT";
                    Message obj = new Message(key);
                    String json = gson.toJson(obj);
                    tcp.sendMessage(json);

                    //Toast.makeText(this, "Izquierda", Toast.LENGTH_SHORT).show();
                });

        upBtn.setOnClickListener(
                (v) ->{
                    Gson gson = new Gson();
                    String key = "UP";
                    Message obj = new Message(key);
                    String json = gson.toJson(obj);
                    tcp.sendMessage(json);

                    //Toast.makeText(this, "Arriba", Toast.LENGTH_SHORT).show();
                });

        downBtn.setOnClickListener(
                (v) ->{
                    Gson gson = new Gson();
                    String key = "DOWN";
                    Message obj = new Message(key);
                    String json = gson.toJson(obj);
                    tcp.sendMessage(json);

                    //Toast.makeText(this, "Abajo", Toast.LENGTH_SHORT).show();
                });
    }

    @Override
    public void onMessage(String msg) {

        Gson gson = new Gson();
        Message puntaje = gson.fromJson(msg, Message.class);
        String je = puntaje.getKey();
        String [] parts = je.split(",");
        String condicion = parts[0];
        Log.e(">>>>>>",condicion);
        String puntos = parts[1];
        Log.e(">>>>>>",puntos);
        if(condicion=="WIN"){
            Intent i = new Intent(this, WinnerActivity.class);
            i.putExtra("puntaje",puntos);
            startActivity(i);
        }else if(condicion=="LOSE"){
            Intent i = new Intent(this, LoserActivity.class);
            i.putExtra("puntaje",puntos);
            startActivity(i);
        }
        runOnUiThread(
                ()->{
                    //Donde llegan los mensajes, pero puedo hacer que lleguen a un text, u otro tipo de dato
                    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

                }
        );
    }
}