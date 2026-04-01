package org.example.service;

public class CalculadoraProdutividadeSenior extends CalculadoraProdutividade {
    @Override
    public double calcular(double metrica) {
        return metrica * 0.08;
    }
}
