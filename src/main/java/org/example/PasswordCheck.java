package org.example;

import java.util.Arrays;

public class PasswordCheck {
    public static boolean isPasswordlengthValid(String password){

            if (password.length()<8){
                return false;
            }
            else return true;

        }
    public static Boolean digits(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))){
                return false;

            }
        }
        return true ;


    }
    public static Boolean UP (String password) {
        boolean upper = false;
        boolean lower = false;

        for (char i : password.toCharArray()) {
            if (Character.isUpperCase(i)||(Character.isLowerCase(i))) {
                lower = true;
                upper = true;
            }

            if (upper && lower) {
                return true;
            }
        }
        return upper && lower;
    }
    public static Boolean passwordcommon(String password){

        String[] array = {"1234","45678","45678","malek"};
        if (Arrays.asList(array).contains(password)) {
            return true;
        } else return false;

    }

    public static boolean isPasswordLengthValid(String password) {
        int minLength = 8;
        int maxLength = 25;
        return password.length() >= minLength && password.length() <= maxLength;
    }


    public static boolean containsDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsUpperAndLowerCase(String password) {
        boolean hasUpper = false;
        boolean hasLower = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
            if (Character.isLowerCase(c)) {
                hasLower = true;
            }
            if (hasUpper && hasLower) {
                return true;
            }
        }
        return false;
    }

    private static final String[] COMMON_PASSWORDS = {
            "123456", "password", "123456789", "12345",
            "12345678", "qwerty", "abc123", "111111"
    };

    public static boolean isCommonPassword(String password) {
        for (String commonPassword : COMMON_PASSWORDS) {
            if (commonPassword.equals(password)) {
                return true;
            }
        }
        return false;
    }
}
