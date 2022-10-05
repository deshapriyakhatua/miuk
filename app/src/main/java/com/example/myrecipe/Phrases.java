package com.example.myrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        Intent intent = getIntent();
        TextView textView = findViewById(R.id.textViewPhrases);
        textView.setText(intent.getStringExtra("key1"));
    }
}