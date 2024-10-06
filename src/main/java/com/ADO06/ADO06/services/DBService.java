package com.ADO06.ADO06.services;

import com.ADO06.ADO06.entities.Alunos;
import com.ADO06.ADO06.repositories.AlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import java.text.ParseException;
import java.util.Arrays;

@Service

public class DBService {
    @Autowired
    private AlunosRepository alunosRepository;

    @Bean
    public void instanciarDB() throws ParseException {
        Alunos aluno = new Alunos("João Victor", "04950-000", 10, "Não", 7.8, 9.0);
        Alunos aluno2 = new Alunos("Maria Mercedes", "04950-111", 12, "Não", 7.0, 9.5);
        Alunos aluno3 = new Alunos("Gustavo Souza", "12345-000", 6, "Não", 8.3, 7.2);
        alunosRepository.saveAll(Arrays.asList(aluno, aluno2, aluno3));
    }
}
