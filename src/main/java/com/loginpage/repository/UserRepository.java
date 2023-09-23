package com.loginpage.repository;

import com.loginpage.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Repository
public class UserRepository {
    private final Set<User> users = new HashSet<>();

    public Optional<User> findByName(String username) {
        return users.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst();
    }

    public void save(User user) {
        users.add(user);
    }

    public void delete(User user) {
        users.remove(user);
    }
}
