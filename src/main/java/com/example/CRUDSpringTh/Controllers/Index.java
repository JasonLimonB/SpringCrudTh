package com.example.CRUDSpringTh.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {

    @RequestMapping(value = "/")
    public String index(Model model){
        String title = "Inicio";
        String textoBienvenida = "Bienvenido a una prueba de un Crud usando Springboot, Thymeleaf y Mysql";
        model.addAttribute("title", title);
        model.addAttribute("textoBievenida", textoBienvenida);
        return "index";
    }

}
