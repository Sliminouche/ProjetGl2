package com.example.istedynamyquel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {
        startActivity(new Intent(splash_screen.this,FirstPage.class));
        finish();
    }
},2000);



  /*      Thread ddd = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(1000);
                }catch(Exception e){

                }finally{
                    Intent i = new Intent(splash_screen.this,MainActivity.class);

                }
            }
        };*/

    }
}



