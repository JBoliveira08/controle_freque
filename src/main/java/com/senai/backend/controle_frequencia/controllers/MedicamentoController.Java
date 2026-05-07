package com.saeb.backend.farmacia_saep.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saeb.backend.farmacia_hospitalar.models.Medicamentos;
import com.saeb.backend.farmacia_hospitalar.services.MedicamentosService;

@RestController
@RequestMapping("/medicamentos")
public class MedicamentosController {

    @Autowired
    public MedicamentosService medicamentosService;

    @GetMapping
    public List<Medicamentos> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Medicamentos salvar(RequestBody Medicamentos medicamento) {
        return repository.save(medicamento);
    }
   
}