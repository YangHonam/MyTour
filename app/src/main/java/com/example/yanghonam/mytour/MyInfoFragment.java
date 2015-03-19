package com.example.yanghonam.mytour;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Yanghonam on 2015. 3. 18..
 */
public class MyInfoFragment extends Fragment {

    WebView webview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.info_activity, container, false);

        webview=(WebView) view.findViewById(R.id.info_WebView);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://www.google.com");

        webview.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return false;
            }
        });
        return view;
    }
}
