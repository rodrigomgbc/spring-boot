package com.example.ejercicio6;

import java.time.LocalDate;

public class PrediccionDia {
    private LocalDate fecha;
    private int probabilidadPrecipitacion;
    private int temperaturaMinima;
    private int temperaturaMaxima;
    private int nivelUV;

    public PrediccionDia(int nivelUV, int temperaturaMaxima, int temperaturaMinima, int probabilidadPrecipitacion, LocalDate fecha) {
        this.nivelUV = nivelUV;
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
        this.probabilidadPrecipitacion = probabilidadPrecipitacion;
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getProbabilidadPrecipitacion() {
        return probabilidadPrecipitacion;
    }

    public void setProbabilidadPrecipitacion(int probabilidadPrecipitacion) {
        this.probabilidadPrecipitacion = probabilidadPrecipitacion;
    }

    public int getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(int temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(int temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public int getNivelUV() {
        return nivelUV;
    }

    public void setNivelUV(int nivelUV) {
        this.nivelUV = nivelUV;
    }
}
