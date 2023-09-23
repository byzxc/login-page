package com.loginpage.repository;

import com.loginpage.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class UserRepositoryTest {
    private UserRepository userRepository;

    @BeforeEach
    public void setUp() {
        // Initialize the in-memory repository
        userRepository = new UserRepository(new HashSet<>());
    }

    @Test
    public void testSaveAndFindByName() {
        final User user = new User("testuser", "password", Role.NormalUser);
        userRepository.save(Set.of(user));

        final Optional<User> foundUser = userRepository.findByName("testuser");
        assertTrue(foundUser.isPresent());
        assertEquals("testuser", foundUser.get().getUsername());
    }

    @Test
    public void testFindByNameNotFound() {
        final Optional<User> foundUser = userRepository.findByName("nonexistentuser");
        assertFalse(foundUser.isPresent());
    }

    @Test
    public void testDelete() {
        final User manager = new User("testmgr", "password", Role.Manager);
        userRepository.save(Set.of(manager));

        userRepository.delete(Set.of(manager));
        Optional<User> foundUser = userRepository.findByName("testmgr");
        assertFalse(foundUser.isPresent());
    }
}
