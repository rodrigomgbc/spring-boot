package com.example.ejercicio1;

import jakarta.annotation.Priority;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("procesoB")
@Priority(2)
public class ProcesoB implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Iniciando proceso: " + getClass().getName());
    }
}
