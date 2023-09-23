package com.loginpage.model;

import com.loginpage.repository.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String username;
    // Change to Encoded version later
    private String password;
    private Role role;

    public User(final String name, final String password, final Role role) {
        this.username = name;
        this.password = password;
        this.role = role;
    }

    public final String getUsername() {
        return username;
    }

    public final Role getRole() {
        return role;
    }
}
