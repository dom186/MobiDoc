package com.dominicmeyer.mobidoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

    }

    //Opens DashboardActivity when Home button is clicked
    public void openDashboard(View view) {
        Intent intent = new Intent(ProfileActivity.this, DashboardActivity.class);
        startActivity(intent);
    }

    //Opens BrowseActivity when Browse button is clicked
    public void openBrowse(View view) {
        Intent intent = new Intent(ProfileActivity.this, BrowseActivity.class);
        startActivity(intent);
    }

}