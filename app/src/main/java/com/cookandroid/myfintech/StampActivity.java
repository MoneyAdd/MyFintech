package com.cookandroid.myfintech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class StampActivity extends AppCompatActivity {
    TextView count;
    ArrayList<ImageView> imgArray = new ArrayList<ImageView>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stamp);

        textSet();
        arrayImgSet();
        imgClickSet();
    }

    private void textSet() {
        count = findViewById(R.id.count);
    }

    private void arrayImgSet(){
        imgArray.add(findViewById(R.id.stamp1));
        imgArray.add(findViewById(R.id.stamp2));
        imgArray.add(findViewById(R.id.stamp3));
        imgArray.add(findViewById(R.id.stamp4));
        imgArray.add(findViewById(R.id.stamp5));
        imgArray.add(findViewById(R.id.stamp6));
        imgArray.add(findViewById(R.id.stamp7));
        imgArray.add(findViewById(R.id.stamp8));
        imgArray.add(findViewById(R.id.stamp9));
        imgArray.add( findViewById(R.id.stamp10));
        imgArray.add( findViewById(R.id.stamp11));
        imgArray.add( findViewById(R.id.stamp12));
        imgArray.add( findViewById(R.id.stamp13));
        imgArray.add( findViewById(R.id.stamp14));
        imgArray.add( findViewById(R.id.stamp15));
        imgArray.add( findViewById(R.id.stamp16));
        imgArray.add( findViewById(R.id.stamp17));
        imgArray.add( findViewById(R.id.stamp18));
        imgArray.add( findViewById(R.id.stamp19));
        imgArray.add( findViewById(R.id.stamp20));
    }
    private void imgClickSet(){

        for(int i=0;i<20;i++){
            switch (i/4){
                case 0:
                    if(i%2==0) {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            imgArray.get(j).setImageDrawable(getResources().getDrawable(R.drawable.frame29));
                        });
                    }
                    else {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            imgArray.get(j).setImageDrawable(getResources().getDrawable(R.drawable.frame30));
                        });
                    }
                    break;
                case 1:
                    if(i%2==0) {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            imgArray.get(j).setImageDrawable(getResources().getDrawable(R.drawable.frame33));
                        });
                    }
                    else {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            imgArray.get(j).setImageDrawable(getResources().getDrawable(R.drawable.frame36));
                        });
                    }
                    break;
                case 2:
                    if(i%2==0) {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            imgArray.get(j).setImageDrawable(getResources().getDrawable(R.drawable.frame37));
                        });
                    }
                    else {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            imgArray.get(j).setImageDrawable(getResources().getDrawable(R.drawable.frame40));
                        });
                    }
                    break;
                case 3:
                    if(i==13-1){//13번째
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            imgArray.get(j).setImageDrawable(getResources().getDrawable(R.drawable.frame56));
                        });
                    }
                    else if(i%2==0) {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            imgArray.get(j).setImageDrawable(getResources().getDrawable(R.drawable.frame37));
                        });
                    }
                    else {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            imgArray.get(j).setImageDrawable(getResources().getDrawable(R.drawable.frame40));
                        });
                    }
                    break;
            }
        }
    }
}