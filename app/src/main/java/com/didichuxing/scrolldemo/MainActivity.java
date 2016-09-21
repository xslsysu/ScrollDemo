package com.didichuxing.scrolldemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.didichuxing.scrolldemo.layout.ScrollLayout;

public class MainActivity extends AppCompatActivity {
    ScrollLayout mScrollLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScrollLayout = (ScrollLayout) findViewById(R.id.scroll_view);
        mScrollLayout.scrollTo(-100);
    }
}
