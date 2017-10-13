package org.saja.com.accessory03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewPage extends AppCompatActivity {
WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_page);

        web=(WebView) findViewById(R.id.webview);

        Bundle extras=getIntent().getExtras();

        String link=extras.getString("One");

        WebSettings setting=web.getSettings();

        setting.setJavaScriptEnabled(true);

        setting.setBuiltInZoomControls(true);

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
