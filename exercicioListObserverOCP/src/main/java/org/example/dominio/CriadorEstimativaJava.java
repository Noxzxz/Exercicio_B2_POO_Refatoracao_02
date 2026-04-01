/*
 * Copyright (c) 2026. Feito por Icaro Dias Marculino.
 */

package org.example.dominio;

import java.util.List;

public class CriadorEstimativaJava {
    private final List<AcoesDepoisEstimativa> acoes;

    public CriadorEstimativaJava(List<AcoesDepoisEstimativa> acoes) {
        this.acoes = acoes;
    }

    public EstimativaJava cria(Tarefa tarefa) {
        double metrica = tarefa.getMetricaTarefa();

        EstimativaJava estJava = new EstimativaJava(
                metrica,
                tarefa.getCalculadora().calcular(metrica)
        );

        for (AcoesDepoisEstimativa acao: acoes) {
            acao.executa(tarefa);
        }

        return estJava;
    }

}
