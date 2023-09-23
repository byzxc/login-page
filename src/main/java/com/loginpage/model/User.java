package com.loginpage.model;

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

    public User(final String name, final String password) {
        this.username = name;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
}
