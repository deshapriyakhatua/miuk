package com.example.myrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView numbersBtn;
    private TextView phrasesBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // opening Numbers Activity---
        Intent intentColors = new Intent(this, Numbers.class);
        numbersBtn = findViewById(R.id.textView1);
        numbersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"opening the list of numbers",Toast.LENGTH_SHORT).show();

                startActivity(intentColors);
            }
        });

        // Opening Phrases Activity---
        Intent intentPhrases = new Intent(this,Phrases.class);
        phrasesBtn  = findViewById(R.id.textView4);
        phrasesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"opening Phrases Activity",Toast.LENGTH_SHORT).show();

                intentPhrases.putExtra("key1","Phrases");
                startActivity(intentPhrases);
            }
        });
    }


}