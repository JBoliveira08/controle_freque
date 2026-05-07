package com.senai.backend.controle_frequencia.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="medicamento")
public class Medicamento {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="lote")
    private LocalDate dataNascimento;

    @Column(name="validade")
    private LocalDate dataNascimento;

    @Column(name="tipo")
    private LocalDate dataNascimento;

    @Column(name="condições_armazenamento")
    private LocalDate dataNascimento;

}