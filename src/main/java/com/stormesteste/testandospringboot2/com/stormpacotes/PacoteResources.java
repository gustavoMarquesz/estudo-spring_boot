package com.stormesteste.testandospringboot2.com.stormpacotes;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/pessoas")
public class PacoteResources {

    @RequestMapping(method = RequestMethod.GET)
    public List<Pessoas> pessoasPag(){
        Pessoas p1 = new Pessoas(1,"Gustavo","gustavo99a@hotmail.com","03/04/2000");
        Pessoas p2 = new Pessoas(2,"ksokods","ksosks@hotmail.com","30/03/5000");

        List<Pessoas> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);


        return lista;
    }

}
