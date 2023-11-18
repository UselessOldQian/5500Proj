package edu.northeastern.cs5500project;

import static org.junit.Assert.*;

import android.widget.Button;
import android.widget.EditText;

import org.junit.Before;
import org.junit.Test;

public class final_loginTest {

    private final_login LoginActivity;

    @Before
    public void setUp() {
        LoginActivity = new final_login();
    }

    @Test
    public void validateForm_validInput_shouldReturnTrue() {
        String validEmail = "valid@example.com";
        String validPassword = "password123";

        boolean result = LoginActivity.validateForm(validEmail, validPassword);

        assertTrue(result);
    }

    @Test
    public void validateForm_invalidEmail_shouldReturnFalseAndSetError() {
        String invalidEmail = "invalidEmail";
        String validPassword = "password123";

        boolean result = LoginActivity.validateForm(invalidEmail, validPassword);

        assertFalse(result);
        assertNotNull(LoginActivity.email.getError());
    }

    @Test
    public void validateForm_shortPassword_shouldReturnFalseAndSetError() {
        String validEmail = "valid@example.com";
        String shortPassword = "pass";

        boolean result = LoginActivity.validateForm(validEmail, shortPassword);

        assertFalse(result);
        assertNotNull(LoginActivity.password.getError());
    }

    @Test
    public void validateForm_emptyFields_shouldReturnFalseAndSetErrors() {
        String emptyEmail = "";
        String emptyPassword = "";

        boolean result = LoginActivity.validateForm(emptyEmail, emptyPassword);

        assertFalse(result);
        assertNotNull(LoginActivity.email.getError());
        assertNotNull(LoginActivity.password.getError());
    }
}