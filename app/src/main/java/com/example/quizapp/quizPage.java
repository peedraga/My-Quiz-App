package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class quizPage extends AppCompatActivity {

    //call data class.
    data d = new data();

    //define score and count.
    int count=0;
    int score=0;
    int n = 0;
    int[] arr = new int[20];
    private int sec = 0;
    String time;
    String time_t;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page);

        running_Timer();

        RadioGroup option = findViewById(R.id.radioGroup);
        Button submit = findViewById(R.id.submit);
        submit.setOnClickListener(v -> {

            int selectedId= option.getCheckedRadioButtonId();
            if(selectedId!=-1){
                RadioButton op = findViewById(selectedId);
                count++;
                if(d.answer(n, (String) op.getText())){
                    score++;
                    displayScore(count, score);
                }
                else{
                    Toast.makeText(this, "Wrong answer", Toast.LENGTH_SHORT).show();
                    displayScore(count, score);
                }

                option.clearCheck();

                //generate random number
                Random rn = new Random();
                n = rn.nextInt(20) ;
                while(visited(n)){
                    n = rn.nextInt(20) ;
                }
                dataSetter(n);
            }
            else{
                Toast.makeText(quizPage.this, "Select an option..." ,Toast.LENGTH_LONG).show();
            }

            if(count>9){
                time = time_t;
                sec = 0;
                Intent intent = new Intent(this, popUp.class);
                // Start the receiver activity
                intent.putExtra("INT_VALUE", score);
                intent.putExtra("STRING_VALUE", time);
                startActivity(intent);

                popup(count);
            }
        });

        Button reset = findViewById(R.id.reset);
        reset(reset);
    }

    void dataSetter(int n){
        TextView ques = findViewById(R.id.question);
        ques.setText(d.question(n));

        TextView op1 = findViewById(R.id.radioButton2);
        op1.setText(d.option1(n));

        TextView op2 = findViewById(R.id.radioButton3);
        op2.setText(d.option2(n));

        TextView op3 = findViewById(R.id.radioButton4);
        op3.setText(d.option3(n));

        TextView op4 = findViewById(R.id.radioButton5);
        op4.setText(d.option4(n));
    }

    void displayScore(int cnt, int scr){
        TextView score = findViewById(R.id.score);
        String sc = "Score: "+ scr + "/" + cnt;
        score.setText(sc);
    }

    void reset(Button reset){
        reset.setOnClickListener(v->{
            displayScore(0,0);
            score=0;
            count=0;
            sec=0;
            visited(-1);

        });
    }

    void popup(int cnt){
        score=0;
        count=0;
        displayScore(0,0);
        dataSetter(0);
        visited(-1);
    }

    boolean visited(int n){
        arr[0]=1;
        if(n==-1){
            for(int i=0; i<20; i++){
                arr[i] = 0;
            }
        }
        else if(arr[n]==1){
            return true;
        }
        else{
            arr[n] = 1;
            return false;
        }
        return false;
    }


    private void running_Timer()
    {

        final TextView t_View = (TextView)findViewById(R.id.timerCount);
        final Handler handle = new Handler();

        handle.post(new Runnable() {
            @Override

            public void run()
            {
                int hrs = sec / 3600;
                int mins = (sec % 3600) / 60;
                int secs = sec % 60;

                time_t = String .format(Locale.getDefault(), "Time: %d:%02d:%02d", hrs,mins, secs);

                t_View.setText(time_t);
                sec++;
                //Log.i("Time", time_t);
                handle.postDelayed(this, 1000);
            }
        });
    }

}