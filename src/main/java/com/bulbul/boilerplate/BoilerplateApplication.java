package com.bulbul.boilerplate;

import com.bulbul.boilerplate.streamapi.Employee;
import com.bulbul.boilerplate.streamapi.seed.StreamApiSeeder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class BoilerplateApplication {

    @Autowired
    StreamApiSeeder streamApiSeeder;

    public static void main(String[] args) {
        SpringApplication.run(BoilerplateApplication.class, args);
    }
}


