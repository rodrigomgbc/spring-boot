package com.example.ejercicio6.service;

import com.example.ejercicio6.PrediccionDia;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Service
public class PrediccionServiceImpl implements PrediccionService {

    @Autowired
    private Faker faker;

    @Override
    public List<PrediccionDia> devolverPrediccionDia() {

        ArrayList<PrediccionDia> dias = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            LocalDate fecha = LocalDate.now().plusDays(i);
            int probabilidadPrecipitacion = faker.number().numberBetween(1, 100);
            int temperaturaMinima = faker.number().numberBetween(1, 10);
            int temperaturaMaxima = faker.number().numberBetween(10, 20);
            int nivelUV = faker.number().numberBetween(0, 5);
            PrediccionDia prediccionDia = new PrediccionDia(nivelUV, temperaturaMaxima, temperaturaMinima, probabilidadPrecipitacion, fecha);
            dias.add(prediccionDia);
        }
        return dias;
    }
}
