package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    TextView weather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        weather = (TextView) findViewById(R.id.weather_text);

        // TODO (2) Display the weather forecast that was passed from MainActivity
        Intent intent = getIntent();
        if(intent != null && intent.hasExtra(Intent.EXTRA_TEXT)) {
            weather.setText(intent.getStringExtra(Intent.EXTRA_TEXT));
        }

    }
}