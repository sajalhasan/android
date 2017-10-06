package com.example.root.myapplication;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatabaseHandler myDb;
    EditText name,email,password;
    Button signup,showButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDb=new DatabaseHandler(this);

        name=(EditText)findViewById(R.id.name);
        email=(EditText)findViewById(R.id.email);
        password=(EditText)findViewById(R.id.password);

        signup=(Button)findViewById(R.id.signup) ;
        showButton=(Button)findViewById(R.id.showButton);
        insertData();
        showAllData();
    }
    public void insertData(){
        signup.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String iname=name.getText().toString();
                String iemail=email.getText().toString();
                String ipassword=password.getText().toString();

                myDb.insertData(iname,iemail,ipassword);

                Toast.makeText(MainActivity.this,"insert",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void showAllData(){
        showButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Cursor res = myDb.showAllData();
                if(res.getCount() == 0) {
                    // show message
                   showMessage("Error","Nothing found");
                    return;
                }

                StringBuffer buffer = new StringBuffer();
                while (res.moveToNext()) {
                    buffer.append("Id :"+ res.getString(0)+"\n");
                    buffer.append("Name :"+ res.getString(1)+"\n");
                    buffer.append("Surname :"+ res.getString(2)+"\n");
                    buffer.append("Marks :"+ res.getString(3)+"\n\n");
                }

                // Show all data
              showMessage("Data",buffer.toString());
            }
        });
    }

    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }


}
