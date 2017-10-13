package com.sajal.world.customlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] content={"Facebook","Youtube","Gmail","Twitter"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listView);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,content);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    String link="https://www.facebook.com";
                    Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                    intent.putExtra("link",link);

                    startActivity(intent);
                }
                if(i==1){
                    String link="https://www.youtube.com";
                    Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                    intent.putExtra("link",link);

                    startActivity(intent);
                }
                if(i==2){
                    String link="https://mail.google.com/mail/u/0/";
                    Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                    intent.putExtra("link",link);

                    startActivity(intent);
                }if(i==3){
                    String link="https://twitter.com/login?lang=en";
                    Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                    intent.putExtra("link",link);

                    startActivity(intent);
                }
            }
        });
    }
}
