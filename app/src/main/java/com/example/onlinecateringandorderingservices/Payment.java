package com.example.onlinecateringandorderingservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Payment extends AppCompatActivity {

    Handler h = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Payment.this, home.class);
                startActivity(i);
                finish();
            }
        },3000);
    }

}