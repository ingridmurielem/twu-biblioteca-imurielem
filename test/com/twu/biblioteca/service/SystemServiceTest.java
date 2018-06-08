package com.twu.biblioteca.service;

import com.twu.biblioteca.model.User;
import com.twu.biblioteca.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SystemServiceTest {

    private SystemService service;
    @Before

    public void setUp() {
        service = new SystemService(new UserRepository());
    }

    @Test
    public void shouldTestIfUserIsValid(){

        User actual = service.userValidation("999-4444", "9987");
        User expected = new User("Maria","maria@prov.com",99999999,"999-4444","9987");
        assertEquals(expected,actual);
    }

    @Test
    public void shouldTestIfReturnCorrectUser()
    {
        User actual = service.userInformation("999-4454","987");
        User expected= new User ("Joca","jj@prov.com",99999999,"999-4454","987");
        assertEquals(actual,expected);
    }

   @Test
    public void shouldTestTrueIfUserValid(){
        Boolean actual = service.login("99-4444", "9987");
        assertEquals(true,actual);
    }

}
