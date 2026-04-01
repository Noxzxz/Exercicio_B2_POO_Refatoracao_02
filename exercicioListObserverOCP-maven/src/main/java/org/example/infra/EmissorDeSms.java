package org.example.infra;

import org.example.dominio.AcoesDepoisEstimativa;
import org.example.dominio.Tarefa;

public class EmissorDeSms implements AcoesDepoisEstimativa {
    public void executa(Tarefa tarefa) {
        System.out.println("Enviando SMS sobre a tarefa: " + tarefa.getDescricaoTarefa());
    }
}
