package org.example.demoobjetos.service;

import org.example.demoobjetos.RemitenteExeption.RegistroException;
import org.example.demoobjetos.model.RegistroObjetos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServicioRegistro {
    public List<RegistroObjetos> getAll();

    public RegistroObjetos save(RegistroObjetos registroObjetos);

    public void delete(Integer id);

    public RegistroObjetos update(RegistroObjetos registroObjetos);

    public RegistroObjetos findOne(Integer id) throws RegistroException;


}
