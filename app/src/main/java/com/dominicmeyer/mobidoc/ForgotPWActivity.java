package com.dominicmeyer.mobidoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPWActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pw);
    }


    //Method that validates e-mail address format
    public final static boolean isValidEmail(CharSequence target) {
        if (TextUtils.isEmpty(target)) {
            return false;
        }
        else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }


    //Opens LoginActivity when user submits e-mail request
    public void openLoginValidated(View view) {
        EditText email = (EditText) findViewById(R.id.editText_email);

        if(isValidEmail(email.getText()) == true) { //First checks if e-mail is valid
            //Prompts user that password has been sent to inbox
            Toast toast = Toast.makeText(getApplicationContext(), "Password sent", Toast.LENGTH_SHORT);
            toast.show();

            //Opens next activity
            Intent intent = new Intent(ForgotPWActivity.this, LoginActivity.class);
            startActivity(intent);
        }
        else {
            //Prompts user that inputted e-mail is not valid
            Toast toast = Toast.makeText(getApplicationContext(), "Please enter valid e-mail.", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


    //Opens LoginActivity when Cancel button is pressed
    public void openLogin(View view) {
        //Opens next activity
            Intent intent = new Intent(ForgotPWActivity.this, LoginActivity.class);
            startActivity(intent);
    }
}