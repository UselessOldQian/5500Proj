package edu.northeastern.cs5500project;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;


public class final_registerTest {

    private final_register registerActivity;

    @Before
    public void setUp() {
        registerActivity = new final_register();
        // 初始化所需的任何字段
    }

    @Test
    public void validateForm_ValidInput() {
        assertTrue(registerActivity.validateForm(
                "valid.email@example.com",
                "password123",
                "John",
                "Doe",
                "johndoe",
                "1234567890",
                "70",
                "180"));
    }

    @Test
    public void validateForm_InvalidEmail() {
        assertFalse(registerActivity.validateForm(
                "invalidemail",
                "password123",
                "John",
                "Doe",
                "johndoe",
                "1234567890",
                "70",
                "180"));
    }

    @Test
    public void validateForm_EmptyFields() {
        assertFalse(registerActivity.validateForm(
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""));
    }

    @Test
    public void validateForm_ShortPassword() {
        assertFalse(registerActivity.validateForm(
                "valid.email@example.com",
                "pwd",
                "John",
                "Doe",
                "johndoe",
                "1234567890",
                "70",
                "180"));
    }
}