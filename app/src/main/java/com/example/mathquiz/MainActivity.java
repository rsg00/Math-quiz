package com.example.mathquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1, textView2, textView3;
    Button startButton, answerButton1, answerButton2, nextTurn, resetButton;

    Questions2 q2 = new Questions2();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.Text1);
        textView2 = findViewById(R.id.Text2);
        textView3 = findViewById(R.id.Text3);

        startButton = findViewById(R.id.StartButton);
        answerButton1 = findViewById(R.id.AnswerButton1);
        answerButton2 = findViewById(R.id.AnswerButton2);
        nextTurn = findViewById(R.id.nextTurnButton);
        resetButton = findViewById(R.id.resetButton);


        answerButton1.setVisibility(View.INVISIBLE);
        answerButton2.setVisibility(View.INVISIBLE);
        nextTurn.setVisibility(View.INVISIBLE);
        resetButton.setVisibility(View.INVISIBLE);


       startButton.setOnClickListener(v -> {

         textView2.setText("");
            startButton.setVisibility(View.INVISIBLE);
           answerButton1.setVisibility(View.VISIBLE);
           answerButton2.setVisibility(View.VISIBLE);
           nextTurn.setVisibility(View.VISIBLE);
           resetButton.setVisibility(View.VISIBLE);
            onTurn();
        });

       nextTurn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                onTurn();
                textView2.setText("");
           }
       });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerButton1.setVisibility(View.INVISIBLE);
                answerButton2.setVisibility(View.INVISIBLE);
                nextTurn.setVisibility(View.INVISIBLE);
                resetButton.setVisibility(View.INVISIBLE);
        onFinish();
            }
    });


        answerButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button buttonClicked=(Button)v;
                int answerSelected = Integer.parseInt(buttonClicked.getText().toString());
                textView2.setText(Integer.toString(answerSelected));
                textView3.setText(Boolean.toString(q2.checkAnswer(answerSelected)));

            }
        });


       answerButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Button buttonClicked=(Button)v;
                int answerSelected = Integer.parseInt(buttonClicked.getText().toString());
                textView2.setText(Integer.toString(answerSelected));
                textView3.setText(Boolean.toString(q2.checkAnswer(answerSelected)));
            }
        });


           }

    private void onTurn() {
       q2.makeNewQuestion();
   //  int answer = q2.getCurrentQuestion().getAnswer();
  String question = q2.getCurrentQuestion().getQuestionPhrase();
  int[] answerpos = q2.getCurrentQuestion().getAnswerArray();


     textView1.setText(question);

        textView3.setText("");

        answerButton1.setText(Integer.toString(answerpos[0]));
        answerButton2.setText(Integer.toString(answerpos[1]));

    }

    private void onFinish(){
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startButton.setVisibility(View.VISIBLE);
                textView1.setText("");
                textView2.setText("");
                textView3.setText("");
                answerButton1.setText("");
                answerButton2.setText("");
            }
        }, 0);
    };


}