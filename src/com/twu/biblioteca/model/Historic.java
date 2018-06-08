package com.twu.biblioteca.model;
import java.util.Date;

public class Historic {

    User user;
    Date date = new Date ();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
