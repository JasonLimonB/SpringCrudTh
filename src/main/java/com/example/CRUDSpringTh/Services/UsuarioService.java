package com.example.CRUDSpringTh.Services;

import com.example.CRUDSpringTh.Model.UsuarioModel;
import com.example.CRUDSpringTh.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    IUsuarioRepository usuarioRepositoryImp;

    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepositoryImp.findAll();
    }

    public void guardarUsuario( @RequestBody UsuarioModel usuario ){
        usuarioRepositoryImp.save(usuario);
    }

    public void eliminarUsuario( @RequestBody UsuarioModel usuario ){
        usuarioRepositoryImp.delete(usuario);
    }

    public Optional<UsuarioModel> buscarUsuario(@RequestBody UsuarioModel usuario){
        return usuarioRepositoryImp.findById(usuario.getId());
    }

}
