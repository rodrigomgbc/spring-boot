package com.example.ejercicio5;

import net.datafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Locale;

@Configuration
public class AppConfig {

    @Bean
    public Faker fakerGenerator() {
        Locale es = new Locale("es");
        Faker faker = new Faker(es);
        return faker;
    }
}
