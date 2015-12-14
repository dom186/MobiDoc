package com.dominicmeyer.mobidoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    //Opens DashboardActivity when login button clicked
    public void openDashboard(View view) {

        //Assign user inputs to variables
        EditText email = (EditText) findViewById(R.id.editText_email);
        EditText password = (EditText) findViewById(R.id.editText_password);

        if(Methods.isValidEmail(email.getText()) == true) { //First checks if e-mail is valid
            if(Methods.didUserInput(password.getText()) == true) { //Then checks if a password is entered
                Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
                startActivity(intent);

            }
            else {
                //Prompts user to input password
                Toast toast = Toast.makeText(getApplicationContext(), "Please enter password.", Toast.LENGTH_SHORT);
                toast.show();
            }
        }
        else {
            //Prompts user that inputted e-mail is not valid
            Toast toast = Toast.makeText(getApplicationContext(), "Please enter valid e-mail.", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


    //Opens ForgotPWActivity
    public void openForgotPW(View view) {
        Intent intent = new Intent(LoginActivity.this, ForgotPWActivity.class);
        startActivity(intent);
    }


    //Opens SignUpActivity
    public void openSignUp(View view) {
        Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
        startActivity(intent);
    }

}