package com.example.edutestproject;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by ayushgarg on 24/02/16.
 */
public class AvailableTests extends AppCompatActivity {

    private TextView tv_available_test;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_available_tests);

        tv_available_test = (TextView)findViewById(R.id.tv_available_test);
    }
}
