package com.bulbul.boilerplate.common.utils.builder;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class CommandLineAppStartupRunner implements CommandLineRunner {

    private final RoleBuilder roleBuilder;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public CommandLineAppStartupRunner(RoleBuilder roleBuilder) {
        this.roleBuilder = roleBuilder;
    }

    @Override
    public void run(String... args) {
        log.info("=========CommandLineAppStartupRunner===============");
        System.out.println(bCryptPasswordEncoder.encode("123456"));
        this.roleBuilder.createRole();
    }
}
