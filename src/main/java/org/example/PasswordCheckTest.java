package org.example;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PasswordCheckTest {
    @Test
    public void testposswordlength(){
        String password = "Malekchz";

        assertTrue(PasswordCheck.isPasswordlengthValid(password));
    }
    @Test
    public void testPasswordTooShort() {
        String password = "Short1";
        assertFalse(PasswordCheck.isPasswordLengthValid(password));
    }

    @Test
    public void testPasswordTooLong() {
        String password = "ThisPasswordIsWayTooLong123";
        assertFalse(PasswordCheck.isPasswordLengthValid(password));
    }
    @Test
    public void digitstest (){
        String password = "Malekch15";
        assertTrue(PasswordCheck.digits(password));

    }
    @Test
    public void UpLoTest (){
        String password = "Malekch15";
        assertTrue(PasswordCheck.UP(password));

    }

    @Test
    public void Commentest (){
        String password = "0000000000";
        assertFalse(PasswordCheck.passwordcommon(password));

    }


    @Test
    public void testEmptyPassword() {
        String password = "";
        assertFalse(PasswordCheck.isPasswordLengthValid(password));
    }

    @Test
    public void testPasswordContainsDigit() {
        String password = "Password123";
        assertTrue(PasswordCheck.containsDigit(password));
    }

    // Test for password without digits
    @Test
    public void testPasswordNoDigit() {
        String password = "Password";
        assertFalse(PasswordCheck.containsDigit(password));
    }

    // Test for password containing both uppercase and lowercase letters
    @Test
    public void testPasswordContainsUpperAndLowerCase() {
        String password = "Password";
        assertTrue(PasswordCheck.containsUpperAndLowerCase(password));
    }

    // Test for password with only lowercase letters
    @Test
    public void testPasswordOnlyLowerCase() {
        String password = "password";
        assertFalse(PasswordCheck.containsUpperAndLowerCase(password));
    }

    // Test for password with only uppercase letters
    @Test
    public void testPasswordOnlyUpperCase() {
        String password = "PASSWORD";
        assertFalse(PasswordCheck.containsUpperAndLowerCase(password));
    }

    // Test for commonly used password detection
    @Test
    public void testCommonPassword() {
        String password = "111111";
        assertTrue(PasswordCheck.isCommonPassword(password));
    }

    // Test for an uncommon password
    @Test
    public void testUncommonPassword() {
        String password = "Malekchenennaoui";
        assertFalse(PasswordCheck.isCommonPassword(password));
    }

}
