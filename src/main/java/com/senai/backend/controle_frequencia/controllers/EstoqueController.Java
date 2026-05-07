package com.saeb.backend.farmacia_saep.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saeb.backend.farmacia_hospitalar.models.Estoque;
import com.saeb.backend.farmacia_hospitalar.services.EstoqueService;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {

    @Autowired
    public EstoqueService EstoqueService;

    @GetMapping
    public List<Estoque> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Estoque salvar(RequestBody Estoque medicamento) {
        return repository.save(medicamento);
    }
   
}