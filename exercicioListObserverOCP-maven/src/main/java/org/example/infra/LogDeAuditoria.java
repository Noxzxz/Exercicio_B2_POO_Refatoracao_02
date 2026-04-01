package org.example.infra;

import org.example.dominio.AcoesDepoisEstimativa;
import org.example.dominio.Tarefa;

public class LogDeAuditoria implements AcoesDepoisEstimativa {
    @Override
    public void executa(Tarefa tarefa) {
        System.out.println("[LOG] Auditoria registrada para a tarefa ID " + tarefa.getIdTarefa());
    }
}
