package com.cookandroid.myfintech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Mape extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mape);

        findViewById(R.id.viewmore).setOnClickListener(view->{
            Intent intent = new Intent(this, PaymentHistory.class);
            startActivity(intent);
        });
    }
}