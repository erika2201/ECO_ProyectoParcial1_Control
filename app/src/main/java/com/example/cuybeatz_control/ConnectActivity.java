package com.example.cuybeatz_control;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Toast;

public class ConnectActivity extends AppCompatActivity implements OnMessageListener {

    private TCPSingleton tcp;
    private ConstraintLayout bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);

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