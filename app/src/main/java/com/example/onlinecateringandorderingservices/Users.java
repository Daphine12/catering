package com.example.onlinecateringandorderingservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Users extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflate = getMenuInflater();
        inflate.inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.nav_about:
                Intent i = new Intent(Users.this, login.class);
                startActivity(i);
                return true;
            case R.id.nav_profile:
                Intent l = new Intent(Users.this, home.class);
                startActivity(l);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);
    }

    public void register(View view) {
        Intent i = new Intent(Users.this, details.class);
        Toast.makeText(Users.this, "Registered successfully", Toast.LENGTH_SHORT).show();
        startActivity(i);
        finish();
    }
}
