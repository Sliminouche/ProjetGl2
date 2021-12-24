package com.example.istedynamyquel;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView ;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewUser extends RecyclerView.ViewHolder {
    public TextView nom,permisRequis, description ;
    public ImageView publication ;

    public viewUser (@NonNull View itemView){
        super(itemView);

        nom = itemView.findViewById(R.id.nom);
        permisRequis = itemView.findViewById(R.id.permis_requis);
        description = itemView.findViewById(R.id.description);
        publication = itemView.findViewById(R.id.publication);
    }
}
