package com.example.onlinecateringandorderingservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void register(View view){
        Intent i = new Intent(home.this,details.class);
        Toast.makeText(home.this, "", Toast.LENGTH_SHORT).show();
        startActivity(i);
        finish();
    }
}