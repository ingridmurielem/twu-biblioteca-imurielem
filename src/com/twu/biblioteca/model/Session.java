package com.twu.biblioteca.model;

public class Session {

    private static Session instance;
    private User user;

    private Session() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static Session getInstance() {
        if (instance == null)
            instance = new Session();

        return instance;
    }

}
