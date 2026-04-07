package com.example.ejercicio1;

import jakarta.annotation.Priority;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component("procesoC")
@Priority(1)
public class ProcesoC implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Iniciando proceso: " + getClass().getName());
    }
}
