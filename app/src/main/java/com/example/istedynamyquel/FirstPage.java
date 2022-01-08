package com.example.istedynamyquel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.istedynamyquel.ListeDynamique1.MainActivity;

public class FirstPage extends AppCompatActivity {
    public TextView createaccount,adminlog,login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        login = findViewById(R.id.login_firstpage);
        createaccount = findViewById(R.id.createAccount);
        adminlog= findViewById(R.id.adminlogin);


        createaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent i = new Intent(FirstPage.this,registration.class);
             startActivity(i);
            }
        }
        );
        adminlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FirstPage.this,LoginAdmin.class);
                startActivity(i);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FirstPage.this, MainActivity.class);
                startActivity(i);
            }
        });




    }
}