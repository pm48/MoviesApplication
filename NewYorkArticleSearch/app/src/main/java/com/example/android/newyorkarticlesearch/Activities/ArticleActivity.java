package com.example.android.newyorkarticlesearch.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.android.newyorkarticlesearch.R;
import com.example.android.newyorkarticlesearch.models.Article;

import static com.example.android.newyorkarticlesearch.adapters.ArticleAdapter.EXTRA_PARAMS;

public class ArticleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        Article article = (Article) getIntent().getParcelableExtra(EXTRA_PARAMS);
        WebView webView = (WebView) findViewById(R.id.wvArticle);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean  shouldOverrideUrlLoading(WebView view,String url){
                view.loadUrl(url);
                return true;
            }
        }
        );
        webView.loadUrl(article.getWebUrl());
    }
}
