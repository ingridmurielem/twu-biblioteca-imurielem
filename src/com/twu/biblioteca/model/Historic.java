package com.twu.biblioteca.model;
import java.util.Date;
import java.util.Objects;

public class Historic {

    private User user;
    private Date date = new Date();

    public Historic(User user) {
        this.user = user;
    }

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

    @Override
    public String toString() {
        return "Historic{" +
                "user=" + user +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Historic historic = (Historic) o;
        return Objects.equals(user, historic.user) &&
                Objects.equals(date, historic.date);
    }

    @Override
    public int hashCode() {

        return Objects.hash(user, date);
    }
}
