package org.example;

public class LoginCheck {

    String username;
    String password;

    public void checkLogin() {
        String expectedUsername = "Man";
        String expectedPassword = "12345";

        if (username.equals(expectedUsername)
                && password.equals(expectedPassword)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid credentials");
        }
    }
}
