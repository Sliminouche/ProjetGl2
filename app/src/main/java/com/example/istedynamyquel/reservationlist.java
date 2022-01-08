package com.example.istedynamyquel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.istedynamyquel.models.HighTechItemAdapter;
import com.example.istedynamyquel.models.HighTechModel;

import java.util.ArrayList;
import java.util.List;

public class reservationlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservationlist);

        List<HighTechModel> highTechItemList = new ArrayList<>();
        highTechItemList.add(new HighTechModel("Voiture","voiture"));
        highTechItemList.add(new HighTechModel("Camion","camion"));
        highTechItemList.add(new HighTechModel("Bateau","bateaux"));
        highTechItemList.add(new HighTechModel("Minibus","minibus"));

        ListView reservationListView = findViewById(R.id.reservations);
        reservationListView.setAdapter(new HighTechItemAdapter (this,highTechItemList ));
    }
}