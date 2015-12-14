package com.dominicmeyer.mobidoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class BrowseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);
    }

    //Opens DashboardActivity when Home button is clicked
    public void openDashboard(View view) {
        Intent intent = new Intent(BrowseActivity.this, DashboardActivity.class);
        startActivity(intent);
    }

    //Opens ProfileActivity when Profile button is clicked
    public void openProfile(View view) {
        Intent intent = new Intent(BrowseActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}
