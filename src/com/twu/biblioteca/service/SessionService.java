package com.twu.biblioteca.service;

import com.twu.biblioteca.model.Session;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.repository.UserRepository;

import java.util.List;

public class SessionService {

    private UserRepository repository;

    public SessionService(UserRepository repository){
        this.repository = repository;
    }

    public boolean login(String login, String password) {
        User user = userValidation(login, password);

        if (null != user) {
            Session.getInstance().setUser(user);
            return true;
        }
        return false;
    }

    private User userValidation(String login, String password) {
        List <User> users = repository.listUser();
        for(User user: users){
            if(user.getLogin().equals(login) && user.getPassword().equals(password) ){
                return user;
        }
    }
        return null;
    }


    public User getUserInformation() {
        if (Session.getInstance().getUser() == null) {
            throw new RuntimeException("User does not exists in session");
        }

        return Session.getInstance().getUser();
    }

}
