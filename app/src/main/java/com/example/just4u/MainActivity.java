package com.example.just4u;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mBtnHome, mBtnCalc, mBtnIntent, mBtnWeb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnHome = findViewById(R.id.btn_home);
        mBtnCalc = findViewById(R.id.btn_calc);
        mBtnIntent = findViewById(R.id.btn_intent);
        mBtnWeb = findViewById(R.id.btn_web);

        //setting onclick listeners
        mBtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Move1 = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(Move1);
            }
        });

        mBtnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Move2 = new Intent(MainActivity.this,CalculatorActivity.class);
                startActivity(Move2);
            }
        });

        mBtnIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Move3 = new Intent(MainActivity.this,IntentsActivity.class);
                startActivity(Move3);
            }
        });

        mBtnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Move4 = new Intent(MainActivity.this,WebsitesActivity.class);
                startActivity(Move4);
            }
        });

    }
}