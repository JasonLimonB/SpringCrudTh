package com.example.CRUDSpringTh.Controllers;

import com.example.CRUDSpringTh.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EditarUsuario {

    @Autowired
    IUsuarioRepository usuarioRepository;

    @RequestMapping( value = "/nuevoUsuario/{id}", method = RequestMethod.GET)
    public String ediarU(@PathVariable (value = "id") Long id, Model model){
        model.addAttribute("usuario", usuarioRepository.findById(id));
        return "formUsuarioNuevo";
    }

}
