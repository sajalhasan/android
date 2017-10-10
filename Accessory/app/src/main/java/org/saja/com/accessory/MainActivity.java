package org.saja.com.accessory;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText username1,password1;
    TextView login1,signup1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username1=(EditText)findViewById(R.id.username);
        password1=(EditText)findViewById(R.id.password);
        login1=(TextView) findViewById(R.id.blogin);
        signup1=(TextView) findViewById(R.id.bsignup);
        b=(Button)findViewById(R.id.button);

    }
public void login(View view){
  b.setOnClickListener(new View.OnClickListener(){

      @Override
      public void onClick(View v) {
          Intent intent=new Intent(this,second.class);
      }
  });
}


}
