package com.example.istedynamyquel.ListeDynamique1;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView ;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.istedynamyquel.R;

public class viewUser extends RecyclerView.ViewHolder {
    public TextView nom,permisRequis, description ;
    public ImageView publication ;

    public viewUser (@NonNull View itemView){
        super(itemView);

        nom = itemView.findViewById(R.id.nom_user);
        permisRequis = itemView.findViewById(R.id.prenom_user);
        description = itemView.findViewById(R.id.numero_user);
        publication = itemView.findViewById(R.id.publication);
    }
}
