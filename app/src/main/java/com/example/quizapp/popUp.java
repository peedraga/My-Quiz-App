package com.example.quizapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class popUp extends quizPage {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup);

        //receive data from intent quizapp
        int sc = getIntent().getIntExtra("INT_VALUE", 0);
        String time = getIntent().getStringExtra("STRING_VALUE");

        //Log.i("this is dj", time);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int height = dm.heightPixels;
        int width = dm.widthPixels;

        getWindow().setLayout((int) (width*0.9), (int) (height*0.7));

        String shareIntent;

        TextView scor = findViewById(R.id.Scor);
        scor.setText("Your Score: "+ sc + "/10\nRequired Time: "+ time);

        TextView pasFail = findViewById(R.id.PassFail);

//        int unicode = 0x1F60A;
//        String emoji = new String(Character.toChars(unicode));
        if(sc>=7){
            shareIntent = "Wow! I have Won the Quiz \uD83E\uDD29 \nI have scored "+sc+" out of 10, within "+ time;
            pasFail.setText("Wow \n You are the Winner");
        }
        else{
            shareIntent = "Oh no! I need to practice more \uD83D\uDE22";
            pasFail.setText("Sorry \n You need to Sharp your Brain, so\n Practice more!");
        }

        Button quiz = (Button) findViewById(R.id.newQuiz);
        quiz.setOnClickListener(v -> {
            Intent i = new Intent(this, quizPage.class);
            startActivity(i);
        });


        Button share = findViewById(R.id.share);
        share.setOnClickListener(v -> {
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, shareIntent);
            sendIntent.setType("text/plain");
            Intent shareScore  = Intent.createChooser(sendIntent, null);
            startActivity(shareScore);
        });
    }
}
