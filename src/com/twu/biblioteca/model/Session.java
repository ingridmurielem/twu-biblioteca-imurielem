package com.twu.biblioteca.model;

public class Session {

    User user;
    private static Session instance = new Session();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static Session getInstance() {

        return instance;
    }

    public static void setInstance(Session instance) {
        Session.instance = instance;
    }

    //Singleton

}
