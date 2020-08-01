package com.example.CRUDSpringTh.Controllers;

import com.example.CRUDSpringTh.Model.UsuarioModel;
import com.example.CRUDSpringTh.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormUsuarioController {

    @Autowired
    private UsuarioService service;

    @RequestMapping( value = "/nuevoUsuario", method = RequestMethod.GET)
    public String formNuevoUsuario(Model model){
        UsuarioModel usuario = new UsuarioModel();
        model.addAttribute("title", "Nuevo usuario");
        model.addAttribute("desc", "Favor de llenar todos los campos necesarios");
        model.addAttribute("usuario", usuario);
        return "formUsuarioNuevo";
    }

    @RequestMapping(value = "/guardarUsuario", method = RequestMethod.POST)
    public String guardarUsuario(UsuarioModel usuarioModel){
        service.guardarUsuario(usuarioModel);
        return "redirect:/usuarios";
    }

}
