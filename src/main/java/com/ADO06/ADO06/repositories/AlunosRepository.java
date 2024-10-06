package com.ADO06.ADO06.repositories;

import com.ADO06.ADO06.entities.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository

public interface AlunosRepository extends JpaRepository<Alunos, Integer> {

    Optional<Alunos> findByNome(String nome);
}
