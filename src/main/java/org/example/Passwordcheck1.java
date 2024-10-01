package org.example;

public class Passwordcheck1 {
    public static boolean digittest(String password){
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;

    }
    public static boolean containsDigit (String password){
        return PasswordCheck.containsDigit(password);
    }
    public static boolean isWeakPassword(String password) {

        String[] weakPasswords = {
                "Password1", "Aa345678", "123456", "password",
                "letmein", "qwerty", "abc123"
        };

        for (String weakPassword : weakPasswords) {
            if (weakPassword.equals(password)) {
                return true;
            }
        }
        return false;
    }
    public static boolean SpecialCharacter(String password) {
        String specialCharacters = "!@#$%^&*()-_=+[]{};:'\"|,.<>?/";
        for (char c : password.toCharArray()) {
            if (specialCharacters.indexOf(c) >= 0) {
                return true; // Found a special character
            }
        }
        return false; // No special character found
    }

}
