package com.twu.biblioteca.service;

import com.twu.biblioteca.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SystemServiceTest {

    private SystemService service;
    @Before

    public void setUp() {
        service = new SystemService(new UserRepository());
    }

    @Test
    public void shouldTestIfTheLoginIsInTheCorrectFormat(){

        int actual = service.userValidation("999-4444", "9987");
        int expected = 1;
        assertEquals(expected,actual);
    }
}
