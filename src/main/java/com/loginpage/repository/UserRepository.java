package com.loginpage.repository;

import com.loginpage.model.User;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Repository
@NoArgsConstructor
public class UserRepository {
    private Set<User> users = new HashSet<>();

    public UserRepository(final HashSet<User> users) {
        this.users = users;
    }

    public Optional<User> findByName(String username) {
        return users.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst();
    }

    public void save(final Set<User> users) {
        this.users.addAll(users);
    }

    public void delete(final Set<User> users) {
        this.users.removeAll(users);
    }
}
