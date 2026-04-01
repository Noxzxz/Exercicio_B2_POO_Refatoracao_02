/*
 * Copyright (c) 2026. Feito por Icaro Dias Marculino.
 */

package org.example.dao;

import org.example.dominio.AcoesDepoisEstimativa;
import org.example.dominio.Tarefa;

public class EstimativaJavaDao implements AcoesDepoisEstimativa {
    public void executa(Tarefa tarefa) {
        System.out.println("Salvando tarefa estimada no banco:" + tarefa);
    }
}
