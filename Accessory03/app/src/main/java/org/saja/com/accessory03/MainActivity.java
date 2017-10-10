package org.saja.com.accessory03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText Musername,Mpassword;
    TextView Mlogin,Msignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Musername=(EditText)findViewById(R.id.username);
        Mpassword=(EditText)findViewById(R.id.password);

        Mlogin=(TextView)findViewById(R.id.blogin);
        Msignup=(TextView)findViewById(R.id.bsignup);
        signup();
        signin();
    }

    public void signin() {
        Mlogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllFunction.class);
                startActivity(intent);
            }
        });
    }
    public void signup(){
        Msignup.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,registration.class);
                startActivity(intent);
            }
        });
    }
}
