package com.example.istedynamyquel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginAdmin extends AppCompatActivity {
    public TextView loginadmin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);
        loginadmin=findViewById(R.id.login_adminpage);
        loginadmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginAdmin.this, add_vehicule.class);
                startActivity(i);
            }
        }
        );
    }
}