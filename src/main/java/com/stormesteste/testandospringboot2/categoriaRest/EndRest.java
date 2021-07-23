package com.stormesteste.testandospringboot2.categoriaRest;


import com.stormesteste.testandospringboot2.domain.Cota;
import com.stormesteste.testandospringboot2.servicos.Buscar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pessoa")
public class EndRest {

    @Autowired
    private Buscar executar;


    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> achar(@PathVariable Integer id){
        Cota obj = executar.find(id);
        return ResponseEntity.ok().body(obj);
    }

}
