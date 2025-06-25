package org.example.demoobjetos.controller;

import jakarta.validation.Valid;
import org.example.demoobjetos.DTO.RegistroObjetosDTO;
import org.example.demoobjetos.RemitenteExeption.RegistroException;
import org.example.demoobjetos.model.RegistroObjetos;
import org.example.demoobjetos.service.IServicioRegistro;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/registroObjetos")

public class controllerRegistro {
    @Autowired
    private IServicioRegistro servicioRegistro;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/all")
    public List<RegistroObjetosDTO> getAll() {
        return servicioRegistro.getAll().stream()
                .map(registroObjetos -> modelMapper.map(registroObjetos, RegistroObjetosDTO.class))
                .collect(Collectors.toList());
    }


    @PostMapping("/save")
    public RegistroObjetosDTO save(@RequestBody @Valid RegistroObjetosDTO registroObjetosDTO)  {
        RegistroObjetos registroObjetosDB = modelMapper.map(registroObjetosDTO, RegistroObjetos.class);
        RegistroObjetos registroObjetos = servicioRegistro.save(registroObjetosDB);
        return modelMapper.map(registroObjetos, RegistroObjetosDTO.class);
    }


    @PutMapping("/update")
    public RegistroObjetos update(@RequestBody RegistroObjetos registroObjetos) {
        return servicioRegistro.update(registroObjetos);


    }

    @GetMapping("/{id}")
    public RegistroObjetosDTO get(@PathVariable(value="id") Integer id) throws RegistroException {
        return modelMapper.map(servicioRegistro.findOne(id),RegistroObjetosDTO.class);
    }


    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {servicioRegistro.delete(id);
    }
}
