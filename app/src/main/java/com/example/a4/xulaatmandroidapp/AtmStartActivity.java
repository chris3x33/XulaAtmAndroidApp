package com.example.a4.xulaatmandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AtmStartActivity extends AppCompatActivity {

    private TextView welcomeMsgLbl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atm_start_layout);

        welcomeMsgLbl = (TextView) findViewById(R.id.welcomeMsgLbl);

        welcomeMsgLbl.setText("Hello World!");
    }

    public void runLogin(View view) {
    }

    public void exit(View view) {
        this.finish();
    }

    public void runOpenAccount(View view) {
    }
}
