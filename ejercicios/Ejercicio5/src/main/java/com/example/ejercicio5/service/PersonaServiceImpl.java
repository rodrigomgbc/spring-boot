package com.example.ejercicio5.service;

import com.example.ejercicio5.Persona;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private Faker faker;

    @Override
    public List<Persona> find(int count) {
        ArrayList<Persona> personas = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            personas.add(generarPersona());
        }
        return personas;
    }

    @Override
    public Persona findOne() {
        return generarPersona();
    }

    private Persona generarPersona() {
        String nombre = faker.name().firstName();
        String apellidos = faker.name().lastName() + " " + faker.name().lastName();
        String dni = faker.idNumber().valid();
        LocalDate fechaNacimiento = LocalDate.of(
            faker.number().numberBetween(1950, 2005),
            faker.number().numberBetween(1, 12),
            faker.number().numberBetween(1, 28)
        );

        return new Persona(apellidos, dni, fechaNacimiento, nombre);
    }
}
