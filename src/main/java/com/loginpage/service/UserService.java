package com.loginpage.service;

import com.loginpage.model.User;
import com.loginpage.repository.Role;
import com.loginpage.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    UserService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(final String username, final String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

    public boolean userHasAdminAccess(final User user) {
        return user.getRole().equals(Role.MANAGER);
    }

    public boolean userExists(final User user) {
        return user != null;
    }
}
