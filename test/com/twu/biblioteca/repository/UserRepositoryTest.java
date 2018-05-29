package com.twu.biblioteca.repository;


import com.twu.biblioteca.model.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class UserRepositoryTest {

    private UserRepository repository = new UserRepository();

    @Test
    public void shouldTestListUserIsCorrect(){
        List<User> actual = repository.listUser();
        List<User> expected = Arrays.asList(new User("Maria","maria@prov.com",99999999,"999-4444","9987"));
        assertEquals(expected,actual);

    }

}
