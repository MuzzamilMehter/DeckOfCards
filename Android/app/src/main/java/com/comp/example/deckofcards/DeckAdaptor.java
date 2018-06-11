package com.comp.example.deckofcards;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DeckAdaptor extends BaseAdapter {
    private Context context;
    private ArrayList<DeckModel> deckArrayList;

    public DeckAdaptor(Context context,
                       ArrayList<DeckModel> deckArrayList) {
        this.context = context;
        this.deckArrayList = deckArrayList;
    }

    @Override
    public int getCount() {
        return deckArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return deckArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            convertView = inflater.inflate(R.layout.deck_of_cards, null);
            holder = new ViewHolder();
            holder.suit_image = (ImageView) convertView.findViewById(R.id.suit_image);
            holder.rules_text = (TextView) convertView.findViewById(R.id.rules_txt);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        if (deckArrayList.get(position).stuit.equals("Hearts")) {
            holder.suit_image.setImageResource(R.mipmap.heart);
        } else if (deckArrayList.get(position).stuit.equals("Spades")) {
            holder.suit_image.setImageResource(R.mipmap.spades);
        } else if (deckArrayList.get(position).stuit.equals("Diamonds")) {
            holder.suit_image.setImageResource(R.mipmap.dimands);
        } else if (deckArrayList.get(position).stuit.equals("Clubs")) {
            holder.suit_image.setImageResource(R.mipmap.club);
        }

        holder.rules_text.setText(deckArrayList.get(position).rule);

        return convertView;
    }

    static class ViewHolder {
        private ImageView suit_image;
        private TextView rules_text;
    }
}
