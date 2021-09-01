package com.example.onlinecateringandorderingservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class My_order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);
    }

    public void register(View view) {
        Intent i = new Intent(My_order.this, Payment.class);
        Toast.makeText(My_order.this, "added to chart successfully", Toast.LENGTH_SHORT).show();
        startActivity(i);
        finish();
    }
}