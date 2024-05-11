package com.example.myfirstapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeText(R.color.blurple);
    }

    private void changeText(int colorId) {
        TextView textview = findViewById(R.id.centerTextView);
        textview.setText(R.string.hi);
        textview.setTextColor(getColor(colorId));

    }
}




