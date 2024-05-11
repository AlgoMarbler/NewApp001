package com.example.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeButton(R.color.blurple, R.string.button_text);
    }

    private void changeText(int colorId) {
        TextView textview = findViewById(R.id.centerTextView);
        textview.setText(R.string.hi);
        textview.setTextColor(getColor(colorId));

    }

    private void changeButton(int colorId, int text) {
        Button button = findViewById(R.id.button0001);
        button.setOnClickListener(v->{
            button.setText(text);
            button.setTextColor(getColor(colorId));
        });
    }
}




