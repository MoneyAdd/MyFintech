package com.cookandroid.myfintech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SignUp2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_2);

        findViewById(R.id.nextBtn).setOnClickListener(view->{
            Intent intent = new Intent(this,SignUp3.class);
            startActivity(intent);
        });

    }
}