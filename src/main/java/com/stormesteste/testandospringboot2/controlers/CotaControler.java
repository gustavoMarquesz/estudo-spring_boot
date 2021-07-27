package com.stormesteste.testandospringboot2.controlers;


import com.stormesteste.testandospringboot2.Repository.CotaRepository;
import com.stormesteste.testandospringboot2.domain.Cota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CotaControler {

    @Autowired
    private CotaRepository repo;

    @RequestMapping(value = "/cadastro",method = RequestMethod.GET)
    public String formC(){
        return "cadastro";
    }


    @RequestMapping(value = "/cadastro",method = RequestMethod.POST)
    public String postar(Cota cota){
        repo.save(cota);
        return "redirect:/cadastro";
    }


    @RequestMapping(value = "/cotas")
    public ModelAndView lista(){
        ModelAndView mv = new ModelAndView("index");
        Iterable<Cota> eventos = repo.findAll();
        mv.addObject("eventos",eventos);
        return mv;
    }


}
