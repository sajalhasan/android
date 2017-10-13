package org.saja.com.accessory03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class AllFunction extends AppCompatActivity {
LinearLayout l0,l1,l2,l3,l4,l5,l6,l7,l8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_function);

        l0=(LinearLayout)findViewById(R.id.zero);
        l1=(LinearLayout)findViewById(R.id.first);
        l2=(LinearLayout)findViewById(R.id.second);
        l3=(LinearLayout)findViewById(R.id.third);
        l4=(LinearLayout)findViewById(R.id.four);
        l5=(LinearLayout)findViewById(R.id.five);
        l6=(LinearLayout)findViewById(R.id.six);
        l7=(LinearLayout)findViewById(R.id.seven);
        l8=(LinearLayout)findViewById(R.id.eight);
       // OnClickButton();
    }

    public void OnClickButton(View view){
        if(view ==l0) {
            l0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(AllFunction.this,WebViewPage.class);
                    String one="https://www.google.com/";
                    i.putExtra("One",one);
                    startActivity(i);
                }
            });
        }
        if(view ==l1) {
            l1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(AllFunction.this,WebViewPage.class);
                    String one="https://www.facebook.com/";
                    i.putExtra("One",one);
                    startActivity(i);
                }
            });
        }
        if(view ==l2) {
            l2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(AllFunction.this,WebViewPage.class);
                    String one="https://www.youtube.com/";
                    i.putExtra("One",one);
                    startActivity(i);
                }
            });
        }
        if(view ==l3) {
            l3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(AllFunction.this,WebViewPage.class);
                    String one="https://www.yahoo.com/";
                    i.putExtra("One",one);
                    startActivity(i);
                }
            });
        }
        if(view ==l4) {
            l4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(AllFunction.this,WebViewPage.class);
                    String one="https://github.com/";
                    i.putExtra("One",one);
                    startActivity(i);
                }
            });
        }
        if(view ==l5) {
            l5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(AllFunction.this,WebViewPage.class);
                    String one="http://www.bhorerkagoj.net/";
                    i.putExtra("One",one);
                    startActivity(i);
                }
            });
        }
        if(view ==l6) {
            l6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(AllFunction.this,WebViewPage.class);
                    String one="https://www.instagram.com/?hl=en";
                    i.putExtra("One",one);
                    startActivity(i);
                }
            });
        }
        if(view ==l7) {
            l7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(AllFunction.this,WebViewPage.class);
                    String one="https://twitter.com/login?lang=en";
                    i.putExtra("One",one);
                    startActivity(i);
                }
            });
        }
        if(view ==l8) {
            l8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(AllFunction.this,WebViewPage.class);
                    String one="https://www.skype.com/en/";
                    i.putExtra("One",one);
                    startActivity(i);
                }
            });
        }
    }
}
