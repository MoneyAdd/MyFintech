package com.cookandroid.myfintech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CafePoint_Safe extends AppCompatActivity {

    int cnt=0;
    TextView count;
    ArrayList<ImageView> imgArray = new ArrayList<ImageView>();
    ImageView getRetumbl,getRetumbl2,qr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_point_safe);

        textSet();
        arrayImgSet();
        imgSet();
        imgClickSet();

        isQr();

    }

    private void isQr() {
        Intent intent = getIntent();
        boolean bool = intent.getBooleanExtra("qr",false);
        if (bool==true){
            qr.setVisibility(View.VISIBLE);
        }
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
    private void imgSet() {
        getRetumbl = findViewById(R.id.getRetumbl);
        getRetumbl.setOnClickListener(view ->{
            getRetumbl.setVisibility(View.GONE);
        });

        getRetumbl2 = findViewById(R.id.getRetumbl2);
        getRetumbl2.setOnClickListener(view ->{
            getRetumbl2.setVisibility(View.GONE);
        });

        qr = findViewById(R.id.qr);
        qr.setOnClickListener(view ->{
            qr.setVisibility(View.GONE);
        });
    }
    private void imgClickSet(){

        for(int i=0;i<imgArray.size();i++){
            switch (i/4){//????????? ?????????
                case 0://??? ????????????
                    if(i%2==0) {//0?????? or 2??????
                        int j=i;//for?????? i ?????? ??????
                        imgArray.get(j).setOnClickListener(view -> {//??? ???????????????
                            if(j==cnt) {
                                imgArray.get(j).setImageResource(R.drawable.coffee1_1);//???????????? ????????? ?????????.
                                count.setText(++cnt + "");
                            }
                        });
                    }
                    else {
                        int j=i;//for?????? i ?????? ??????
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
                        int j=i;//for?????? i ?????? ??????
                        imgArray.get(j).setOnClickListener(view -> {
                            if(j==cnt) {
                                imgArray.get(j).setImageResource(R.drawable.coffee2_1);
                                count.setText(++cnt + "");
                            }
                        });
                    }
                    else {
                        int j=i;//for?????? i ?????? ??????
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
                        int j=i;//for?????? i ?????? ??????
                        imgArray.get(j).setOnClickListener(view -> {
                            if(j==cnt) {
                                imgArray.get(j).setImageResource(R.drawable.coffee3_1);
                                count.setText(++cnt + "");
                            }
                        });
                    }
                    else {
                        int j=i;//for?????? i ?????? ??????
                        imgArray.get(j).setOnClickListener(view -> {
                            if(j==cnt) {
                                imgArray.get(j).setImageResource(R.drawable.coffee3_2);
                                count.setText(++cnt + "");
                            }
                        });
                    }
                    break;
                case 3:
                    if(i==13-1){//13??????
                        int j=i;//for?????? i ?????? ??????
                        imgArray.get(j).setOnClickListener(view -> {
                            if(j==cnt) {
                                imgArray.get(j).setImageResource(R.drawable.frame56);
                                count.setText(++cnt + "");
                                getRetumbl.setVisibility(View.VISIBLE);
                            }
                        });
                    }
                    else if(i%2==0) {
                        int j=i;//for?????? i ?????? ??????
                        imgArray.get(j).setOnClickListener(view -> {
                            if(j==cnt) {
                                imgArray.get(j).setImageResource(R.drawable.coffee4_1);
                                count.setText(++cnt + "");
                            }
                        });
                    }
                    else {
                        int j=i;//for?????? i ?????? ??????
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
                        int j=i;//for?????? i ?????? ??????
                        imgArray.get(j).setOnClickListener(view -> {
                            if(j==cnt) {
                                imgArray.get(j).setImageResource(R.drawable.coffee5_1);
                                count.setText(++cnt + "");
                            }
                        });
                    }
                    else {
                        int j=i;//for?????? i ?????? ??????
                        imgArray.get(j).setOnClickListener(view -> {
                            if(j==cnt) {
                                imgArray.get(j).setImageResource(R.drawable.coffee5_2);
                                count.setText(++cnt + "");
                            }
                        });
                    }
                    break;
                case 5:
                    if(i==24-1){//24??????
                        int j=i;//for?????? i ?????? ??????
                        imgArray.get(j).setOnClickListener(view -> {
                            if(j==cnt) {
                                imgArray.get(j).setImageResource(R.drawable.frame56);
                                count.setText(++cnt + "");
                                getRetumbl2.setVisibility(View.VISIBLE);
                                reset();
                            }
                        });
                    }
                    else if(i%2==0) {
                        int j=i;//for?????? i ?????? ??????
                        imgArray.get(j).setOnClickListener(view -> {
                            if(j==cnt) {
                                imgArray.get(j).setImageResource(R.drawable.coffee6_1);
                                count.setText(++cnt + "");
                            }
                        });
                    }
                    else {
                        int j=i;//for?????? i ?????? ??????
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
            switch (i/4){//????????? ?????????
                case 0://??? ????????????
                    imgArray.get(i).setImageResource(R.drawable.frame58);
                    break;
                case 1:
                    imgArray.get(i).setImageResource(R.drawable.frame57);
                    break;
                case 2:
                    imgArray.get(i).setImageResource(R.drawable.frame59);
                    break;
                case 3:
                    if(i==13-1){//13??????
                        imgArray.get(i).setImageResource(R.drawable.frame56_1);
                    }
                    else {
                        imgArray.get(i).setImageResource(R.drawable.frame42);
                    }
                    break;
                case 4:
                    imgArray.get(i).setImageResource(R.drawable.frame48);//???????????? ????????? ?????????.
                    break;
                case 5:
                    if(i==24-1){//24??????
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