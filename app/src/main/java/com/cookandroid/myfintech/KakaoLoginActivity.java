package com.cookandroid.myfintech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class KakaoLoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kakao_login);

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://retumble.cafe24app.com/kakao"));
        // intent.setPackage("com.android.chrome");   // 브라우저가 여러개 인 경우 콕 찍어서 크롬을 지정할 경우
        startActivity(intent);

    }
}
