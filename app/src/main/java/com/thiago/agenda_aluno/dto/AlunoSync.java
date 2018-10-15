package com.thiago.agenda_aluno.dto;

import com.thiago.agenda_aluno.modelo.Aluno;

import java.util.List;

/**
 * Created by alura on 12/2/16.
 */

public class AlunoSync {

    private List<Aluno> alunos;
    private String momentoDaUltimaModificacao;

    public String getMomentoDaUltimaModificacao() {
        return momentoDaUltimaModificacao;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
