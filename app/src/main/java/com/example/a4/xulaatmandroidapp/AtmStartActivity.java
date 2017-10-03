package com.example.a4.xulaatmandroidapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AtmStartActivity extends AppCompatActivity {

    private TextView welcomeMsgLbl;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atm_start_layout);

        context = this;

        welcomeMsgLbl = (TextView) findViewById(R.id.welcomeMsgLbl);

        welcomeMsgLbl.setText("Hello World!");
    }

    public void runLogin(View view) {
        Intent intent = new Intent(context, LoginActivity.class);
        startActivity(intent);
    }

    public void exit(View view) {
        this.finish();
    }

    public void runOpenAccount(View view) {
    }
}
