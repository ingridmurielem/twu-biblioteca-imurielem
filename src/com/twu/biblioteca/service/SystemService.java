package com.twu.biblioteca.service;

import com.twu.biblioteca.model.User;
import com.twu.biblioteca.repository.UserRepository;

import java.util.List;

public class SystemService {

    private UserRepository repository;

    public SystemService( UserRepository repository){
        this.repository = repository;
    }

    public boolean login(String login, String password) {
        User user = userValidation(login, password);

        if (null != user) {
         //   new Session (user,)  INICIAR SESSÃO
            return true;
        }
        return false;
    }

    public User userValidation(String login, String password) {
        List <User> users = repository.listUser();
        for(User user: users){
            if(user.getLogin().equals(login) && user.getPassword().equals(password) ){
                return user;
        }
    }
        return null;
    }


    public User userInformation(String login, String password) {
        List <User> users = repository.listUser();
        for(User user: users){
            if(user.getLogin().equals(login) && user.getPassword().equals(password) ){
               return user;
            }
        }
        return null;

    }
    public void printNameEmailPhoneAtUser(User user){
        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getPhoneNumber());

    }
}
