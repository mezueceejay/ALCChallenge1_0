package com.mezue.apps.alcchallenge1_0;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class AboutALCActivity extends AppCompatActivity {
    private WebView alcWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        alcWeb = findViewById(R.id.alc_web);
        alcWeb.getSettings().getJavaScriptEnabled();
        alcWeb.setWebViewClient(new SSLTolerentWebView());
        alcWeb.loadUrl("https://andela.com/alc/");
    }
    private class SSLTolerentWebView extends WebViewClient{
        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            handler.proceed();
        }
    }
}
