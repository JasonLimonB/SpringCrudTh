package com.example.CRUDSpringTh.repository;

import com.example.CRUDSpringTh.Model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends CrudRepository<UsuarioModel, Long> {



}
