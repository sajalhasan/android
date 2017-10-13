package com.sajal.world.custom_listview_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ListView listView;
       int [] image={R.drawable.facebook,R.drawable.gmail,R.drawable.youtube};
    String [] name={"Facebook","Gmail","Youtube"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listViewID);

        CustomAdapter adapter=new CustomAdapter();
        listView.setAdapter(adapter);

       /* listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                // String listname=listView.getItemAtPosition(i).toString();

                //  String link="www.facebook.com";
                intent.putExtra("listposition",listView.getItemAtPosition(i).toString());
                startActivity(intent);

            }
        });*/
    }
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return image.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view= getLayoutInflater().inflate(R.layout.activity_main2,null);

            ImageView imageView=(ImageView) view.findViewById(R.id.imageView);
            TextView textView=(TextView)view.findViewById(R.id.textView);

            imageView.setImageResource(image[i]);
            textView.setText(name[i]);



            return view;
        }
    }
}
