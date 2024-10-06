package com.ADO06.ADO06.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity (name = "alunos")

public class Alunos implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "RA")
    int ra;

    @Column (name = "nome")
    String nome;

    @Column (name = "cep")
    String cep;

    @Column (name = "numero")
    int numero;

    @Column (name = "complemento")
    String complemento;

    @Column (name = "notaAdo1")
    Double notaAdo1;

    @Column (name = "notaPI")
    Double notaPI;

    public Alunos() {
    }

    public Alunos(String nome, String cep, int numero, String complemento, Double notaAdo1, Double notaPI) {
        this.nome = nome;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.notaAdo1 = notaAdo1;
        this.notaPI = notaPI;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Double getNotaAdo1() {
        return notaAdo1;
    }

    public void setNotaAdo1(Double notaAdo1) {
        this.notaAdo1 = notaAdo1;
    }

    public Double getNotaPI() {
        return notaPI;
    }

    public void setNotaPI(Double notaPI) {
        this.notaPI = notaPI;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "ra=" + ra +
                ", nome='" + nome + '\'' +
                ", cep='" + cep + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", notaAdo1=" + notaAdo1 +
                ", notaPI=" + notaPI +
                '}';
    }
}

