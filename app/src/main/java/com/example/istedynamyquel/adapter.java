package com.example.istedynamyquel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<viewUser> {
    Context context;
    ArrayList<card_model> data;

    public adapter(Context context, ArrayList<card_model> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public viewUser onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_view,parent,false);
        return new viewUser(view);


    }

    @Override
    public void onBindViewHolder(@NonNull viewUser holder, int position) {
       holder.nom.setText(data.get(position).getNom());
       holder.permisRequis.setText(data.get(position).getPermisRequis());
        holder.description.setText(data.get(position).getDescription());
       holder.publication.setImageResource(data.get(position).getPublication());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
