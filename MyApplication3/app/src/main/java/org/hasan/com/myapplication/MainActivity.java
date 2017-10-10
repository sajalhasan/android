package org.hasan.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button Mlogin;
    EditText Musername,Mpassword;
    TextView Msignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mlogin=(Button)findViewById(R.id.login);
        Musername=(EditText)findViewById(R.id.username);
        Mpassword=(EditText)findViewById(R.id.password);
        Msignup=(TextView)findViewById(R.id.registration);

    }
}
