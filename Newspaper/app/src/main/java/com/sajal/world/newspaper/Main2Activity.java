package com.sajal.world.newspaper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        web=(WebView) findViewById(R.id.msg);

        Bundle extras=getIntent().getExtras();
        String link=extras.getString("One");

        WebSettings setting=web.getSettings();
        setting.setJavaScriptEnabled(true);
        setting.setBuiltInZoomControls(true);

        web.setWebViewClient(new WebViewClient());
        web.loadUrl(link);
    }
}
