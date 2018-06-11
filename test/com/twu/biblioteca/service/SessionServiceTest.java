package com.twu.biblioteca.service;

import com.twu.biblioteca.model.User;
import com.twu.biblioteca.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SessionServiceTest {

    private SessionService service;
    @Before

    public void setUp() {
        service = new SessionService(new UserRepository());
    }

    @Test
    public void shouldTestIfUserIsValid(){

        Boolean actual = service.login("999-4444", "9987");
        Boolean expected = true;
        assertEquals(expected,actual);
    }


   @Test
    public void shouldTestTrueIfUserValid(){
        Boolean actual = service.login("99-4444", "9987");
        assertEquals(true,actual);
    }

}
