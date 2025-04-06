package com.bridgelabz.advance;

public class PasswordValidator {

    public static boolean isValid(String password) {
        if (password == null) return false;
        if (password.length() < 8) return false;
        if (!password.matches(".*[A-Z].*")) return false;  // At least one uppercase
        if (!password.matches(".*\\d.*")) return false;     // At least one digit
        return true;
    }
}
