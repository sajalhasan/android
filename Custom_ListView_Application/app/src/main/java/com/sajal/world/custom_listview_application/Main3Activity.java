package com.sajal.world.custom_listview_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
//WebView web;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView=(TextView)findViewById(R.id.textView);

       // web=(WebView) findViewById(R.id.webpage);

        Bundle extras=getIntent().getExtras();
        String link=extras.getString("listposition");
        textView.setText(link);

       // WebSettings setting=web.getSettings();
       // setting.setJavaScriptEnabled(true);
       // setting.setBuiltInZoomControls(true);

       // web.setWebViewClient(new WebViewClient());
       // web.loadUrl(link);
    }
}
