package com.example.a4.xulaatmandroidapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class NewUserActivity extends AppCompatActivity {

    private TextView newUserMsgLbl;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_user_layout);

        context = this;

        newUserMsgLbl = (TextView) findViewById(R.id.newUserMsgLbl);

        newUserMsgLbl.setText("Hello World!");
    }


}
