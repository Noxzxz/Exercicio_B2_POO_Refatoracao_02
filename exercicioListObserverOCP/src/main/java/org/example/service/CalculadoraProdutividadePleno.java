/*
 * Copyright (c) 2026. Feito por Icaro Dias Marculino.
 */

package org.example.service;

public class CalculadoraProdutividadePleno extends CalculadoraProdutividade{
    @Override
    public double calcular(double metrica) {
        return metrica * 0.07;
    }
}
