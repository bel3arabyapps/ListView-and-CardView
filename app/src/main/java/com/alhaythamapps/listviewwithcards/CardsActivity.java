package com.alhaythamapps.listviewwithcards;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * @author Alhaytham Alfeel on 10/10/2016.
 */
public class CardsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);

        ListView lvCards = (ListView) findViewById(R.id.list_cards);
        CardsAdapter adapter = new CardsAdapter(this);

        lvCards.setAdapter(adapter);
        adapter.addAll(new CardModel(R.drawable.mercury, R.string.mercury, R.string.mercury_sub),
                new CardModel(R.drawable.venus, R.string.venus, R.string.venus_sub),
                new CardModel(R.drawable.earth, R.string.earth, R.string.earth_sub),
                new CardModel(R.drawable.mars, R.string.mars, R.string.mars_sub),
                new CardModel(R.drawable.jupiter, R.string.jupiter, R.string.jupiter_sub),
                new CardModel(R.drawable.saturn, R.string.saturn, R.string.saturn_sub),
                new CardModel(R.drawable.uranus, R.string.uranus, R.string.uranus_sub),
                new CardModel(R.drawable.neptune, R.string.neptune, R.string.neptune_sub),
                new CardModel(R.drawable.pluto, R.string.pluto, R.string.pluto_sub));
    }
}
