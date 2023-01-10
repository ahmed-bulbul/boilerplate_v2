package com.bulbul.boilerplate.common.service;

import com.bulbul.boilerplate.common.entity.User;

public interface UserService {
    String testFunction();

    User findByUsername(String username);


}
