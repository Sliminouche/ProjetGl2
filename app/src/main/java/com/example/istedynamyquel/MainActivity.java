package com.example.istedynamyquel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        adapter myAdapter = new adapter(MainActivity.this, posts);
        actualite.setAdapter(myAdapter);
    }
}