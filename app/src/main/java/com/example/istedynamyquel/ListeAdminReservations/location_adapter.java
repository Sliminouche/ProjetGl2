package com.example.istedynamyquel.ListeAdminReservations;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.istedynamyquel.R;

import java.util.List;

public class location_adapter extends BaseAdapter{
    private Context moncontext;
    private List<represente> representelist;
    private LayoutInflater moninfater;

    public location_adapter(Context moncontext, List<represente> representelist) {
        this.moncontext = moncontext;
        this.representelist = representelist;
        this.moninfater= LayoutInflater.from(moncontext);
    }



    @Override
    public int getCount() {
        return representelist.size() ;
    }

    @Override
    public Object getItem(int i) {
        return representelist.get(i);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int postion, View maview, ViewGroup viewGroup) {
        maview=moninfater.inflate(R.layout.adapter_reservation,null);

         represente newcurrentItem = (represente) getItem(postion);

        String itemLoca = newcurrentItem.getNom_de_loca();
        String itemNomLoca = newcurrentItem.getNom_loca();
        String itemPrenomLoca = newcurrentItem.getPrenom_loca();
        String itemDateLoca = newcurrentItem.getDate_rese();
        String itemDateFinLoca = newcurrentItem.getDate_fin_rese();
        String photoloca = newcurrentItem.getPhotoloca();

        TextView itemLocaView = maview.findViewById(R.id.vehicule_of_reservation);
        itemLocaView.setText(itemLoca);

        TextView itemNomLocaView = maview.findViewById(R.id.nom_loca);
        itemNomLocaView.setText(itemNomLoca);

        TextView itemPrenomLocaView = maview.findViewById(R.id.prenom_loca);
        itemPrenomLocaView.setText(itemPrenomLoca);

        TextView itemDateLocaView = maview.findViewById(R.id.date_de_rese);
        itemDateLocaView.setText(itemDateLoca);

        TextView itemDateFinLocaView = maview.findViewById(R.id.date_fin_de_rese);
        itemDateFinLocaView.setText(itemDateFinLoca);

        ImageView photolocaView = maview.findViewById(R.id.vehicule_icon);
        String newressourceName = photoloca;
        int maresId=moncontext.getResources().getIdentifier(newressourceName,"drawable",moncontext.getPackageName());
        photolocaView.setImageResource(maresId);



        return maview;
    }
}
