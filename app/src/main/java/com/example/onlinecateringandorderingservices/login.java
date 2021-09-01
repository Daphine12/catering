package com.example.onlinecateringandorderingservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void register(View view){
        Intent i = new Intent(login.this,catering.class);
        Toast.makeText(login.this, "Registered successfully", Toast.LENGTH_SHORT).show();
        startActivity(i);
        finish();
    }
}