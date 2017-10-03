package com.example.a4.xulaatmandroidapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView loginMsgLbl;
    private EditText userNameTxt;
    private EditText passwordTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        loginMsgLbl = (TextView) findViewById(R.id.loginMsgLbl);
        userNameTxt = (EditText) findViewById(R.id.userNameTxt);
        passwordTxt = (EditText) findViewById(R.id.passwordTxt);

        loginMsgLbl.setText("Login!");

    }


    public void login(View view) {
    }

    public void back(View view) {
    }
}
