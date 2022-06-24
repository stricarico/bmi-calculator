package com.stricarico.bmicalculator.person;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PersonConfig {

    @Bean
    CommandLineRunner commandLineRunner (PersonRepository personRepository) {
        return args -> {
            Person james = new Person(
                    "James",
                    1.8F,
                    95F
            );

            personRepository.saveAll((List.of(james)));
        };
    }
}
