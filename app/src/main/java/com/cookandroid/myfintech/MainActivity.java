package com.cookandroid.myfintech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnrogin).setOnClickListener(view ->{
            Intent intent = new Intent(this, MainPage.class);
            startActivity(intent);
        });
        findViewById(R.id.kakaostart).setOnClickListener(view->{
            Intent intent = new Intent(this,KakaoLoginActivity.class);
            startActivity(intent);
        });
    }
}