package com.cookandroid.myfintech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class StampActivity extends AppCompatActivity {
    ImageView stemp1,stemp2,stemp3,stemp4,stemp5,stemp6,stemp7,stemp8,stemp9,stemp10,stemp11,stemp12,stemp13,stemp14,stemp15,stemp16,stemp17,stemp18,stemp19,stemp20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stamp);

        imgSet();
    }
    private void imgSet(){
        stemp1= findViewById(R.id.stamp1);
        stemp2= findViewById(R.id.stamp2);
        stemp3= findViewById(R.id.stamp3);
        stemp4= findViewById(R.id.stamp4);
        stemp5= findViewById(R.id.stamp5);
        stemp6= findViewById(R.id.stamp6);
        stemp7= findViewById(R.id.stamp7);
        stemp8= findViewById(R.id.stamp8);
        stemp9= findViewById(R.id.stamp9);
        stemp10= findViewById(R.id.stamp10);
        stemp11= findViewById(R.id.stamp11);
        stemp12= findViewById(R.id.stamp12);
        stemp13= findViewById(R.id.stamp13);
        stemp14= findViewById(R.id.stamp14);
        stemp15= findViewById(R.id.stamp15);
        stemp16= findViewById(R.id.stamp16);
        stemp17= findViewById(R.id.stamp17);
        stemp18= findViewById(R.id.stamp18);
        stemp19= findViewById(R.id.stamp19);
        stemp20= findViewById(R.id.stamp20);
    }
}