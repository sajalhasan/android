package org.hasan.com.fragmentation;


import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.app.FragmentManager;
import android.app.Fragment;
import android.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // f1=findViewById(R.id.fragmentPlace);

    }

    public void fragmentChangeMethod(View view){
        Fragment fragment;
        if(view==findViewById(R.id.button))
        {
            fragment= new BlankFragment01();
          FragmentManager fm=getFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fragmentPlace, fragment);
            ft.commit();
        }

        if(view==findViewById(R.id.button2))
        {
             fragment= new BlankFragment02();
            FragmentManager fm=getFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fragmentPlace, fragment);
            ft.commit();
        }
    }
}
