package com.bulbul.boilerplate.common.utils.builder;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class CommandLineAppStartupRunner implements CommandLineRunner {

    private final RoleBuilder roleBuilder;

    public CommandLineAppStartupRunner(RoleBuilder roleBuilder) {
        this.roleBuilder = roleBuilder;
    }

    @Override
    public void run(String... args) {
        log.info("=========CommandLineAppStartupRunner===============");
        this.roleBuilder.createRole();
    }
}
