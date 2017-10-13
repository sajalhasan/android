package org.hasan.com.backactivitybutton;

import android.app.ActionBar;
import android.provider.ContactsContract;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        web=(WebView)findViewById(R.id.webview);

        Bundle bundle=getIntent().getExtras();

        String link=bundle.getString("link");

        WebSettings webSettings=web.getSettings();
      //  webSettings.setBuiltInZoomControls(true);
      //  webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setJavaScriptEnabled(true);

        web.setWebViewClient(new WebViewClient());
        web.loadUrl(link);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(event.getAction()==KeyEvent.ACTION_DOWN){
            System.out.println("event.getAction(): "+event.getAction());
            System.out.println("KeyEvent.ACTION_DOWN: "+KeyEvent.ACTION_DOWN);
            switch (keyCode)
            {

                case KeyEvent.KEYCODE_BACK:
                    System.out.println("KeyEvent.KEYCODE_BACK: "+KeyEvent.KEYCODE_BACK);
                    if(web.canGoBack())
                    {
                        web.goBack();
                    }
                    else{
                        finish();
                    }
                    return  true;
            }
        }
        return super.onKeyDown(keyCode,event);
    }
}
