package org.example.dominio;

import java.util.Objects;

public final class EstimativaJava {
    private final double metrica;
    private final double produtividadeDesenvolvedor;

    public EstimativaJava(double metrica, double produtividadeDesenvolvedor) {
        this.metrica = metrica;
        this.produtividadeDesenvolvedor = produtividadeDesenvolvedor;
    }

    @Override
    public String toString() {
        return "EstimativaJava{" +
                "metrica=" + metrica +
                ", produtividadeDesenvolvedor=" + produtividadeDesenvolvedor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EstimativaJava that = (EstimativaJava) o;
        return Double.compare(metrica, that.metrica) == 0 && Double.compare(produtividadeDesenvolvedor, that.produtividadeDesenvolvedor) == 0;
    }

    public double metrica() {
        return metrica;
    }

    public double produtividadeDesenvolvedor() {
        return produtividadeDesenvolvedor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(metrica, produtividadeDesenvolvedor);
    }

}
