package com.twu.biblioteca.service;

import com.twu.biblioteca.model.User;
import com.twu.biblioteca.repository.UserRepository;

import java.util.List;

public class SystemService {

    private UserRepository repository;

    public SystemService( UserRepository repository){
        this.repository = repository;
    }

    public int userValidation(String login, String password) {
        List <User> users = repository.listUser();
        for(User user: users){
            if(user.getLogin().equals(login) && user.getPassword().equals(password) ){
                return 1;
        }
    }
        return 0;
    }


}
