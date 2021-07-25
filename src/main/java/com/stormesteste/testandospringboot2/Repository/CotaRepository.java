package com.stormesteste.testandospringboot2.Repository;


import com.stormesteste.testandospringboot2.domain.Cota;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface CotaRepository extends CrudRepository<Cota, String> {
}
