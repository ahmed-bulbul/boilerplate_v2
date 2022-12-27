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
    private final UserBuilder userBuilder;

    @Autowired
    PasswordEncoder bCryptPasswordEncoder;


    public CommandLineAppStartupRunner(RoleBuilder roleBuilder, UserBuilder userBuilder) {
        this.roleBuilder = roleBuilder;
        this.userBuilder = userBuilder;
    }

    @Override
    public void run(String... args) {
        log.info("=========CommandLineAppStartupRunner===============");
        log.info(bCryptPasswordEncoder.encode(BuilderConstant.DEFAULT_PASSWORD));
        this.roleBuilder.createRole();
        this.userBuilder.createUser();

    }
}
