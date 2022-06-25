package com.cookandroid.myfintech;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class SignUp3 extends AppCompatActivity {

    private Spinner spinner;
    private TextView textView;
    public ImageButton nextBtn;
    private EditText answer;


    String[] items = {"학창시절 나의 별명은?", "다시 태어나면 되고싶은것은?", "가장 좋아하는 영화는?", "가장 좋아하는 음식은?", "가장 존경하는 사람은?"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_3);

        spinner = findViewById(R.id.spinner);
        nextBtn = findViewById(R.id.nextBtn);
        answer = findViewById(R.id.answer);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        //드롭다운을 통해 스피너를 화면에 출력
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //스피너 안에다 어뎁터 연결
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                textView.setText(items[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                textView.setText("질문을 선택해주세요.");
            }
        });





    }

}