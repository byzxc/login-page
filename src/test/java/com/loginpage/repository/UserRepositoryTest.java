package com.loginpage.repository;

import com.loginpage.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class UserRepositoryTest {
    private UserRepository userRepository;

    @BeforeEach
    public void setUp() {
        // Initialize the in-memory repository
        userRepository = new UserRepository();
    }

    @Test
    public void testSaveAndFindByName() {
        User user = new User("testuser", "password");
        userRepository.save(user);

        Optional<User> foundUser = userRepository.findByName("testuser");
        assertTrue(foundUser.isPresent());
        assertEquals("testuser", foundUser.get().getUsername());
    }

    @Test
    public void testFindByNameNotFound() {
        Optional<User> foundUser = userRepository.findByName("nonexistentuser");
        assertFalse(foundUser.isPresent());
    }

    @Test
    public void testDelete() {
        User user = new User("testuser", "password");
        userRepository.save(user);

        userRepository.delete(user);
        Optional<User> foundUser = userRepository.findByName("testuser");
        assertFalse(foundUser.isPresent());
    }
}
