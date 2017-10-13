package org.hasan.com.backactivitybutton;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);


        showRun();
    }

    public void showRun()
    {
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String url="https://www.google.com/";
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("link",url);
                startActivity(intent);
            }
        });
    }
}
