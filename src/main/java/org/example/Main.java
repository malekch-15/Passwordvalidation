package org.example;
import java.util.Arrays;


import java.util.List;

public class Main {
    public void  main (String[] args) {
        
        String pass ="malekch";
        System.out.println(Posswordlength(pass));
        System.out.println(digits(pass));
        System.out.println(UP(pass));
        if (UP(pass)) {
            System.out.println("Password contains both uppercase and lowercase letters.");
        } else {
            System.out.println("Password does not contain both uppercase and lowercase letters.");
        }
        if (passwordcommon (pass)) {
            System.out.println("This is a commonly used password. Please choose a stronger one.");
        } else {
            System.out.println("This password is not in the commonly used password list.");
        }


        }
    public static String Posswordlength(String password ){
        if (password.length()<8){
            return "false";
        }
        else return "true";

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






    }

