package com.loginpage.repository;

import com.loginpage.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@Disabled
public class UserRepositoryTest {
    private UserRepository userRepository;

//    @BeforeEach
//    public void setUp() {
//        // Initialize the in-memory repository
//        userRepository = new UserRepository(new ArrayList<>());
//    }
//
//    @Test
//    public void testSaveAndFindByName() {
//        final User user = new User("testuser", "password", Role.NormalUser);
//        userRepository.save(user);
//
//        final Optional<User> foundUser = userRepository.findByName("testuser");
//        assertTrue(foundUser.isPresent());
//        assertEquals("testuser", foundUser.get().getUsername());
//    }
//
//    @Test
//    public void testFindByNameNotFound() {
//        final Optional<User> foundUser = userRepository.findByName("nonexistentuser");
//        assertFalse(foundUser.isPresent());
//    }
//
//    @Test
//    public void testDelete() {
//        final User manager = new User("testmgr", "password", Role.Manager);
//        userRepository.save(manager);
//
//        userRepository.delete(List.of(manager));
//        Optional<User> foundUser = userRepository.findByName("testmgr");
//        assertFalse(foundUser.isPresent());
//    }
}
