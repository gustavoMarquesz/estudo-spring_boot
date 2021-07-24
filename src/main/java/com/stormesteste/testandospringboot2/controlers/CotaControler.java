package com.stormesteste.testandospringboot2.controlers;


import com.stormesteste.testandospringboot2.Repository.CotaRepository;
import com.stormesteste.testandospringboot2.domain.Cota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/cadastro")
public class CotaControler {

    @Autowired
    private CotaRepository repo;

    @RequestMapping(method = RequestMethod.GET)
    public String formC(){
        return "cadastro";
    }


    @RequestMapping(method = RequestMethod.POST)
    public String postar(Cota cota){
        repo.save(cota);
        return "redirect:/cadastro";
    }

}
