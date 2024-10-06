package com.ADO06.ADO06.services;

import com.ADO06.ADO06.entities.Alunos;
import com.ADO06.ADO06.repositories.AlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service

public class AlunosService {
    @Autowired
    AlunosRepository alunosRepository;

    public List<Alunos> findAll() {
        List<Alunos> alunos = alunosRepository.findAll();
        return alunos;
    }

    public Alunos findByNome (String nome) {
        Optional<Alunos> aluno = alunosRepository.findByNome(nome);
        return aluno.orElse(null);
    }

    public Alunos findById(int ra) {
        Optional<Alunos> alunos = alunosRepository.findById(ra);
        return alunos.orElse(null);
    }

    public Alunos gravarAluno (Alunos aluno) {
        return alunosRepository.save(aluno);
    }

    public void deletar (Integer ra) {
        alunosRepository.deleteById(ra);
    }

    public Alunos atualizarAluno (Integer ra, Alunos aluno) {
        Alunos alterado = findById(ra);

        if (alterado != null) {
            alterado.setNome(aluno.getNome());
            alterado.setCep(aluno.getCep());
            alterado.setNumero(aluno.getNumero());
            alterado.setComplemento(aluno.getComplemento());
            alterado.setNotaAdo1(aluno.getNotaAdo1());
            alterado.setNotaPI(aluno.getNotaPI());
        }

        return alunosRepository.save(alterado);
    }
}
