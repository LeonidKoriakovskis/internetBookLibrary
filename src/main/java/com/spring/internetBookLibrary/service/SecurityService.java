package com.spring.internetBookLibrary.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
