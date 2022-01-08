package com.example.istedynamyquel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.istedynamyquel.models.HighTechItemAdapter;
import com.example.istedynamyquel.models.HighTechModel;
import com.example.istedynamyquel.models2.HighTechItemAdapter2;
import com.example.istedynamyquel.models2.HighTechModel2;

import java.util.ArrayList;
import java.util.List;

public class userslist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userslist);

        List<HighTechModel2> highTechItemList2 = new ArrayList<>();
        highTechItemList2.add(new HighTechModel2("Slim","Messaoudi","0554664213","profil"));

        ListView UsersListView = findViewById(R.id.reservations);
        UsersListView.setAdapter(new HighTechItemAdapter2(this,highTechItemList2));
    }
}