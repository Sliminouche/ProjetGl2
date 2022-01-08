package com.example.istedynamyquel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.istedynamyquel.ListeAdminReservations.adminReservation;

public class add_vehicule extends AppCompatActivity {

    private ImageView userslist,gotoreseliste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_vehicule);
        gotoreseliste = findViewById(R.id.gotoreseliste);
        userslist=findViewById(R.id.gotousers);
        userslist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(add_vehicule.this, userslist.class);
                startActivity(i);
            }
        }
        );

        gotoreseliste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(add_vehicule.this, adminReservation.class);
                startActivity(i);
            }
        }
        );
    }
}