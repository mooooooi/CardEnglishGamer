package com.kteam.cardenglishgamer.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.kteam.cardenglishgamer.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
           ClientConnectorStartup.go();
    }
}
