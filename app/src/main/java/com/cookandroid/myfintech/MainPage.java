package com.cookandroid.myfintech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        findViewById(R.id.goStemp).setOnClickListener(view ->{
            Intent intent = new Intent(this, CafePoint_Safe.class);
            startActivity(intent);

        });
        findViewById(R.id.viewBarCode).setOnClickListener(view ->{
            Intent intent = new Intent(this, CafePoint_Safe.class);
            startActivity(intent);

        });
    }
}