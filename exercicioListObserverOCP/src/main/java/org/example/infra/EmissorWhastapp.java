/*
 * Copyright (c) 2026. Feito por Icaro Dias Marculino.
 */

package org.example.infra;

import org.example.dominio.AcoesDepoisEstimativa;
import org.example.dominio.Tarefa;

public class EmissorWhastapp implements AcoesDepoisEstimativa {
    @Override
    public void executa(Tarefa tarefa) {
        System.out.println("Enviando mensagem por WhatsApp sobre a tarefa: " + tarefa.getDescricaoTarefa());
    }
}
