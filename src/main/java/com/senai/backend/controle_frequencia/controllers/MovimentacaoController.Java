package com.saeb.backend.farmacia_saep.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saeb.backend.farmacia_hospitalar.models.Movimentacao;
import com.saeb.backend.farmacia_hospitalar.services.MovimentacaoService;

@RestController
@RequestMapping("/Movimentacao")
public class MovimentacaoController {

    @Autowired
    public MovimentacaoService MovimentacaoService;

    @GetMapping
    public List<Movimentacao> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Movimentacao salvar(RequestBody Movimentacao medicamento) {
        return repository.save(medicamento);
    }
   
}