package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(v->{
            Intent i = new Intent(getApplicationContext(), quizPage.class);
            startActivity(i);
        });

        Button rule = findViewById(R.id.rule);
        rule.setOnClickListener(v->{
            Intent i = new Intent(getApplicationContext(), rules.class);
            startActivity(i);
        });
    }
}