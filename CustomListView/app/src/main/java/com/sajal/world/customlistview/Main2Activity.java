package com.sajal.world.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {
WebView CustomwebPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        CustomwebPage=(WebView)findViewById(R.id.customWebView);


        Bundle bundle=getIntent().getExtras();
        String url=bundle.getString("link");
        CustomwebPage.loadUrl(url);

        WebSettings webSettings=CustomwebPage.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);

        CustomwebPage.setWebViewClient(new WebViewClient());
        CustomwebPage.loadUrl(url);

    }
}
