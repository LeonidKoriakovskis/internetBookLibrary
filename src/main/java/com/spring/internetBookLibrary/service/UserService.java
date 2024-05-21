package com.spring.internetBookLibrary.service;

import com.spring.internetBookLibrary.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void saveUser(User user);

    User getUserById(int id);

    void updateUser(User user);

    void deleteUserById(int id);

    User getUserByEmail(String email);

    User getUserByUsername(String username);

    boolean authenticateUser(String username, String password);
}
