package com.stormesteste.testandospringboot2.servicos;


import com.stormesteste.testandospringboot2.domain.Pessoa;
import com.stormesteste.testandospringboot2.repositories.ConnetionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Buscar {

    @Autowired
    private ConnetionRepository repo;

    public Pessoa find(Integer id){
        Optional<Pessoa> obj = repo.findById(id);
        return obj.orElse(null);
    }




}
