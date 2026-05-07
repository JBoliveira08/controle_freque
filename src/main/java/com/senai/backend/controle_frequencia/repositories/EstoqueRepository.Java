package com.senai.backend.controle_frequencia.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.backend.controle_frequencia.models.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque, Integer> {
   
}