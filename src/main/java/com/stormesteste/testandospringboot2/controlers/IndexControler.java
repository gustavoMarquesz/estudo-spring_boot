package com.stormesteste.testandospringboot2.controlers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = ("/"))

public class IndexControler {


    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "index";
    }

}
