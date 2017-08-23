package com.example.fapeng.fangmobilecentertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.microsoft.azure.mobile.MobileCenter;
import com.microsoft.azure.mobile.analytics.Analytics;
import com.microsoft.azure.mobile.crashes.Crashes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileCenter.start(getApplication(), "dcfabe59-259e-4556-8a2b-62a0d1b86cb9",Analytics.class, Crashes.class);
    }
}
