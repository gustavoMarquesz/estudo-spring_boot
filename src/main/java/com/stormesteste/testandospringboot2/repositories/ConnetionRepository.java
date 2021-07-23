package com.stormesteste.testandospringboot2.repositories;


import com.stormesteste.testandospringboot2.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnetionRepository extends JpaRepository<Pessoa, Integer> {
}
