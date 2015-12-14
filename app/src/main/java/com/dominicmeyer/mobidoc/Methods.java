package com.dominicmeyer.mobidoc;

import android.text.TextUtils;

/**
 * Created by Dominic on 11/1/15.
 */
public class Methods {

    //Method that validates that user has inputted information into EditText field
    public final static boolean didUserInput(CharSequence target) {
        if (TextUtils.isEmpty(target)) {
            return false;
        }
        else {
            return true;
        }
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

}
