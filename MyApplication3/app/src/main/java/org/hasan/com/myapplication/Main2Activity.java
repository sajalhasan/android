package org.hasan.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
EditText M2email,M2username,M2password,M2mobile;
    TextView M2signup,M2haveAlready;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

      /*  M2email=(EditText)findViewById(R.id.emailR);
        M2username=(EditText)findViewById(R.id.usernameR);
        M2password=(EditText)findViewById(R.id.passwordR);
        M2mobile=(EditText)findViewById(R.id.mobilephone);

        M2signup=(TextView)findViewById(R.id.signup);
        M2haveAlready=(TextView)findViewById(R.id.haveAccount);*/
    }
}
