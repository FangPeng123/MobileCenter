package com.example.fapeng.fangmobilecenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.microsoft.azure.mobile.MobileCenter;
import com.microsoft.azure.mobile.analytics.Analytics;
import com.microsoft.azure.mobile.crashes.Crashes;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileCenter.start(getApplication(), "dcfabe59-259e-4556-8a2b-62a0d1b86cb9",Analytics.class, Crashes.class);
        final Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Map<String, String> properties = new HashMap<>();
                properties.put("Category", "Music");
                properties.put("FileName", "favorite.avi");
                Analytics.trackEvent("Video clicked", properties);
                button.setText("hello");
            }

        }
        );
    }
}
