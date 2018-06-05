package com.twu.biblioteca.repository;

import com.twu.biblioteca.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserRepository {

    private List<User> users;

    public UserRepository() {

        this.users = Arrays.asList(new User("Maria","maria@prov.com",99999999,"999-4444","9987"),
                new User ("Joca","jj@prov.com",99999999,"999-4454","987"));
    }

    public List<User> listUser (){
        return users;
    }
}
