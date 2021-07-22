package com.stormesteste.testandospringboot2.com.stormpacotes;

import java.io.Serializable;
import java.util.Objects;

public class Pessoas implements Serializable {
    private final long serialVersionUGI = 1L;


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

    public Pessoas(){

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

    public long getSerialVersionUGI() {
        return serialVersionUGI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoas pessoas = (Pessoas) o;
        return serialVersionUGI == pessoas.serialVersionUGI && id.equals(pessoas.id) && nome.equals(pessoas.nome) && email.equals(pessoas.email) && nascimento.equals(pessoas.nascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialVersionUGI, id, nome, email, nascimento);
    }
}
