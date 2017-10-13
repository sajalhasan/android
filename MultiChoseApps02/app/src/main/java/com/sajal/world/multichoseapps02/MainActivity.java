package com.sajal.world.multichoseapps02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView mScore,mQuestion;
    Button mAnswer1,mAnswer2,mAnswer3;

   public int point=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScore=(TextView)findViewById(R.id.score);
        mQuestion=(TextView)findViewById(R.id.question);

        mAnswer1=(Button)findViewById(R.id.answer1);
        mAnswer2=(Button)findViewById(R.id.answer2);
        mAnswer3=(Button)findViewById(R.id.answer3);

        mAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=mAnswer1.getText().toString();
                point++;
                mScore.setText("Score: "+point);
                Toast.makeText(MainActivity.this,text,Toast.LENGTH_SHORT).show();
            }
        });
        mAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=mAnswer2.getText().toString();
                point++;
                mScore.setText("Score: "+point);
                Toast.makeText(MainActivity.this,text,Toast.LENGTH_SHORT).show();
            }
        });
        mAnswer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=mAnswer3.getText().toString();
                point++;
                mScore.setText("Score: "+point);
                Toast.makeText(MainActivity.this,text,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
