package com.example.CRUDSpringTh.Controllers;

import com.example.CRUDSpringTh.Model.UsuarioModel;
import com.example.CRUDSpringTh.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EliminarUsuarios {

    @Autowired
    UsuarioService usuarioService;

    @RequestMapping( value = "/eliminar/{id}", method = RequestMethod.GET)
    public String eliminarU(UsuarioModel usuarioModel){
        usuarioService.eliminarUsuario(usuarioModel);
        return "redirect:/usuarios";
    }

}
