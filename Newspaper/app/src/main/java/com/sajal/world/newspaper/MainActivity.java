package com.sajal.world.newspaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1,button2,button3,button4,button5,button6,button7,button8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button) findViewById(R.id.b1);
        button2=(Button) findViewById(R.id.b2);
        button3=(Button) findViewById(R.id.b3);
        button4=(Button) findViewById(R.id.b4);
        button5=(Button) findViewById(R.id.b5);
        button6=(Button) findViewById(R.id.b6);
        button7=(Button) findViewById(R.id.b7);
        button8=(Button) findViewById(R.id.b8);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.b1){
            Intent i=new Intent(MainActivity.this,Main2Activity.class);
            String one="http://www.bhorerkagoj.net/";
            i.putExtra("One",one);
            startActivity(i);

        }if(view.getId()==R.id.b2){
            Intent i=new Intent(MainActivity.this,Main2Activity.class);
            String one="http://www.prothom-alo.com/";
            i.putExtra("One",one);
            startActivity(i);

        }if(view.getId()==R.id.b3){
            Intent i=new Intent(MainActivity.this,Main2Activity.class);
            String one="https://www.dailyinqilab.com/";
            i.putExtra("One",one);
            startActivity(i);

        }if(view.getId()==R.id.b4){
            Intent i=new Intent(MainActivity.this,Main2Activity.class);
            String one="http://www.jaijaidinbd.com/";
            i.putExtra("One",one);
            startActivity(i);

        }if(view.getId()==R.id.b5){
            Intent i=new Intent(MainActivity.this,Main2Activity.class);
            String one="hello there";
            i.putExtra("One",one);
            startActivity(i);

        }if(view.getId()==R.id.b6){
            Intent i=new Intent(MainActivity.this,Main2Activity.class);
            String one="hello there";
            i.putExtra("One",one);
            startActivity(i);

        }if(view.getId()==R.id.b7){
            Intent i=new Intent(MainActivity.this,Main2Activity.class);
            String one="hello there";
            i.putExtra("One",one);
            startActivity(i);

        }if(view.getId()==R.id.b8){
            Intent i=new Intent(MainActivity.this,Main2Activity.class);
            String one="https://www.skype.com/en/";
            i.putExtra("One",one);
            startActivity(i);
        }
    }
}
