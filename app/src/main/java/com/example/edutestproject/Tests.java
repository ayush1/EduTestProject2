package com.example.edutestproject;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by ayushgarg on 24/02/16.
 */
public class Tests extends AppCompatActivity {

    private TextView tv_test;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_tests);

        tv_test = (TextView)findViewById(R.id.tv_test);
    }
}
