package com.stormesteste.testandospringboot2.com.stormpacotes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;


@Entity //Indicar que essa classe é uma entidade do JPA
public class Pessoas implements Serializable {
    private final long serialVersionUGI = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Deixar o banco de dados escolher a Primery key
    private Integer id;

    private String nome;
    private String email;
    private String nascimento;


    public Pessoas(Integer id, String nome, String email, String nascimento) {
        super();
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
    }

    public Pessoas() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoas pessoas = (Pessoas) o;
        return id.equals(pessoas.id) && nome.equals(pessoas.nome) && email.equals(pessoas.email) && nascimento.equals(pessoas.nascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email, nascimento);
    }
}



