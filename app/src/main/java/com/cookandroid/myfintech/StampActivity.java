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
        imgArray.add( findViewById(R.id.stamp21));
        imgArray.add( findViewById(R.id.stamp22));
        imgArray.add( findViewById(R.id.stamp23));
        imgArray.add( findViewById(R.id.stamp24));
    }
    private void imgClickSet(){

        for(int i=0;i<imgArray.size();i++){
            switch (i/4){//몇번째 줄인지
                case 0://멘 첫번째줄
                    if(i%2==0) {//0번째 or 2번째
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {//그 이미지뷰를
                            imgArray.get(j).setImageResource(R.drawable.coffee1_1);//클릭하면 이걸로 바꾼다.
                        });
                    }
                    else {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            imgArray.get(j).setImageResource(R.drawable.coffee1_2);
                        });
                    }
                    break;
                case 1:
                    if(i%2==0) {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            imgArray.get(j).setImageResource(R.drawable.coffee2_1);
                        });
                    }
                    else {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            imgArray.get(j).setImageResource(R.drawable.coffee2_2);
                        });
                    }
                    break;
                case 2:
                    if(i%2==0) {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            imgArray.get(j).setImageResource(R.drawable.coffee3_1);
                        });
                    }
                    else {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            imgArray.get(j).setImageResource(R.drawable.coffee3_2);
                        });
                    }
                    break;
                case 3:
                    if(i==13-1){//13번째
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            imgArray.get(j).setImageResource(R.drawable.frame56);
                        });
                    }
                    else if(i%2==0) {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            imgArray.get(j).setImageResource(R.drawable.coffee4_1);
                        });
                    }
                    else {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            imgArray.get(j).setImageResource(R.drawable.coffee4_2);
                        });
                    }
                    break;
                case 4:
                    if(i%2==0) {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            imgArray.get(j).setImageResource(R.drawable.coffee5_1);
                        });
                    }
                    else {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            imgArray.get(j).setImageResource(R.drawable.coffee5_2);
                        });
                    }
                    break;
                case 5:
                    if(i==24-1){//24번째
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            imgArray.get(j).setImageResource(R.drawable.frame56);
                        });
                    }
                    else if(i%2==0) {
                        int j=i;//for문의 i 인식 못함
                            imgArray.get(j).setImageResource(R.drawable.coffee6_1);
                    }
                    else {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            imgArray.get(j).setImageResource(R.drawable.coffee6_2);
                        });
                    }
                    break;
            }
        }
    }
}