package com.ADO06.ADO06.resources;

import com.ADO06.ADO06.entities.Alunos;
import com.ADO06.ADO06.services.AlunosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping (value = "/alunos")

public class AlunosResource {
    @Autowired
    private AlunosService alunosService;

    public AlunosResource (AlunosService alunosService) {
        this.alunosService = alunosService;
    }

    @GetMapping
    public List<Alunos> findAll () {
        List<Alunos> alunos = alunosService.findAll();
        return alunos;
    }

    @GetMapping (value = "/{ra}")
    public ResponseEntity<Alunos> findById (@PathVariable Integer ra) {
        Alunos alunos = alunosService.findById(ra);
        return ResponseEntity.ok().body(alunos);
    }

    @GetMapping (value = "/nome/{nome}")
    public Alunos findByNome (@PathVariable String nome) {
        Alunos aluno = alunosService.findByNome(nome);
        return ResponseEntity.ok().body(aluno).getBody();
    }

    @PostMapping
    public ResponseEntity<Alunos> gravarAluno (@RequestBody Alunos aluno) {
        aluno = alunosService.gravarAluno(aluno);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{ra}").buildAndExpand(aluno.getRa()).toUri();
        return ResponseEntity.created(uri).body(aluno);
    }

    @DeleteMapping (value = "/{ra}")
    public ResponseEntity<Void> deletar (@PathVariable Integer ra) {
        alunosService.deletar(ra);
        return ResponseEntity.noContent().build();
    }

    @PutMapping (value = "/{ra}")
    public ResponseEntity<Alunos> atualizar (@PathVariable Integer ra, @RequestBody Alunos aluno) {
        aluno.setRa(ra);
        aluno = alunosService.atualizarAluno(ra, aluno);
        return ResponseEntity.ok().body(aluno);
    }
}

