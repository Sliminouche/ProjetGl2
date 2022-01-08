package com.example.istedynamyquel.models2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.istedynamyquel.R;

import java.util.List;

public class HighTechItemAdapter2 extends BaseAdapter{
    private Context context2;
    private List<HighTechModel2> highTechModelList2;
    private LayoutInflater inflater2;

    public HighTechItemAdapter2(Context context2, List<HighTechModel2> highTechModelList2) {
        this.context2 = context2;
        this.highTechModelList2 = highTechModelList2;
        this.inflater2=LayoutInflater.from(context2);
    }


    @Override
    public int getCount() {
        return highTechModelList2.size();
    }

    @Override
    public Object getItem(int position) {
        return highTechModelList2.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View vieww, ViewGroup viewgroup) {
        vieww = inflater2.inflate(R.layout.users,null);


        HighTechModel2 currentItem = (HighTechModel2) getItem(i);

        String itemName2 = currentItem.getName_user();
        String itemPrenom2 = currentItem.getPrenom_user();
        String itemNumero2 = currentItem.getNumero_user();
        String mnemonic2 = currentItem.getMnemonic2();

        TextView itemNameView = vieww.findViewById(R.id.nom_user_list);
        itemNameView.setText(itemName2);

        TextView itemPrenomView = vieww.findViewById(R.id.prenom_user_list);
        itemPrenomView.setText(itemPrenom2);

        TextView itemNumeroView = vieww.findViewById(R.id.numero_user_list);
        itemNumeroView.setText(itemNumero2);

        ImageView ItemIconView = vieww.findViewById(R.id.profil_user_list);
        String resourceName = mnemonic2 ;
        int resId2= context2.getResources().getIdentifier(resourceName,"drawable", context2.getPackageName());
        ItemIconView.setImageResource(resId2);
        return vieww ;
    }
}
