package com.twu.biblioteca.service;

import com.twu.biblioteca.model.User;
import com.twu.biblioteca.repository.UserRepository;

import java.util.List;

public class SystemService {

    private UserRepository repository;
    // User Accounts - Login - As a librarian, I want to know who has checked out a book, so that I can hold them accountable for returning it.
    // Users must now login using their library number (which is in the format xxx-xxxx) and a password in order to check-out and return books.
    // User credentials are predefined, so registering new users is not part of this story.

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


    public User userInformation(String login, String password) {
        List <User> users = repository.listUser();
        User userInvalid = new User(null, null, 0, null,null);
        for(User user: users){
            if(user.getLogin().equals(login) && user.getPassword().equals(password) ){
               return user;
            }
        }
        return userInvalid;

    }
    public void printNameEmailPhoneAtUser(User user){
        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getPhoneNumber());

    }
}
