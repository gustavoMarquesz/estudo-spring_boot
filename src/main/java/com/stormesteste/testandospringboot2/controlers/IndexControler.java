package com.stormesteste.testandospringboot2.controlers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = ("/"))

public class IndexControler {

    public String index(){
        return "ok";
    }

}