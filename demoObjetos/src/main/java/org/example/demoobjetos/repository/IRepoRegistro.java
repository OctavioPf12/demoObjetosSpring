package org.example.demoobjetos.repository;

import org.example.demoobjetos.model.RegistroObjetos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepoRegistro extends JpaRepository<RegistroObjetos, Integer> {
}
