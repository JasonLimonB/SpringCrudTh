package com.example.CRUDSpringTh.Controllers;

import com.example.CRUDSpringTh.Model.UsuarioModel;
import com.example.CRUDSpringTh.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @RequestMapping( value = "/usuarios" , method = RequestMethod.GET )
    public String usuarios(Model model){
        String title = "Listado de usuarios";

        model.addAttribute("title", title);
        model.addAttribute("usuarios", usuarioService.obtenerUsuarios());
        return "usuarios";
    }


}
