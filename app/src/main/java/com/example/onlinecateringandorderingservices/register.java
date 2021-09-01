package com.example.onlinecateringandorderingservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }
    public void register(View view){
        Intent i = new Intent(register.this,catering.class);
        Toast.makeText(register.this, "Registered successfully", Toast.LENGTH_SHORT).show();
        startActivity(i);
        finish();
    }
}