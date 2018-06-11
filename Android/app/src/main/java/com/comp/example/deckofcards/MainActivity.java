package com.comp.example.deckofcards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView deckList;
    private ArrayList<DeckModel> deckModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
        deckModelArrayList = new ArrayList<>();

        for (String suit : suits) {
            for (String rank : ranks) {
                DeckModel deckModel = new DeckModel();
                deckModel.rule = rank;
                deckModel.stuit = suit;
                deckModelArrayList.add(deckModel);
                Log.i("MainActivity",rank);
                Log.i("MainActivity",suit);
            }
        }
        deckList = (ListView) findViewById(R.id.deck_list);
        DeckAdaptor deckAdaptor = new DeckAdaptor(MainActivity.this, deckModelArrayList);
        deckList.setAdapter(deckAdaptor);

    }
}
