package com.example.kiran.cr7;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * A simple {@link Fragment} subclass.
 */
public class WebFragment extends Fragment {


    public WebFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_web, container, false);
        WebView mywebview = (WebView) view.findViewById(R.id.webView);
        WebSettings Settings = mywebview.getSettings();
        Settings.setJavaScriptEnabled(true);
        mywebview.loadUrl("https://www.facebook.com/Cristiano/");
        mywebview.setWebViewClient(new WebViewClient());
        return  view;
    }
}
