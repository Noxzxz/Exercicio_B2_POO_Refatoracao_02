/*
 * Copyright (c) 2026. Feito por Icaro Dias Marculino.
 */

package org.example.app;

import org.example.dao.EstimativaJavaDao;
import org.example.dominio.*;
import org.example.infra.EmissorDeSms;
import org.example.infra.LogDeAuditoria;
import org.example.service.CalculadoraProdutividadeJunior;
import org.example.service.CalculadoraProdutividadePleno;
import org.example.service.CalculadoraProdutividadeSenior;

import java.util.List;

public class Main {
    static void main(String[] args) {
        Tarefa tarefa = new Tarefa(1, "Desenvolver um CRUD", 120.0, new CalculadoraProdutividadePleno());

        List<AcoesDepoisEstimativa> acoes = List.of(
                new EstimativaJavaDao(),
                new EmissorDeSms(),
                new LogDeAuditoria()
        );

        CriadorEstimativaJava criador = new CriadorEstimativaJava(acoes);
        EstimativaJava estimativa = criador.cria(tarefa);

        System.out.println("Estimativa gerada: " + estimativa);
    }
}


