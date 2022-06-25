package com.cookandroid.myfintech;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;

import javax.net.ssl.HttpsURLConnection;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        /*try {
            String str = new Http().execute("test=value&test 1=value1"). get();
            Log.d("결과값 데이터 >>", str);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }*/

        findViewById(R.id.goStemp).setOnClickListener(view ->{
            Intent intent = new Intent(this, CafePoint_Safe.class);
            startActivity(intent);

        });
        findViewById(R.id.viewBarCode).setOnClickListener(view ->{
            Intent intent = new Intent(this, CafePoint_Safe.class);
            intent.putExtra("qr",true);
            startActivity(intent);

        });
        findViewById(R.id.imgStar).setOnClickListener(view->{
            Intent intent = new Intent(this, CafePoint.class);
            startActivity(intent);
        });
        findViewById(R.id.imgPerson).setOnClickListener(view->{
            Intent intent = new Intent(this, Mape.class);
            startActivity(intent);
        });
    }
    public class configs extends Application {
        private String Url = "";
        private String strPhone = "";

        //서버 주소를 설정
        public String getUrl(){return Url;}
        public void setUrl(String Url){this.Url = Url;}

        //내 폰번호를 설정.

        public String getPhone(){return strPhone;}

        public void setPhone(String Phone){this.strPhone = Phone;}
    }
    public class Http extends AsyncTask<String, Void, String>{
        private configs conf;
        private String ip;
        public void setip(String ip){this.ip=ip;}
        public Http(String ip){this.ip=ip;}

        @Override
        protected String doInBackground(String... sId) {
            String sResult = "Error";
            try{
                conf = new configs();
                conf.setUrl(ip);

                URL url = new URL(conf.getUrl());
                HttpURLConnection conn=(HttpsURLConnection) url.openConnection();

                conn.setConnectTimeout(10000);
                conn.setReadTimeout(10000);
                conn.setUseCaches(false);

                conn.setRequestMethod("POST");
                String body = sId[0];

                OutputStreamWriter osw = new OutputStreamWriter(conn.getOutputStream());
                osw.write(body);
                osw.flush();

                InputStreamReader tmp = new InputStreamReader(conn.getInputStream(),"UTF-8");
                BufferedReader reader = new BufferedReader(tmp);
                StringBuilder builder = new StringBuilder();
                String str;
                while((str = reader.readLine())!=null){
                    builder.append(str);
                }
                sResult = builder.toString();

            } catch (MalformedURLException e) {
                Log.d("MalformedURLException",e.toString());
                e.printStackTrace();
            } catch (IOException e) {
                Log.d("IOExecption",e.toString());
                e.printStackTrace();
            }

            return sResult;
        }
    }
}