package com.example.istedynamyquel.ListeDynamique1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.istedynamyquel.R;
import com.example.istedynamyquel.reservationlist;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ImageView versrese;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        versrese = findViewById(R.id.gotoreseliste);


        RecyclerView actualite = findViewById(R.id.actualite);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        actualite.setLayoutManager(layoutManager);

        ArrayList<card_model> posts = new ArrayList<>();

        posts.add(new card_model("Peugeot 3008","Permis B","Une automobile, ou voiture, est un véhicule  Ce véhicule est Une automobile, ou voiture, est un véhicule  Ce véhicule est", R.drawable.voiture));
        posts.add(new card_model("Voiture de luxe","Permis B","Une automobile, ou voiture, est un véhicule  Ce véhicule est Une automobile, ou voiture, est un véhicule  Ce véhicule est", R.drawable.voiture_luxe));
        posts.add(new card_model("Camion Mercedes","A Permis poids lourd","Une automobile, ou voiture, est un véhicule  Ce véhicule est Une automobile, ou voiture, est un véhicule  Ce véhicule est", R.drawable.camion));
        posts.add(new card_model("Moto BMW", "Permis Motos","Une automobile, ou voiture, est un véhicule  Ce véhicule est Une automobile, ou voiture, est un véhicule  Ce véhicule est", R.drawable.moto));
        posts.add(new card_model("Minibus Nissan","Permis B","RUne automobile, ou voiture, est un véhicule  Ce véhicule est Une automobile, ou voiture, est un véhicule  Ce véhicule est", R.drawable.minibus));
        posts.add(new card_model("Bateaux Yacht","Permis bateaux","RUne automobile, ou voiture, est un véhicule  Ce véhicule est Une automobile, ou voiture, est un véhicule  Ce véhicule est", R.drawable.bateaux));
        posts.add(new card_model("Bateaux Yacht","Permis bateaux","RUne automobile, ou voiture, est un véhicule  Ce véhicule est Une automobile, ou voiture, est un véhicule  Ce véhicule est", R.drawable.bateaux));

        adapter myAdapter = new adapter(MainActivity.this, posts);
        actualite.setAdapter(myAdapter);



        versrese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, reservationlist.class);
                startActivity(i);
            }
        }
        );
    }
;
}