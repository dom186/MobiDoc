/*
 * Created by Dominic Meyer on 10/30/2015
 * This activity currently verifies that the user has filled out the SignUpActivity fiels correctly. 10/31/2015
 *
 * --Fixed by Dominic Meyer--Bug: Line 54 not correctly confirming that password and confirmPassowrd fields are equal. 10/31/2015
 *
 * Needs to verify company and manager fields were entered           11/27/2015
 * Needs to verify that e-mail is not already taken in database      11/27/2015
 * Needs to verify that company exists in database                   11/27/2015
 * Needs to verify that manager exists in database                   11/27/2015
 * Needs to store user information into database if passes all tests 11/27/2015
 *
 * Last updated 11/27/2015
 */

package com.dominicmeyer.mobidoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }


    //Validates user inputted information into all fields
    public void openLoginFSignUp(View view) {

        //Assign user inputs to variables
        EditText firstName = (EditText) findViewById(R.id.editText_firstName);
        EditText lastName = (EditText) findViewById(R.id.editText_lastName);
        EditText email = (EditText) findViewById(R.id.editText_email);
        EditText company = (EditText) findViewById(R.id.editText_company);
        EditText manager = (EditText) findViewById(R.id.editText_manager);
        EditText password = (EditText) findViewById(R.id.editText_password);
        EditText confirmPassword = (EditText) findViewById(R.id.editText_confirmPassword);

        //Checks that firstName has been entered
        if (Methods.didUserInput(firstName.getText()) == true) {

            //Checks that lastName has been entered
            if (Methods.didUserInput(lastName.getText()) == true) {

                //Checks that valid e-mail has been entered
                if (Methods.isValidEmail(email.getText()) == true) {

                    //Checks that password has been entered
                    if (Methods.didUserInput(password.getText()) == true) {

                        //Checks that confirmPassword has been entered
                        if (Methods.didUserInput(confirmPassword.getText()) == true) {

                            //Checks that password equals confirmPassword
                            if(password.getText().toString().equals(confirmPassword.getText().toString())){ //Bug fixed
                                //Prompts user sign up was successful
                                Toast toast = Toast.makeText(getApplicationContext(), "Sign up successful.", Toast.LENGTH_SHORT);
                                toast.show();
                                //Opens loginActivity if user inputted all the information correctly
                                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                                startActivity(intent);
                            }
                            else {
                                //Prompt user to input matching passwords
                                Toast toast = Toast.makeText(getApplicationContext(), "Please enter matching passwords.", Toast.LENGTH_SHORT);
                                toast.show();
                            }
                        }
                        else {
                            //Prompt user to input password confirmation
                            Toast toast = Toast.makeText(getApplicationContext(), "Please enter password confirmation.", Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    }
                    else {
                        //Prompt user to input password
                        Toast toast = Toast.makeText(getApplicationContext(), "Please enter password.", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
                else {
                    //Prompt user to input valid e-mail
                    Toast toast = Toast.makeText(getApplicationContext(), "Please enter valid e-mail.", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
            else {
                //Prompt user to input last name
                Toast toast = Toast.makeText(getApplicationContext(), "Please enter your last name.", Toast.LENGTH_SHORT);
                toast.show();
            }
        }
        else {
            //Prompt user to input first name
            Toast toast = Toast.makeText(getApplicationContext(), "Please enter your first name.", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


    //Opens LoginActivity when Cancel button is pressed
    public void openLogin(View view) {
        //Opens LoginActivity
        Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
        startActivity(intent);
    }

}