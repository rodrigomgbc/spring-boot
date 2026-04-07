package com.example.ejercicio1;

import jakarta.annotation.Priority;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("procesoA")
@Priority(3)
public class ProcesoA implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Iniciando proceso: " + getClass().getName());
    }
}
