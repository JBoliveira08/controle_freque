package com.senai.backend.controle_frequencia.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="movimentacao")
public class Movimentacao {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="entrada")
    private LocalDate dataNascimento;

    @Column(name="saida")
    private LocalDate dataNascimento;

     @Column(name="registro")
    private LocalDate dataNascimento;

     @Column(name="usuario")
    private LocalDate dataNascimento;

     @Column(name="data")
    private LocalDate dataNascimento;

    
}
