package com.sajal.world.multchoseapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button answer1,answer2,answer3,answer4;
    TextView score,question;

    private questionClass mQuestions=new questionClass();

    private  String mAnswer;
    private int mScore = 0;
    private int mQuestionLength=mQuestions.mQuestions.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        answer1=(Button)findViewById(R.id.answer1);
        answer2=(Button)findViewById(R.id.answer2);
        answer3=(Button)findViewById(R.id.answer3);
        answer4=(Button)findViewById(R.id.answer4);

        score=(TextView)findViewById(R.id.score);
        question=(TextView)findViewById(R.id.question);
        r=new Random();
        //score.setText(mScore);

        updateQuestion(r.nextInt(mQuestionLength));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer1.getText().equals(mAnswer) ){
                   // mScore++;
                   // score.setText(mScore);
                    Toast.makeText(MainActivity.this,"true",Toast.LENGTH_LONG).show();
                    updateQuestion(r.nextInt(mQuestionLength));
                }else{
                        Toast.makeText(MainActivity.this,"error",Toast.LENGTH_LONG).show();

                }
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer2.getText().equals(mAnswer) ){
                 //   mScore++;
                  //  score.setText(mScore);
                    Toast.makeText(MainActivity.this,"true",Toast.LENGTH_SHORT).show();
                    updateQuestion(r.nextInt(mQuestionLength));
                }else{
                    Toast.makeText(MainActivity.this,"error",Toast.LENGTH_SHORT).show();
                   // updateQuestion(r.nextInt(mQuestionLength));
                }
            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer3.getText().equals(mAnswer) ){
                    //mScore++;
                   // score.setText(mScore);
                    Toast.makeText(MainActivity.this,"true",Toast.LENGTH_SHORT).show();
                    updateQuestion(r.nextInt(mQuestionLength));
                }else{
                    Toast.makeText(MainActivity.this,"error",Toast.LENGTH_SHORT).show();
                    //updateQuestion(r.nextInt(mQuestionLength));
                }
            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer3.getText().equals(mAnswer) ){
                    //mScore++;
                   // score.setText(mScore);

                    Toast.makeText(MainActivity.this,"Right",Toast.LENGTH_SHORT).show();
                    updateQuestion(r.nextInt(mQuestionLength));
                }else{
                    Toast.makeText(MainActivity.this,"error",Toast.LENGTH_SHORT).show();
                    //updateQuestion(r.nextInt(mQuestionLength));
                }
            }
        });
    }
    private void updateQuestion(int num)
    {
        question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));

        mAnswer=mQuestions.getCorrectAnswer(num);

    }

}
