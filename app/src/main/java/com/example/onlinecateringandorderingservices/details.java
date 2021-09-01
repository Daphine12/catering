package com.example.onlinecateringandorderingservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
    }
    public void order(View view){
        Intent i = new Intent(details.this,My_order.class);
        startActivity(i);
        finish();
    }
    public void now(View view){
        Intent i = new Intent(details.this,My_order.class);
        startActivity(i);
        finish();
    }
}