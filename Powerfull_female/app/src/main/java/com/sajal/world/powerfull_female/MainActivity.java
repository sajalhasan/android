package com.sajal.world.powerfull_female;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
       int [] image={R.drawable.panza,R.drawable.cristina,R.drawable.dilma,R.drawable.simonetta,R.drawable.park,R.drawable.ellen};
    String [] name={"Catherine Samba-Panza","Cristina Fernandez de Kirchner","dilma rousseff","simonetta sommaruga","park geun hye","Ellen Johnson Sirleaf"};
    String [] name2={"current president of the Central African Republic","2nd female president of Argentina","first female president and current leader of Brazil"," current president of Switzerland"," first female president of South Korea","She is the World’s first elected black female president"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView)findViewById(R.id.listview);

        customadapter adapter=new customadapter();
        listView.setAdapter(adapter);
    }
    class customadapter extends BaseAdapter{

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

            view=getLayoutInflater().inflate(R.layout.custom,null);

            ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
            TextView title=(TextView)view.findViewById(R.id.title);
            TextView description=(TextView)view.findViewById(R.id.decription);

            imageView.setImageResource(image[i]);
            title.setText(name[i]);
            description.setText(name2[i]);
            return view;
        }
    }


}
