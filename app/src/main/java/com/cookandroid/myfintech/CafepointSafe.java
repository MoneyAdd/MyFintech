package com.cookandroid.myfintech;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CafepointSafe extends AppCompatActivity {

    private ImageView stemp1,stemp2,stemp3,stemp4,stemp5,stemp6,stemp7,stemp8,stemp9,stemp10,stemp11,stemp12,stemp13,stemp14,stemp15,stemp16,stemp17,stemp18,stemp19,stemp20;
   private  ImageView back, gone;
   private TextView textnum;

   ArrayList<ImageView> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafepoint_safe);

        back = findViewById(R.id.back);
        textnum = findViewById(R.id.textnum);

        arrayList.add(findViewById(R.id.stamp1));
        arrayList.add(findViewById(R.id.stamp2));
        arrayList.add(findViewById(R.id.stamp3));
        arrayList.add(findViewById(R.id.stamp4));
        arrayList.add(findViewById(R.id.stamp5));
        arrayList.add(findViewById(R.id.stamp6));
        arrayList.add(findViewById(R.id.stamp7));
        arrayList.add(findViewById(R.id.stamp8));
        arrayList.add(findViewById(R.id.stamp9));
        arrayList.add(findViewById(R.id.stamp10));
        arrayList.add(findViewById(R.id.stamp11));
        arrayList.add(findViewById(R.id.stamp12));
        arrayList.add(findViewById(R.id.stamp13));
        arrayList.add(findViewById(R.id.stamp14));
        arrayList.add(findViewById(R.id.stamp15));
        arrayList.add(findViewById(R.id.stamp16));
        arrayList.add(findViewById(R.id.stamp17));
        arrayList.add(findViewById(R.id.stamp18));
        arrayList.add(findViewById(R.id.stamp19));
        arrayList.add(findViewById(R.id.stamp20));




//     for(int i =0; i<20; i++) {
//         switch (i) {
//
//         }
//     }



//        stemp1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//               stemp1.setImageResource(R.drawable.frame29);
//               textnum.setText("1");
//            }
//        });
//
//        stemp2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                stemp2.setImageResource(R.drawable.frame30);
//                textnum.setText("2");
//            }
//        });
//
//        stemp3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                stemp3.setImageResource(R.drawable.frame29);
//                textnum.setText("3");
//            }
//        });
//
//        stemp4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                stemp4.setImageResource(R.drawable.frame30);
//                textnum.setText("4");
//            }
//        });
//
//        stemp5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                stemp5.setImageResource(R.drawable.frame33);
//                textnum.setText("5");
//            }
//        });
//
//        stemp6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                stemp6.setImageResource(R.drawable.frame36);
//                textnum.setText("6");
//            }
//        });
//
//        stemp7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                stemp7.setImageResource(R.drawable.frame33);
//                textnum.setText("7");
//            }
//        });
//        stemp8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                stemp8.setImageResource(R.drawable.frame36);
//                textnum.setText("8");
//            }
//        });
//
//        stemp9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                stemp9.setImageResource(R.drawable.frame37);
//                textnum.setText("9");
//            }
//        });
//
//        stemp10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                stemp10.setImageResource(R.drawable.frame40);
//                textnum.setText("10");
//            }
//        });
//
//        stemp11.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                stemp11.setImageResource(R.drawable.frame37);
//                textnum.setText("11");
//            }
//        });
//
//        stemp12.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                stemp12.setImageResource(R.drawable.frame40);
//                textnum.setText("12");
//
//                stemp13.setImageResource(R.drawable.frame56);
//                textnum.setText("0");
//                AlertDialog.Builder builder = new AlertDialog.Builder(CafepointSafe.this);
//                builder.setTitle("리텀블 포인트 달성!!").setMessage("텀블러는 무려 일회용 플라스틱컵보다 13배의 /n 이산화탄소를 발생시킨다는 사실을 알고 계셨나요? /n " +
//                        "텀블러의 사용도 좋지만, 지속적인 이용으로 진정한 환경을 위한 운동을 즐겨봐요!! ").setPositiveButton("리텀블 뽑기", null).create().show();
//                AlertDialog alertDialog = builder.create();
//                alertDialog.show();
//
//                stemp1.setImageResource(R.drawable.zeroline);
//                stemp2.setImageResource(R.drawable.zeroline);
//                stemp3.setImageResource(R.drawable.zeroline);
//                stemp4.setImageResource(R.drawable.zeroline);
//                stemp5.setImageResource(R.drawable.zeroline);
//                stemp6.setImageResource(R.drawable.zeroline);
//                stemp7.setImageResource(R.drawable.zeroline);
//                stemp8.setImageResource(R.drawable.zeroline);
//                stemp9.setImageResource(R.drawable.zeroline);
//                stemp10.setImageResource(R.drawable.zeroline);
//                stemp11.setImageResource(R.drawable.zeroline);
//                stemp12.setImageResource(R.drawable.zeroline);
//            }
//        });







    }


}