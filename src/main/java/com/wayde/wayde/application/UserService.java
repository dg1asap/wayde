package com.wayde.wayde.application;

import com.wayde.wayde.infrastructure.UserRepository;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
