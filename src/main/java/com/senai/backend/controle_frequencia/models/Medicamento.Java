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

    
     public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

      public String getlote() {
        return lote;
    }

    public void setlote(String lote) {
        this.lote = lote;
    }

      public String getvalidade() {
        return validade;
    }

    public void setvalidade(String validade) {
        this.validade = validade;
    }

      public String gettipo() {
        return tipo;
    }

    public void settipo(String tipo) {
        this.tipo = tipo;
    }

    public String getcondicoes_armazenamento() {
        return condicoes_armazenamento;
    }

    public void setcondicoes_armazenamento(String condicoes_armazenamento) {
        this.condicoes_armazenamento = condicoes_armazenamento;
    }
}