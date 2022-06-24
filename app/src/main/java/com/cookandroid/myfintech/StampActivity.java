package com.cookandroid.myfintech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class StampActivity extends AppCompatActivity {
    int cnt=0;
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
                            if(j==cnt) {
                                imgArray.get(j).setImageResource(R.drawable.coffee1_1);//클릭하면 이걸로 바꾼다.
                                count.setText(++cnt + "");
                            }
                        });
                    }
                    else {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            if(j==cnt) {
                                imgArray.get(j).setImageResource(R.drawable.coffee1_2);
                                count.setText(++cnt + "");
                            }
                        });
                    }
                    break;
                case 1:
                    if(i%2==0) {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            if(j==cnt) {
                                imgArray.get(j).setImageResource(R.drawable.coffee2_1);
                                count.setText(++cnt + "");
                            }
                        });
                    }
                    else {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            if(j==cnt) {
                                imgArray.get(j).setImageResource(R.drawable.coffee2_2);
                                count.setText(++cnt + "");
                            }
                        });
                    }
                    break;
                case 2:
                    if(i%2==0) {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            if(j==cnt) {
                                imgArray.get(j).setImageResource(R.drawable.coffee3_1);
                                count.setText(++cnt + "");
                            }
                        });
                    }
                    else {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            if(j==cnt) {
                                imgArray.get(j).setImageResource(R.drawable.coffee3_2);
                                count.setText(++cnt + "");
                            }
                        });
                    }
                    break;
                case 3:
                    if(i==13-1){//13번째
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            if(j==cnt) {
                                imgArray.get(j).setImageResource(R.drawable.frame56);
                                count.setText(++cnt + "");//
                            }
                        });
                    }
                    else if(i%2==0) {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            if(j==cnt) {
                                imgArray.get(j).setImageResource(R.drawable.coffee4_1);
                                count.setText(++cnt + "");
                            }
                        });
                    }
                    else {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            if(j==cnt) {
                                imgArray.get(j).setImageResource(R.drawable.coffee4_2);
                                count.setText(++cnt + "");
                            }
                        });
                    }
                    break;
                case 4:
                    if(i%2==0) {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            if(j==cnt) {
                                imgArray.get(j).setImageResource(R.drawable.coffee5_1);
                                count.setText(++cnt + "");
                            }
                        });
                    }
                    else {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            if(j==cnt) {
                                imgArray.get(j).setImageResource(R.drawable.coffee5_2);
                                count.setText(++cnt + "");
                            }
                        });
                    }
                    break;
                case 5:
                    if(i==24-1){//24번째
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            if(j==cnt) {
                                imgArray.get(j).setImageResource(R.drawable.frame56);
                                count.setText(++cnt + "");
                                reset();
                            }
                        });
                    }
                    else if(i%2==0) {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            if(j==cnt) {
                                imgArray.get(j).setImageResource(R.drawable.coffee6_1);
                                count.setText(++cnt + "");
                            }
                        });
                    }
                    else {
                        int j=i;//for문의 i 인식 못함
                        imgArray.get(j).setOnClickListener(view -> {
                            if(j==cnt) {
                                imgArray.get(j).setImageResource(R.drawable.coffee6_2);
                                count.setText(++cnt + "");
                            }
                        });
                    }
                    break;
            }
        }
    }
    private void reset(){

        for(int i=0;i<imgArray.size();i++){
            switch (i/4){//몇번째 줄인지
                case 0://멘 첫번째줄
                        imgArray.get(i).setImageResource(R.drawable.frame58);
                    break;
                case 1:
                        imgArray.get(i).setImageResource(R.drawable.frame57);
                    break;
                case 2:
                    imgArray.get(i).setImageResource(R.drawable.frame59);
                    break;
                case 3:
                    if(i==13-1){//13번째
                        imgArray.get(i).setImageResource(R.drawable.frame56_1);
                    }
                    else {
                        imgArray.get(i).setImageResource(R.drawable.frame42);
                    }
                    break;
                case 4:
                    imgArray.get(i).setImageResource(R.drawable.frame48);//클릭하면 이걸로 바꾼다.
                    break;
                case 5:
                    if(i==24-1){//24번째
                        imgArray.get(i).setImageResource(R.drawable.frame56_1);
                    }
                    else {
                        imgArray.get(i).setImageResource(R.drawable.frame50);
                    }
                    break;
            }
        }
        cnt=0;
        count.setText(cnt+"");
    }
}