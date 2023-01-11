package com.bulbul.boilerplate.common.utils.builder;

import com.bulbul.boilerplate.streamapi.seed.StreamApiSeeder;
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

    private final StreamApiSeeder streamApiSeeder;

    @Autowired
    PasswordEncoder bCryptPasswordEncoder;


    public CommandLineAppStartupRunner(RoleBuilder roleBuilder, UserBuilder userBuilder, StreamApiSeeder streamApiSeeder) {
        this.roleBuilder = roleBuilder;
        this.userBuilder = userBuilder;
        this.streamApiSeeder = streamApiSeeder;
    }

    @Override
    public void run(String... args) {
        log.info("=========CommandLineAppStartupRunner===============");
        log.info(bCryptPasswordEncoder.encode(BuilderConstant.DEFAULT_PASSWORD));
        this.roleBuilder.createRole();
        this.userBuilder.createUser();
        this.streamApiSeeder.createCustomer();
        this.streamApiSeeder.createProduct();
        this.streamApiSeeder.createOrder();
        this.streamApiSeeder.createPerson();

    }
}
