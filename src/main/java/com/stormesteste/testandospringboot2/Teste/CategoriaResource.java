package com.stormesteste.testandospringboot2.Teste;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping(value ="/categorias")
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public String testandoRest(){
        return "Rest testado com sucesso";
    }

}
