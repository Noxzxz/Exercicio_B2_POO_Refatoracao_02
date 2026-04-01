/*
 * Copyright (c) 2026. Feito por Icaro Dias Marculino.
 */

package org.example.dominio;

import org.example.service.CalculadoraProdutividade;

import java.util.Objects;

public final class Tarefa {
    private final int idTarefa;
    private final String descricaoTarefa;
    private final double metricaTarefa;
    private final CalculadoraProdutividade calculadora;

    public Tarefa(int idTarefa, String descricaoTarefa, double metricaTarefa, CalculadoraProdutividade calculadora) {
        this.idTarefa = idTarefa;
        this.descricaoTarefa = descricaoTarefa;
        this.metricaTarefa = metricaTarefa;
        this.calculadora = calculadora;
    }

    public int getIdTarefa() {
        return idTarefa;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

    public double getMetricaTarefa() {
        return metricaTarefa;
    }

    public CalculadoraProdutividade getCalculadora() {
        return calculadora;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "idTarefa=" + idTarefa +
                ", descricaoTarefa='" + descricaoTarefa + '\'' +
                ", metricaTarefa=" + metricaTarefa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return idTarefa == tarefa.idTarefa && Double.compare(metricaTarefa, tarefa.metricaTarefa) == 0 && Objects.equals(descricaoTarefa, tarefa.descricaoTarefa) && Objects.equals(calculadora, tarefa.calculadora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTarefa, descricaoTarefa, metricaTarefa, calculadora);
    }
}
