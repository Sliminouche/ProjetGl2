package com.example.istedynamyquel.models;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.istedynamyquel.R;

import java.util.List;

public class HighTechItemAdapter extends BaseAdapter{
    private Context context;
    private List<HighTechModel> highTechModelList;
    private LayoutInflater inflater;

    public HighTechItemAdapter(Context contexte, List<HighTechModel> highTechModelList) {
        this.context = contexte;
        this.highTechModelList = highTechModelList;
        this.inflater=LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return highTechModelList.size();
    }

    @Override
    public Object getItem(int position) {
        return highTechModelList.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewgroup) {
        view = inflater.inflate(R.layout.adapter_item2,null);


        HighTechModel currentItem = (HighTechModel) getItem(i);

        String itemName = currentItem.getName();
        String mnemonic = currentItem.getMnemonic();

        TextView itemNameView = view.findViewById(R.id.item_name);
        itemNameView.setText(itemName);

        ImageView ItemIconView = view.findViewById(R.id.vehiculdansrese);
        String resourceName = mnemonic ;
        int resId= context.getResources().getIdentifier(resourceName,"drawable", context.getPackageName());
        ItemIconView.setImageResource(resId);
        return view ;
    }
}
