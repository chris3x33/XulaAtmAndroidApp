package com.example.a4.xulaatmandroidapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView loginMsgLbl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        loginMsgLbl = (TextView) findViewById(R.id.loginMsgLbl);

        loginMsgLbl.setText("Login!");

    }


}
