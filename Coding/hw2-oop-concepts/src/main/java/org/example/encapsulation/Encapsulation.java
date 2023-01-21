package org.example.encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        User user = new User("erfan", "1234");
        if (user.login("erfan", "1234")) {
            System.out.println("Login Success!");
        } else {
            System.out.println("Wrong Credentials!");
        }

        // this would result in error since we won't allow direct modification from outsider class on password.
//        user.password = "123";
    }
}

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

}
