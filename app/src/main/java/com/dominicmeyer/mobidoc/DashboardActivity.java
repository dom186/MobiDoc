package com.dominicmeyer.mobidoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

    }

    //Opens BrowseActivity when button is clicked
    public void openBrowse(View view) {
        Intent intent = new Intent(DashboardActivity.this, BrowseActivity.class);
        startActivity(intent);
    }

    //Opens ProfileActivity when button is clicked
    public void openProfile(View view) {
        Intent intent = new Intent(DashboardActivity.this, ProfileActivity.class);
        startActivity(intent);
    }

    //Opens LoginActivity when button is clicked
    public void openLogin(View view) {
        Intent intent = new Intent(DashboardActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}
