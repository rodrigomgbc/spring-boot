package com.example.ejercicio6;

import net.datafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Locale;

@Configuration
public class AppConfig {
    // Método bean para generar un objeto faker en el proyecto
    @Bean
    public Faker generarFaker() {
        Locale es = new Locale("es", "ES");
        Faker faker = new Faker(es);
        return faker;
    }
}
