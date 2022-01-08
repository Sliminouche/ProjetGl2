package com.example.istedynamyquel.ListeAdminReservations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.istedynamyquel.R;

import java.util.ArrayList;
import java.util.List;

public class adminReservation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_reservation);

        List<represente> representelist = new ArrayList<>();

        representelist.add(new represente("Peugeot","Messaoudi","Salim","12/12/2012","13/14/2020","voiture"));
        representelist.add(new represente("Renault","Grib","Malak","12/12/2012","20/11/2022","moto"));
        ListView location_list_view=findViewById(R.id.users_s_reservation);
        location_list_view.setAdapter(new location_adapter (this,representelist));
    }
}