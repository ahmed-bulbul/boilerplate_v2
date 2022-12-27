package com.bulbul.boilerplate.common.utils.builder;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordEncrypt {

    private  final PasswordEncoder passwordEncoder;

    public PasswordEncrypt(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public  final String encryptPassword(String rawPass){
        return passwordEncoder.encode(rawPass);
    }
}
