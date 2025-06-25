package org.example.demoobjetos.service;

import org.example.demoobjetos.RemitenteExeption.RegistroException;
import org.example.demoobjetos.model.RegistroObjetos;
import org.example.demoobjetos.repository.IRepoRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioRegistro implements IServicioRegistro {
    @Autowired
    private IRepoRegistro repoRegistro;

    @Override
    public List<RegistroObjetos> getAll() {

        return repoRegistro.findAll();
    }


    @Override
    public RegistroObjetos save(RegistroObjetos registroObjetos) {
        return repoRegistro.save(registroObjetos);
    }



    @Override
    public void delete(Integer id) {
        repoRegistro.deleteById(id);
    }

    @Override
    public RegistroObjetos update(RegistroObjetos registroObjetos) {
        RegistroObjetos r = repoRegistro.findById(Math.toIntExact(registroObjetos.getId())).orElse(null);
        if (r != null) {
            return repoRegistro.saveAndFlush(registroObjetos);
        }
        return null;
    }

    @Override
    public RegistroObjetos findOne(Integer id) throws RegistroException {
        RegistroObjetos r = repoRegistro.findById(id).orElse(null);
        if (r != null) {
            return r;
        }
        throw new RegistroException("No existe un registro con este id:" + id);
    }
}
