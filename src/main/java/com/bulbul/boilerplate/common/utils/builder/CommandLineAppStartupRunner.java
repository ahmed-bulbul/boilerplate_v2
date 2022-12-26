package com.bulbul.boilerplate.common.utils.builder;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class CommandLineAppStartupRunner implements CommandLineRunner {

    private final RoleBuilder roleBuilder;

    @Autowired
    PasswordEncoder bCryptPasswordEncoder;

    private static final String DEFAULT_PASSWORD="123456";

    public CommandLineAppStartupRunner(RoleBuilder roleBuilder) {
        this.roleBuilder = roleBuilder;
    }

    @Override
    public void run(String... args) {
        log.info("=========CommandLineAppStartupRunner===============");
        log.info(bCryptPasswordEncoder.encode(DEFAULT_PASSWORD));
        this.roleBuilder.createRole();
    }
}
