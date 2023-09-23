package com.loginpage.repository;

import com.loginpage.model.User;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
@NoArgsConstructor
public class UserRepository {
    private List<User> users = new ArrayList<>();

    public UserRepository(final List<User> users) {
        this.users = users;
    }

    public Optional<User> findByName(String username) {
        return users.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst();
    }

    public User save(final User user) {
        final Optional<User> savedUser = findByName(user.getUsername());
        if (savedUser.isPresent()) {
            System.out.println("User exist in database! User:" + savedUser.get().getUsername());
            return null;
        }
        users.add(user);
        return user;
    }

    public void delete(final List<User> users) {
        this.users.removeAll(users);
    }

    public Integer getNumOfUsers() {
        return users.size();
    }
}
