package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PassChekTest1 {
   @Test
    public void digits() {
        String Passwith="Malekch15";
        assertTrue(Passwordcheck1.digittest(Passwith));
        String Passwithout="Malekch";
        assertFalse(Passwordcheck1.digittest(Passwithout));

    }
    @Test
    public void weakPassword(){
       String weakpass = "Malekch1";
       assertTrue(Passwordcheck1.containsDigit(weakpass));
        String strongPassword = "Str0ngPassword!"; // Strong password
        assertFalse(Passwordcheck1.isWeakPassword(strongPassword));
    }

    @Test
    public void testPasswordOnlySpecialCharacters() {
        String password = "!@#$%^&*()";
        assertFalse(Passwordcheck1.containsDigit(password));
    }
    @Test
    public void testPasswordContainsSpecialCharacter() {
        String passwordWith = "Password@123"; // Password with special character
        assertTrue(Passwordcheck1.SpecialCharacter(passwordWith));

        String passwordWithout = "Password123"; // Password without special character
        assertFalse(Passwordcheck1.SpecialCharacter(passwordWithout));
    }
}
