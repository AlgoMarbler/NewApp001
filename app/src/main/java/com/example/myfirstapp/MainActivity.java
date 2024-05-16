package com.example.myfirstapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int goldAmount = 0;
    int increment = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button2 = findViewById(R.id.gainButton);
        Button buttonUpgrade = findViewById(R.id.upgrade);
        Button buttonUpgrade2 = findViewById(R.id.upgrade2);
        Button buttonUpgrade3 = findViewById(R.id.upgrade3);
        Button buttonUpgrade4 = findViewById(R.id.upgrade4);
        Button buttonUpgrade5 = findViewById(R.id.upgrade5);
        button2.setOnClickListener(v -> changeAmount());

        buttonUpgrade.setOnClickListener(v -> changeIncrement(50, 1));
        buttonUpgrade2.setOnClickListener(v -> changeIncrement(400, 5));
        buttonUpgrade3.setOnClickListener(v -> changeIncrement(1250, 12));
        buttonUpgrade4.setOnClickListener(v -> changeIncrement(7000, 55));
        buttonUpgrade5.setOnClickListener(v -> changeIncrement(35000, 220));
    }


    private void changeIncrement(int price,int amountAdded) {
        if(goldAmount >= price) {
            increment += amountAdded;
            goldAmount -= price;
            updateStats();
        }
    }

    private void changeAmount() {
        goldAmount += increment;
        updateStats();
    }

    private void updateStats() {
        TextView incrementTextView = findViewById(R.id.incrementDisplay);
        incrementTextView.setText("Per click: " + increment);
        TextView textView = findViewById(R.id.goldDisplay);
        textView.setText(String.valueOf(goldAmount));
    }

}
